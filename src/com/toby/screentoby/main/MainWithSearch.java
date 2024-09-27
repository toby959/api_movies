package com.toby.screentoby.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.toby.screentoby.exception.ErrorConversionException;
import com.toby.screentoby.model.Title;
import com.toby.screentoby.model.TitleOmdb;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Cargar variables de entorno
        Dotenv dotenv = Dotenv.load();
        String API_KEY = dotenv.get("API_KEY");
        String BASE_URL = "http://www.omdbapi.com/?t=";


        Scanner scanner = new Scanner(System.in);
        List<Title> titleList = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        // Definir la ruta de la carpeta donde se guardarán los títulos
        String folderPath = "src/title"; // Cambia esto a tu ruta deseada
        File folder = new File(folderPath);

        // Crear la carpeta si no existe
        if (!folder.exists()) {
            folder.mkdirs();
        }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        while (true) {
            System.out.println("Escriba el nombre de una pelicula: ");
            String search = scanner.nextLine();

            if (search.equalsIgnoreCase("salir")) {
                break;
            }
//            String url = BASE_URL + search
//                    .replace(" ", "+") + "&apikey=" + API_KEY;(vercion simple, para cubrir espacios en blanco)

            try {
                // Codificar el nombre de la película
                String encodedSearch = URLEncoder.encode(search, StandardCharsets.UTF_8);
                String url = BASE_URL + encodedSearch + "&apikey=" + API_KEY;


//            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TitleOmdb mytitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(mytitleOmdb);


                Title mytitle = new Title(mytitleOmdb);
                System.out.println("Título ya convertido =>>> " + mytitle + " <<<=");

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                // Guardar el título en un archivo dentro de la carpeta especificada
                saveTitleToFile(mytitle.toString(), folderPath);

                titleList.add(mytitle);
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

          /*      FileWriter writing = new FileWriter("movies.txt");
                writing.write(mytitle.toString());
                writing.close();

           */
                // titleList.add(mytitle);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI, verifique la dirección.");
            } catch (ErrorConversionException e) {
                System.out.println(e.getMessage());
            }
        }
        //  System.out.println(titleList);
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        scanner.close();
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//        FileWriter writing = new FileWriter("title.json");
//        writing.write(gson.toJson(titleList));
//        writing.close();

//        System.out.println("Finalizó la ejecución del programa ^_^ ");
//    }
    }
        private static void saveTitleToFile(String title, String folderPath) {
            File file = new File(folderPath + "/movies.txt");
            boolean alreadyExists = false;

            // Verificar si el título ya existe en el archivo
            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(title)) {
                            alreadyExists = true; // El título ya existe
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo: " + e.getMessage());
                }
            }

            // Si no existe, guardar el título
            if (!alreadyExists) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write(title);
                    writer.newLine(); // Agregar nueva línea después del título
                    System.out.println("Título guardado: " + title);
                } catch (IOException e) {
                    System.out.println("Error al guardar el título: " + e.getMessage());
                }
            } else {
                System.out.println("El título ya está guardado: " + title);
            }
        }


    }

