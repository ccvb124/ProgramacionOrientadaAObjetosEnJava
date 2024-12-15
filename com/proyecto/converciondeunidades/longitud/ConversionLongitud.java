package com.proyecto.converciondeunidades.longitud;

public class ConversionLongitud {

    private double valorConversion;
    
    

    public void Imprimir(String texto){
        System.out.println(texto);
    }


    public double  getConvertirMetrosAaKilometros(){
        return valorConversion;
    }
       
    public void setConvertirMetrosAaKilometros(double medida){
        valorConversion = medida * Math.pow(10, (-3));
    }
    

    public double  getConvertirKilometrosAaMetros(){
        return valorConversion;
    }
       
    public void setConvertirKilometrosAaMetros(double medida){
        valorConversion = medida * Math.pow(10, (3));
    }

    public double  getConvertirMetrosAaCentimetros(){
        return valorConversion;
    }
       
    public void setConvertirMetrosAaCentimetros(double medida){
        valorConversion = medida * Math.pow(10, (3));
    }

    public double  getConvertirCentimetrosAaMetros(){
        return valorConversion;
    }
       
    public void setConvertirCentimetrosAaMetros(double medida){
        valorConversion = medida * Math.pow(10, (-3));
    }
    //

    public double  getConvertirMetrosAaMillas(){
        return valorConversion;
    }
       
    public void setConvertirMetrosAaMillas(double medida){
        valorConversion = medida / 1609.344 ;
    }

    public double  getConvertirMillasAaMetros(){
        return valorConversion;
    }
       
    public void setConvertirMillasAaMetros(double medida){
        valorConversion = medida * 1609.344;
    }

    //

    public double  getConvertirMillasAaCentimetros(){
        return valorConversion;
    }
       
    public void setConvertirMillasAaCentimetros(double medida){
        valorConversion = medida * 1609.344 * Math.pow(10, (3));
    }

    public double  getConvertirCentimetrosAaMillas(){
        return valorConversion;
    }
       
    public void setConvertirCentimetrosAaMillas(double medida){
        valorConversion =  (medida / 1609.344) * Math.pow(10, (-3));
    }
    //

    public double  getConvertirMillasAaKilometros(){
        return valorConversion;
    }
       
    public void setConvertirMillasAaKilometros(double medida){
        valorConversion = medida * 1609.344 * Math.pow(10, (-3));
    }

    public double  getConvertirKilometrosAaMillas(){
        return valorConversion;
    }
       
    public void setConvertirKilometrosAaMillas(double medida){
        valorConversion =  (medida / 1609.344) * Math.pow(10, (3));
    }







    
    
}
