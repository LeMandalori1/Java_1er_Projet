package Java_1er_Projet;

public class Main {
   
    public static void main(String[] args) {

        //Pour une constante, on met "final" devant

        final String meilleurPays = "France";

        //Pour les nombres à virgules, "float" est bien mais deux fois moins précis que "double" 

        double nombre2 = 123.123456;

        //Si je dois faire des divisions, je dois utiliser absolument des double et pas des int

        float a = 2;

        float b = 5;

        float c = a/b;

        System.out.println(c);

        //Le booléen (True ou False)

        boolean imVeryGoodInJava = false;

        boolean noImJustJoking = true;

        imVeryGoodInJava = true;

        //Les Strings

        String stringVide = "";

        final int nombreDeCouleursDrapeauFrançais = 3;
       
        String text1 = "Vive la France !!";

        String text2 = text1 + " Ouais. \n" + nombreDeCouleursDrapeauFrançais + " couleurs et c'est tout.";

        System.out.println(text2);

        int numberOfVoyelles = 0;

        double pourcentageOfVoyelles = 0.0;

       //Premier commentaire de ma vie en Java
    }
 }