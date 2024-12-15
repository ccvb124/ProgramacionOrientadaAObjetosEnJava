import java.util.Scanner;

public class SumarDigitosDeUnNumeroEntero{


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Este programa realiza la suma de los dígitos de un número entero");
        System.out.println();

        System.out.println("digite el numero");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println();
        System.out.println("el numero digitado es:   "+  numero);
        System.out.println();


        while (numero != 0) {
            suma += numero % 10;

            numero /= 10;
            
            
        }

        System.out.println("el numero de los digitos del numero es igual a:  " + suma);
        System.out.println();

    }

    

}