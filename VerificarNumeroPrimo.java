import com.proyecto.EsPrimo;
import java.util.Scanner;

public class VerificarNumeroPrimo {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EsPrimo validarSiEsPrimo = new EsPrimo();

        System.out.println("Este programa verifica si el número ingresado es primo o no");
        System.out.println();

        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        System.out.println();
        
        if (validarSiEsPrimo.esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        System.out.println();
        System.out.println();

    }
}