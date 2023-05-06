package be.romek.test.InterfaceClients;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      Client[] clients = new Client[0];
      String rep = " ";
      int nbClients = 0;
      int menu=0;

        while (menu != 3) {
        System.out.println("bienvenue dans le gestionnaire de clients, faites votre choix:");
        System.out.println("1. Ajouter des clients");
        System.out.println("2. Afficher les clients enregistrés");
        System.out.println("3. Quitter");
        menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("combien de clients voulez-vous entrer ? ");
                    nbClients = sc.nextInt();
                    clients = new Client[nbClients];

                    for (int i = 0; i < nbClients; i++) {
                        Client nClient = new Client();
                        System.out.println("client n° : " + (i + 1));
                        System.out.print("nom : ");
                        nClient.setNom(sc.next());
                        System.out.print("prenom : ");
                        nClient.setPrenom(sc.next());
                        System.out.print("age : ");
                        nClient.setAge(sc.next());
                        System.out.print("adresse : ");
                        nClient.setAdresse(sc.next());
                        System.out.print("ville : ");
                        nClient.setVille(sc.next());
                        System.out.print("code postal : ");
                        nClient.setCodePostal(sc.next());
                        clients[i] = nClient;
                    }
                    System.out.println("client(s) enregistré(s) ! ");
                    break;
                case 2:
                    for (int i = 0; i < nbClients; i++) {
                        System.out.println("Client n° " + (i + 1) + clients[i].toString());
                    }
                    break;
            }

        }
        System.out.println("au revoir");

    }
}
