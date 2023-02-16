import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Introdueix un caràcter: ");
        char car = scanner.next().charAt(0);

        String resultat = frase.replace(car, '*');

        System.out.println("Frase amb les ocurrencies del caràcter substituïdes per :");
        System.out.println(resultat);
    }
}