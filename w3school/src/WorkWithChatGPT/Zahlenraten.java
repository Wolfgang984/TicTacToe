package WorkWithChatGPT;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {


        System.out.println("Herzlich willkommen beim Zahlenratespiel");

        zahlenratespiel();

        System.out.println("Möchten sie nochmal spielen? y or n ");


        Scanner scanner2 = new Scanner((System.in));
        System.out.println();
        String pressYorN = String.valueOf(scanner2.nextInt());


        if(pressYorN == "y") {
            zahlenratespiel();
        }else
        {
            System.out.println("Wünsche noch einen schönen Tag");
        }


    }

    public static void zahlenratespiel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte versuche die Random Zahl zu erraten");
        int Zahlenraten = scanner.nextInt();

        Random random = new Random();
        int zufallsZahl = random.nextInt(10) + 1;

        while (zufallsZahl != 0) {

            if (Zahlenraten == zufallsZahl) {
                System.out.println("Glückwunsch du hast die richtige Zahl erraten, die Zahl lautet " + zufallsZahl);
                break;
            } else {
                System.out.println("Die Zahl war nicht richtig bitte versuch es noch einmal");
                Zahlenraten = scanner.nextInt();
            }
        }

    }


}
