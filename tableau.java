
import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Creation du premier tableau
        int[] notes = {10, 15, 13, 12};

        // 2. Creation des autres tableaux
        int[] notes2 = new int[notes.length];
        int[] somme = new int[notes.length];

        int choix;
        boolean tableau2Rempli = false;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher le premier tableau");
            System.out.println("2. Ajouter un deuxieme tableau");
            System.out.println("3. Calculer la somme des deux tableaux");
            System.out.println("4. Quitter");
            System.out.print("Donner votre choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Premier tableau :");

                    System.out.println("La longueur du tableau est : " + notes.length);

                    for (int i = 0; i < notes.length; i++) {
                        System.out.println("La note est : " + notes[i]);
                    }
                    break;

                case 2:
                    System.out.println("Saisir les valeurs du deuxieme tableau :");

                    for (int i = 0; i < notes2.length; i++) {
                        System.out.print("Donner la valeur de la case " + i + " : ");
                        notes2[i] = sc.nextInt();
                    }

                    tableau2Rempli = true;

                    System.out.println("Deuxieme tableau :");

                    for (int i = 0; i < notes2.length; i++) {
                        System.out.println("La note est : " + notes2[i]);
                    }
                    break;

                case 3:

                    if (tableau2Rempli == true) {

                        // Calculer la somme
                        for (int i = 0; i < somme.length; i++) {
                            somme[i] = notes[i] + notes2[i];
                        }

                        System.out.println("Troisieme tableau (Somme) :");

                        for (int i = 0; i < somme.length; i++) {
                            System.out.println("La note est : " + somme[i]);
                        }

                    } else {
                        System.out.println("Veuillez d'abord saisir le deuxieme tableau !");
                    }
                    break;

                case 4:
                    System.out.println("Fin du programme !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 4);

        sc.close();
    }
}
