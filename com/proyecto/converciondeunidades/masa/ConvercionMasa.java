package com.proyecto.converciondeunidades.masa;

public class ConvercionMasa {
    private double valorConversion;

    public void Imprimir(String texto){
        System.out.println(texto);
    }


    public double  getConvertirLibrasAaKilogramos(){
        return valorConversion;
    }
       
    public void setConvertirLibrasAaKilogramos(double medida){
        valorConversion = medida * 0.453592;
    }

    public double  getConvertirKilogramosAaLibras(){
        return valorConversion;
    }
       
    public void setConvertirKilogramosAaLibras(double medida){
        valorConversion = medida * 2.20462;
    }
    public double  getConvertirKilogramosAaGramos(){
        return valorConversion;
    }
       
    public void setConvertirKilogramosAaGramos(double medida){
        valorConversion = medida * Math.pow(10, (-3));
    }

    public double  getConvertirGramosAaKilogramos(){
        return valorConversion;
    }
       
    public void setConvertirGramosAaKilogramos(double medida){
        valorConversion = medida * Math.pow(10, 3);


    
}
}
