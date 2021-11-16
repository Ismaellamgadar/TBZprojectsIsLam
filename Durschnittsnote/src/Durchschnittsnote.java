import java.util.Scanner;

public class Durchschnittsnote {

    public static void main(String[] args) {


        int n;    //Anzahl Noten
        float[] num = new float[100];
        float sum = 0.0f, avg;

        System.out.print("Geben sie ihre Anzahl Noten an: ");
        n = STDIN_SCANNER.nextInt();        //Scannt Eingabe dh. Anzahl Noten

        while(n > 10 || n < 1) {                                                // Der Benutzer kann minimal 1 und maximal 10 Noten angeben.
            System.out.println("Error! Nummer muss zwischen 1 und 10 sein");    // Text falls dies nicht respektiert wird.
            System.out.print("Geben sie ihre Anzahl noch mal an: ");
            n = STDIN_SCANNER.nextInt();
        }
        for(int i = 0; i < n; ++i) {        // solang i kleiner als die Anzahl angegebenen Noten ist, wird diese Schlaufe wiederholt.
            System.out.print((i + 1) + ". Note: ");
            num[i] = STDIN_SCANNER.nextFloat();
            sum += num[i];
        }
                              // avg ist der Durchschnitt(Average)

    }

    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}