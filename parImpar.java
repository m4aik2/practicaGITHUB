import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        // Llegir els 3 nombres com a paràmetres d'entrada
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix tres nombres separats per una coma: ");
        String input = scanner.nextLine();

        int[] nums = new int[3];
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ',') {
                nums[index] = Character.getNumericValue(c);
                index++;
            }
        }

        // Calcular la suma dels 3 nombres
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }

        // Comprovar si la suma és parella o imparella
        String parellOImparell = (suma % 2 == 0) ? "parell" : "imparell";

        // Mostrar la suma i si és parella o imparella
        System.out.println("La suma dels 3 números és: " + suma);
        System.out.println("La suma és " + parellOImparell + ".");
    }
}
