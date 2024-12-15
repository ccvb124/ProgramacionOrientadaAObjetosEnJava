//como millas a kilómetros, libras a kilogramos o grados Fahrenheit a Celsius. 
//Utilice métodos separados para cada tipo de conversión.
import com.proyecto.converciondeunidades.ConvertidorDeLongitud;
import com.proyecto.converciondeunidades.ConvertidorDeMasa;
import com.proyecto.converciondeunidades.ConvertidorDeTemperatura;
import java.util.Scanner;

public class ConvertirUnidadesDeMedida {
    public static void main(String[] args) {
        ConvertidorDeLongitud convertirlongitud = new ConvertidorDeLongitud();   
        ConvertidorDeMasa convertirMasa =new ConvertidorDeMasa();
        ConvertidorDeTemperatura convertirTemperatura = new ConvertidorDeTemperatura();
        Scanner teclado = new Scanner(System.in);
        String menu;
        int opcion;

        menu = """
                1-Longitud
                2-Masa (peso)
                3-Temperatura
                

                9-Finalizar
             """;        
        opcion = 0;

        System.out.println("Este programa realiza conversiones entre diferentes unidades de medida ");
        System.out.println();
        


        while (opcion !=9) {
            System.out.println("para realizar la conversion de unidades de medicion seleccione la categoria:");
            System.out.println(menu);
            opcion = teclado.nextInt();
            System.out.println("Ingrese el valor a convertir:");
            double valorAConvertir = teclado.nextDouble();
            System.out.println();
            System.out.println();
        

            switch (opcion) {
                case 1:
                    convertirlongitud.Longitud(valorAConvertir);
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    System.out.println();
                    opcion = 9;
                    System.out.println("Programa finalizado");
                break;
                case 2:               
                    convertirMasa.UniMasa(valorAConvertir);
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    System.out.println();
                    opcion = 9;
                    System.out.println("Programa finalizado");
                break;    
                case 3:
                    convertirTemperatura.Temperatura(valorAConvertir);
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    System.out.println();
                    opcion = 9;
                    System.out.println("Programa finalizado");
                break;   

                
                case 9:
                    System.out.println("Programa finalizado");


                    break;    
                    

                default:
                    System.out.println("opcion no valida");
                  break;
            }



            
        }






    }
    





    
}
