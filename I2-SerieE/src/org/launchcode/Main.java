package org.launchcode;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int yesno;

        do {
            int Harasse = 0;

            Scanner input = new Scanner(System.in);
            System.out.print("Anzahl Flaschen: ");
            int Flaschen = input.nextInt();

            if (Flaschen <= 0) {
                System.out.println("Sie brauchen keinen Harass!");
                yesno = 1;
            } else {
                while (Flaschen > 0) {

                    Flaschen = Flaschen - 6;
                    Harasse++;

                }
                System.out.println("Sie brauchen " + Harasse + " Harassen");
                yesno = 0;
            }
            if (yesno == 0) {
                Scanner weiter = new Scanner(System.in);
                System.out.println("Start again(0/1)");
                yesno = input.nextInt();

            }
        }
        while (yesno == 1) ;

    }
}
