package com.proyecto.converciondeunidades;
import com.proyecto.converciondeunidades.longitud.ConversionLongitud;
import java.util.Scanner;


public class ConvertidorDeLongitud{
    public void Longitud(double valorAConvertir){
    

    

        ConversionLongitud nuevaConversion = new ConversionLongitud();
        Scanner teclado = new Scanner(System.in);
        
        String menuOpciones;
        int opcion;
       
        menuOpciones = """
        seleccione la opcion a ejecutar:
                1-Metros a Kilometros
                2-kilometros a metros
                3-Metros a Centimetros
                4-Centimetros a metros
                5-Metros a Millas
                6-Millas a Metros
                7-centimetros a millas
                8-Millas a centimetros
                9-Kilometros a millas
                10-Millas a kilometros
                
                Ingrese opcion:""";
        nuevaConversion.Imprimir(menuOpciones);
        opcion = teclado.nextInt();
        nuevaConversion.Imprimir("-------------------------------------------");

       

        switch (opcion) {
            case 1:
                nuevaConversion.setConvertirMetrosAaKilometros(valorAConvertir);
                nuevaConversion.Imprimir(  valorAConvertir + " m son iguales a: "+ nuevaConversion.getConvertirMetrosAaKilometros() + " Km");
            break;

            case 2:
                nuevaConversion.setConvertirKilometrosAaMetros(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " Km son iguales a: " + nuevaConversion.getConvertirKilometrosAaMetros() + " m");
            break;

            case 3:
                nuevaConversion.setConvertirMetrosAaCentimetros(valorAConvertir);
                nuevaConversion.Imprimir(  valorAConvertir + " m son iguales a: " + nuevaConversion.getConvertirMetrosAaCentimetros() + " cm");
            break;

            case 4:
                nuevaConversion.setConvertirCentimetrosAaMetros(valorAConvertir);
                nuevaConversion.Imprimir(  valorAConvertir + " cm son iguales a: " + nuevaConversion.getConvertirCentimetrosAaMetros() + " m");
            break;

            case 5:

                nuevaConversion.setConvertirMetrosAaMillas(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " m son iguales a: " +  nuevaConversion.getConvertirMetrosAaMillas() + " mi");
            break;
                
            case 6:
                nuevaConversion.setConvertirMillasAaMetros(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " mi son iguales a: " +  nuevaConversion.getConvertirMillasAaMetros() + " m");
            break;

            case 7:
                nuevaConversion.setConvertirCentimetrosAaMillas(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " cm son iguales a: " +  nuevaConversion.getConvertirCentimetrosAaMillas() + " mi");
            break;
                

            case 8:
                nuevaConversion.setConvertirMillasAaCentimetros(valorAConvertir);
                nuevaConversion.Imprimir(valorAConvertir + " mi son iguales a: " + nuevaConversion.getConvertirMillasAaCentimetros() + " cm");
            break;

            case 9:
                nuevaConversion.setConvertirKilometrosAaMillas(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " Km son iguales a: " +  nuevaConversion.getConvertirKilometrosAaMillas()+ " mi");
            break;

            case 10:
                nuevaConversion.setConvertirMillasAaKilometros(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " mi son iguales a: " +  nuevaConversion.getConvertirMillasAaKilometros() + " Km");
            break;

            default:                     
                System.out.println("opcion no valida");
                break;
        }   


        

        





        
    


        
  

    }
}