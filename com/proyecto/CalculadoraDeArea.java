package com.proyecto;

public class CalculadoraDeArea {
    
    private double areaCalculada;


    public void Imprimir(String texto){

        System.out.println(texto);
    }


    public double  getCalcularAreaCirculo(){
        return areaCalculada;
    }
       
    public void setCalcularAreaCirculo(double Radio){
       
        areaCalculada = Math.PI * Math.pow(Radio, 2);
    }

    public double  getCalcularAreaTriangulo(){
        return areaCalculada;
    }
       
    public void setCalcularAreaTriangulo(double base, double altura){
        
        areaCalculada = ( base* altura ) /2;
    }
    public double  getCalcularAreaCuadrado(){
        return areaCalculada;
    }
       
    public void setCalcularAreaCuadrado(double lado){
        
        areaCalculada = Math.pow(lado, 2);
    }
}
