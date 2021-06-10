import java.util.Scanner;

/**
 * Ejercicio2
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor");
        int V = scanner.nextInt();
        int numero = V;
        for (int i = 0; i < V; i++) {
            System.out.println(numero);
            numero -=1;
        }
    }
    
}