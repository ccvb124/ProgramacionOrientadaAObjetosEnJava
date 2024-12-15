package com.proyecto.converciondeunidades;
import com.proyecto.converciondeunidades.masa.ConvercionMasa;
import java.util.Scanner;


public class ConvertidorDeMasa{


    public void UniMasa(double valorAConvertir){    
          
    

    

        ConvercionMasa nuevaConversion = new ConvercionMasa();
        Scanner teclado = new Scanner(System.in);
        
        String menuOpciones;
        int opcion;
       
        menuOpciones = """
        seleccione la opcion a ejecutar:
                1-Libras a Kilogramos
                2-kilogramos a Libras
                3-kilogramos a gramos
                4-Gramos a Kilogramos
                
                Ingrese opcion:""";
        nuevaConversion.Imprimir(menuOpciones);
        opcion = teclado.nextInt();
        nuevaConversion.Imprimir("-------------------------------------------");

       

        switch (opcion) {
            case 1:
                nuevaConversion.setConvertirLibrasAaKilogramos(valorAConvertir);
                nuevaConversion.Imprimir(  valorAConvertir + " Libras son iguales a: "+ nuevaConversion.getConvertirLibrasAaKilogramos() + " Kg");
            break;

            case 2:
                nuevaConversion.setConvertirKilogramosAaLibras(valorAConvertir);
                nuevaConversion.Imprimir( valorAConvertir + " Kg son iguales a: " + nuevaConversion.getConvertirKilogramosAaLibras() + " Libras");
            break;

            case 3:
                nuevaConversion.setConvertirKilogramosAaGramos(valorAConvertir);;
                nuevaConversion.Imprimir(  valorAConvertir + " Kg son iguales a: " + nuevaConversion.getConvertirKilogramosAaGramos() + " g");
            break;

            case 4:
                nuevaConversion.setConvertirGramosAaKilogramos(valorAConvertir);
                nuevaConversion.Imprimir(  valorAConvertir + " g son iguales a: " + nuevaConversion.getConvertirGramosAaKilogramos() + " Kg");
            break;

            default:                     
                System.out.println("opcion no valida");
            break;
        }    


        
  

    }
}