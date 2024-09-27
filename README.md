![](https://api.visitorbadge.io/api/VisitorHit?user=toby959&repo=api_movies&countColor=%230e75b6)
                                                                


 <h1 aling="center"> Api Movie's 🎬 </h1>
   

![Badge en Desarollo](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green)&nbsp;&nbsp;&nbsp;![Java 17](https://img.shields.io/badge/java-17-blue?logo=java)&nbsp;&nbsp;&nbsp;![Version](https://img.shields.io/badge/version-v1.0-COLOR.svg)&nbsp;&nbsp;&nbsp;[![MIT License](https://img.shields.io/badge/licencia-MIT-blue.svg)](LICENSE)&nbsp;&nbsp;&nbsp;

# Descripción 📖
Este proyecto es una API de Películas que permite realizar consultas por consola sobre títulos. Proporciona el título, 
el año de lanzamiento y la duración de las películas. Además, los datos se almacenan en una carpeta llamada 'title', 
que contiene un archivo llamado movies.txt, donde no se permiten duplicados de películas. Utiliza la  **OMDb API** 
para obtener la información de las películas junto con sus respectivos datos. Puedes encontrar más información 
sobre esta API en su [web](https://www.omdbapi.com/)
___ 

# Recursos:

| Plugin          | URL                      |
|-----------------|--------------------------|
| Gson            | https://mvnrepository.com/artifact/com.google.code.gson |
| Dotenv          | https://mvnrepository.com/artifact/io.github.cdimascio/dotenv-java| 
___
# Herramientas utilizadas 🛠️
* 1 - IntelliJ IDEA Community Edition: Un entorno de desarrollo integrado (IDE) para Java que facilita la programación.
* 2 - Java versión 17.0.10: La versión del lenguaje de programación Java utilizada en este proyecto.
* 3 - dotenv-java: Una biblioteca de Java que permite cargar variables de entorno desde un archivo .env en tu proyecto.
* 4 - Scanner: Una herramienta fundamental en Java para la entrada de datos por consola, lo que permite interactuar con el usuario de manera efectiva.
* 5 - Google Gson versión 2.11.0: Una biblioteca para convertir objetos Java a su representación JSON y viceversa.
* 6 - GsonBuilder: Clase que permite configurar y personalizar la creación de un objeto Gson, proporcionando métodos para establecer diversas configuraciones, como políticas de nombres de campos y formateo de salida.
* 7 - FieldNamingPolicy: Un enum proporcionado por la biblioteca Gson que define varias políticas de nomenclatura que se pueden aplicar a los nombres de los campos durante la serialización y deserialización.
* 8 - Pretty Printing (setPrettyPrinting()): Este método configura el objeto Gson para que produzca salida JSON legible por humanos.
* 9 - BufferedWriter: Una herramienta poderosa para escribir texto en archivos en Java, mejorando la eficiencia de las operaciones de escritura.
* 10 - FileReader: Adecuado para leer caracteres desde archivos; puede ser utilizado solo o en combinación con BufferedReader para optimizar la lectura.

___


# Ejecutar el Proyecto ⚙️
1 - Clona el repositorio en tu máquina local
``` bash
git clone
<https://github.com/toby959/api_movies.git>
```
2 - Compila y ejecuta el archivo MainWithSearch.java.
___

# Funcionalidades 📦   
#### La API de OMDb es pública y de fácil acceso; se trata de un servicio web de tipo RESTful:   
```bash
"http://www.omdbapi.com/?t="
```
#### En nuestro proyecto, se muestran los datos de: "Título", "Fecha de Lanzamiento" y "Duración". Además, los títulos se guardan en una carpeta dentro de nuestro proyecto.   
#### Interfaz de Usuario: Ofrece una interfaz simple y amigable basada en la consola.
#### Cuenta con más de 280.000 pósters, es una herramienta gratuita y de fácil acceso que permite obtener información detallada sobre películas y series.   
#### Debes registrarte para obtener la API KEY: 
```bash
http://www.omdbapi.com/?apikey=[APIKEY]& 
```
___   

![Pagina OMDb](imagen1.png)
___
# Colaboraciones 🎯
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1 - Haz un fork del repositorio: Crea una copia del repositorio en tu cuenta de GitHub.  
2 - Crea una nueva rama: Utiliza el siguiente comando para crear y cambiar a una nueva rama:
```bash
git chechout -b feature-nueva
```
3 - Realiza tus cambios: Implementa las mejoras o funcionalidades que deseas agregar.  
4 - Haz un commit de tus cambios: Guarda tus cambios con un mensaje descriptivo:
```bash 
git commit -m 'Añadir nueva funcionalidad'
```
5 - Envía tus cambios: Sube tu rama al repositorio remoto:
````bash
git push origin feature-nueva
````
6 - Abre un pull request: Dirígete a la página del repositorio original y crea un pull request para que revisemos tus cambios.

Gracias por tu interés en contribuir a este proyecto. ¡Esperamos tus aportes!
___
# Imagenes: 

![Imagen Consola](imagen2.png)


![Imagen Carpetas](imagen3.png)

## Licencia 📜

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](https://github.com/toby959/api_movies/blob/main/LICENSE) para más detalles.
