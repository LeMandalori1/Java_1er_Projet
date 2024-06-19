package Java_1er_Projet;

/**
 * Commentaire interlignes !! (Sympa)
 */

public class Deuxieme {
    
    public static void main(String[] args){

        String exemple = "Hello";

        //String est une classe, qui possède donc de nombreuses méthodes comme "toUpperCase" qui met tout en majuscule

        exemple = exemple.toUpperCase();

        //La méthode replace remplace une partie de notre texte par une autre (on premier on lui dit quelle partie remplacer, puis avec quoi)

        exemple = exemple.replace("LO", "LOLO");

        System.out.println(exemple + " world !!");
        
    }
}