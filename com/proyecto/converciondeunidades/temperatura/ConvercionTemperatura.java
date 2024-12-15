package com.proyecto.converciondeunidades.temperatura;

public class ConvercionTemperatura {
    private double valorConversion;

    public void Imprimir(String texto){
        System.out.println(texto);
    }


    public double  getConvertirCelsiusAaFahrenheit(){
        return valorConversion;
    }
       
    public void setConvertirCelsiusAaFahrenheit(double medida){
        valorConversion = ( medida *1.8) + 32;
    }

    public double  getConvertirFahrenheitAaCelsius(){
        return valorConversion;
    }
       
    public void setConvertirFahrenheitAaCelsius(double medida){
        valorConversion = (medida - 32 ) / 1.8;
    }
    


    
}

