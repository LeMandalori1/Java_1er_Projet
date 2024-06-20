package Java_1er_Projet;

public class Troisieme {

    //Meilleur endroit pour déclarer une variable utilisée plusieurs fois --> En dehors de fonctions, plutôt dans le classe principale

    //On rajoute "static" devant une variable pour qu'elle soit globale, accessible de partout

    static String exemple = "hello";

    public static void main(String[] args) {

        fonction1();
        fonction2();
    }

    public static void fonction1() {

        System.out.println(exemple);
    }

    public static void fonction2() {

        System.out.println(exemple);

        System.out.println("Mon autre texte est : " + Exemple.texte);

        //On peut choisir si notre élément va être accessible partout ou nul part, avec "public" ou "private", cela permet de les protéger si besoin :)
    }

}

// On peut créer d'autres classes !

class Exemple {

    public static String texte = "bye!";

    static void printText() {

        System.out.println(texte);
    }
}

/**
 * Petit cours sur les restrictions : 
 * 
 * En Java, vous devez utiliser un des mots clés suivants pour désigner un niveau de contrôle :

    public : visible pour tous et par conséquent le moins restrictif ;

    protected (protégé) : visible pour le package et l'ensemble de ses sous-classes ;

    package-protected (protégé par paquet) : généralement visible uniquement par le package dans lequel il se trouve (paramètres par défaut). Ne pas mettre de mot clé déclenche ce niveau de contrôle ;

    private (privé) : accessible uniquement dans le contexte dans lequel les variables sont définies (à l'intérieur de la classe dans laquelle il est situé).
 */

//Rappelez-vous que le paramètre "par défaut" est plus restrictif que "public" ou "protégé"