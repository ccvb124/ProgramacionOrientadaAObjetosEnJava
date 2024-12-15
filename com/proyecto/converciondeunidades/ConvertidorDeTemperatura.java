package com.proyecto.converciondeunidades;
import com.proyecto.converciondeunidades.temperatura.ConvercionTemperatura;
import java.util.Scanner;


public class ConvertidorDeTemperatura{


    public void Temperatura(double valorAConvertir){    
          
    

    

        ConvercionTemperatura nuevaConversion = new ConvercionTemperatura();
        Scanner teclado = new Scanner(System.in);
        
        String menuOpciones;
        int opcion;
       
        menuOpciones = """
        seleccione la opcion a ejecutar:
                1-Celsius (°C) a Fahrenheit (°F)
                2-Fahrenheit (°F) a Celsius (°C)
                
                
                Ingrese opcion:""";
        nuevaConversion.Imprimir(menuOpciones);
        opcion = teclado.nextInt();
        nuevaConversion.Imprimir("-------------------------------------------");

       

        switch (opcion) {
            case 1:
                nuevaConversion.setConvertirCelsiusAaFahrenheit(valorAConvertir);
                nuevaConversion.Imprimir(  valorAConvertir + " Libras son iguales a: "+ nuevaConversion.getConvertirCelsiusAaFahrenheit() + " Kg");
            break;

            case 2:
                nuevaConversion.setConvertirFahrenheitAaCelsius(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " Kg son iguales a: " + nuevaConversion.getConvertirFahrenheitAaCelsius() + " Libras");
            break;

            

            default:                     
                System.out.println("opcion no valida");
            break;
        }    


        
  

    }
}