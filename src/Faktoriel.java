import java.util.Scanner;
public class Faktoriel {
	public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.print("Vnesete ne-negativen integer: ");
        int n = tastatura.nextInt();

        long faktoriel = 1; // se koristi long za otpecatuvanje na rezultatot.

        for (int i = 1; i <= n; i++) {
            faktoriel *= i;
            if (faktoriel < 0) { // proveruva preliv
                System.out.println("Prelevanje predizvikuva integerot n = " + n);
                return;
            }
        }

        System.out.println(n + "! = " + faktoriel);
    }
}