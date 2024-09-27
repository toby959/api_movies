package com.toby.screentoby.calculations;

public class RecommendationFilter {

    private String recommendation;

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        }else if (classification.getClassification() >= 2){
            System.out.println("popular en el momento");
        }else {
            System.out.println("Colocalo en tu lista");
        }
    }
}
