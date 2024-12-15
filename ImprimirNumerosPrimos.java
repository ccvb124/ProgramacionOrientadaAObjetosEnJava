import com.proyecto.EsPrimo;
import java.util.Scanner;

public class ImprimirNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EsPrimo validarSiEsPrimo = new EsPrimo();
        int numero, i;

        
        System.out.print("Ingresa un número entero positivo: ");
        numero = scanner.nextInt();

        
        System.out.println("Números primos hasta " + numero + ":");
        for ( i = 2; i <= numero; i++) {
            if (validarSiEsPrimo.esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
