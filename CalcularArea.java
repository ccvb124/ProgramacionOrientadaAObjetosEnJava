import com.proyecto.CalculadoraDeArea;
import java.util.Scanner;

public class CalcularArea {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CalculadoraDeArea calcularArea = new CalculadoraDeArea();

        String menu;
        int opcion;

        System.out.println("Este programa permite calcular el área de figuras geométricas ");
        System.out.println();
        
        menu = """
        Para Calcular el area Seleccione la figura:

                1-círculo
                2-triángulo
                3-cuadrado
                

                9-Finalizar
             """;

        opcion = 0;

        while (opcion != 9) {

            System.out.println(menu);
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Valor del Radio del Circulo:");
                    double radio = teclado.nextDouble();
                    calcularArea.setCalcularAreaCirculo(radio);
                    System.out.println("-------------------------------------------");
                    System.out.println("area igual a: " + calcularArea.getCalcularAreaCirculo() );
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    System.out.println();
                    opcion = 9;
                    System.out.println("Programa finalizado");
                break;
                case 2:               
                    System.out.println("Ingrese el Valor del base del triangulo:");
                    double base = teclado.nextDouble();
                    System.out.println("Ingrese el Valor de la altura del triangulo:");
                    double altura = teclado.nextDouble();
                    calcularArea.setCalcularAreaTriangulo(base, altura);
                    System.out.println("-------------------------------------------");
                    System.out.println("area igual a: " + calcularArea.getCalcularAreaTriangulo() );
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    System.out.println();
                    opcion = 9;
                    System.out.println("Programa finalizado");
                break;    
                case 3:
                    System.out.println("Ingrese el Valor de uno de los lados del Cuadrado:");
                    double lado = teclado.nextDouble();
                    calcularArea.setCalcularAreaCuadrado(lado);
                    System.out.println("-------------------------------------------");
                    System.out.println("area igual a: " + calcularArea.getCalcularAreaCuadrado() );
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    System.out.println();
                    opcion = 9;
                    System.out.println("Programa finalizado");
                break;   

                
                case 9:
                    System.out.println("Programa finalizado");
                    System.out.println();
                    System.out.println();
                    
                    break;    
                    

                default:
                    System.out.println("opcion no valida");
                    System.out.println();
                    System.out.println();
                    
                  break;
            
            

            
        }}}






    }
    

