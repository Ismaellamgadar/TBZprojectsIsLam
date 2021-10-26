package org.launchcode;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int yesno;
        int Harasse = 0;
        do {


            Scanner input = new Scanner(System.in);
            System.out.print("Anzahl Flaschen: ");
            int Flaschen = input.nextInt();

            if (Flaschen <= 0) {
                System.out.println("Sie brauchen keinen Harass!");
            }
            while (Flaschen > 0) {

                Flaschen = Flaschen - 6;
                Harasse++;

            }
            if (Flaschen <= 0) {
                System.out.println("Sie brauchen " + Harasse + " Harassen");

            }
            if (Flaschen == 0) {
                System.exit(0);
            }
            Scanner weiter = new Scanner(System.in);
            System.out.println("Start again(0/1)");
            yesno = input.nextInt();


        }while (yesno == 1);
    }
}
