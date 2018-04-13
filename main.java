import java.util.Scanner;

public class main {
    public static void main(String[]args){
        String typeResponse, portResponse;
        String typeChoices = "csqCSQ", portChoices = "tuqTUQ";

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Would you like to open a (C)lient, (S)erver, or (Q)uit?");
            typeResponse = keyboard.next();
        } while (!(typeChoices.contains(typeResponse)));

        do {
            System.out.println("Would you like to use (T)CP, (U)DP, or (Q)uit?");
            portResponse = keyboard.next();
        } while (!(portChoices.contains(portResponse)));

        switch (typeResponse.charAt(0)) {
            case 'c': case 'C':
                // Launch client
                System.out.println("Launching client. . .");
                client c = new client();
                c.launchClient(portResponse.charAt(0));
                break;

            case 's': case 'S':
                // Launch server
                System.out.println("Launching server. . .");
                server s = new server();
                s.launchServer(portResponse.charAt(0));
                break;

            case 'q': case 'Q':
                // Quit
                System.out.println("Quitting. . .");
                break;
        }
    }
}
