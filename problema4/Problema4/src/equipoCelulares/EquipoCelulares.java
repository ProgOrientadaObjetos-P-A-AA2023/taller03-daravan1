/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoCelulares;

/**
 *
 * @author darav
 */
public class EquipoCelulares {
    
    private String sistema;
    private String direccionMac;
    private String informacionIMEI;
    private double tamanio;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaInicial; 
    private double costoFinal;
    
    
    public void establecerSistema(String c){
        sistema = c;
    }
    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    public void establecerInformacionIMEI(String c){
        informacionIMEI = c;
    }
    public void establecerTamaño(double c){
        tamanio = c;
    }
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    public void establecerIvaPorcentaje(double c){
        ivaPorcentaje = c;
    }
    public void calcularIvaInicial(){
        ivaInicial = (ivaPorcentaje / 100) *  costoInicial;
    }
    public void calcularCostoFinal(){
        costoFinal = ivaInicial + costoInicial ;
    }
    
    public String obtenerSistema() {
        return sistema;
    }
    public String obtenerDireccionMac() {
        return direccionMac;
    }
    public String obtenerInformacionIMEI() {
        return informacionIMEI;
    }
    public double obtenerTamanio() {
        return tamanio;
    }
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }
    public double obtenerIvaInicial() {
        return ivaInicial;
    }
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    
    
}
