import java.util.Scanner;

public class Durchschnittsnote {

    public static void main(String[] args) {

        int erstenote;
        int zweitenote;
        double addiert;
        int n;
        float[] num = new float[100];
        float sum = 0.0f, avg;

        System.out.print("Geben sie ihre Anzahl Noten an: ");
        n = STDIN_SCANNER.nextInt();

        while(n > 10 || n < 1) {                    //
            System.out.println("Error! Nummer muss zwischen 1 und 10 sein");
            System.out.print("Geben sie ihre Anzahl noch mal an: ");
            n = STDIN_SCANNER.nextInt();
        }
        for(int i = 0; i < n; ++i) {
            System.out.print((i + 1) + ". Note: ");
            num[i] = STDIN_SCANNER.nextFloat();
            sum += num[i];
        }
        avg = sum / n;
        System.out.printf("\nDurchschnitt = %.2f \n\n\n", avg);
    }

    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}