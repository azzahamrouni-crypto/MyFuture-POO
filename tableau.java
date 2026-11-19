
import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Creation du premier tableau
        System.out.println("Creation d'un tableau");

        int[] notes = {10, 15, 13, 12};

        // 2. Afficher la longueur
        System.out.println("La longueur du tableau est : " + notes.length);

        // 3. Afficher le premier tableau
        System.out.println("Tableau initial :");

        for (int i = 0; i < notes.length; i++) {
            System.out.println("La note est : " + notes[i]);
        }

        // 4. Modifier la deuxieme case
        notes[1] = 12;

        // 5. Afficher le tableau modifie
        System.out.println("Tableau apres modification :");

        for (int i = 0; i < notes.length; i++) {
            System.out.println("La note est : " + notes[i]);
        }

        // 6. Creer le deuxieme tableau
        int[] notes2 = new int[notes.length];

        // 7. Saisir les valeurs du deuxieme tableau
        System.out.println("Saisir les valeurs du deuxieme tableau :");

        for (int i = 0; i < notes2.length; i++) {
            System.out.print("Donner la valeur de la case " + i + " : ");
            notes2[i] = sc.nextInt();
        }

        // 8. Afficher le deuxieme tableau
        System.out.println("Deuxieme tableau :");

        for (int i = 0; i < notes2.length; i++) {
            System.out.println("La note est : " + notes2[i]);
        }

        // 9. Creer le troisieme tableau
        int[] somme = new int[notes.length];

        // 10. Calculer la somme des deux tableaux
        for (int i = 0; i < somme.length; i++) {
            somme[i] = notes[i] + notes2[i];
        }

        // 11. Afficher le troisieme tableau
        System.out.println("Troisieme tableau :");

        for (int i = 0; i < somme.length; i++) {
            System.out.println("La note est : " + somme[i]);
        }

        // 12. Menu
        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher le premier tableau");
            System.out.println("2. Afficher le deuxieme tableau");
            System.out.println("3. Quitter");
            System.out.print("Donner votre choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Premier tableau :");
                    for (int i = 0; i < notes.length; i++) {
                        System.out.println("La note est : " + notes[i]);
                    }
                    break;

                case 2:
                    System.out.println("Deuxieme tableau :");
                    for (int i = 0; i < notes2.length; i++) {
                        System.out.println("La note est : " + notes2[i]);
                    }
                    break;

                case 3:
                    System.out.println("Fin du programme !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 3);

        sc.close();
    }
}
