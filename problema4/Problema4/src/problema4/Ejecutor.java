/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import equipoCelulares.EquipoCelulares;

/**
 *
 * @author darav
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquipoCelulares celular = new EquipoCelulares();
        
        String sistema = "Android";
        String direccionMac = "1545SD45H";
        String informacionIMEI = "45896ERT4S";
        double tamanio = 16.5;
        double costoInicial = 500;
        double ivaPorcentaje = 12;

        celular.establecerSistema(sistema);
        celular.establecerDireccionMac(direccionMac);
        celular.establecerInformacionIMEI(informacionIMEI);
        celular.establecerTamaño(tamanio);
        celular.establecerCostoInicial(costoInicial);
        celular.establecerIvaPorcentaje(ivaPorcentaje);
        celular.calcularIvaInicial();
        celular.calcularCostoFinal();
        
        System.out.printf("""
                          Equipo de celulares
                          Celular 1
                          Sistema : %s
                          Direccion MAC: %s
                          Informacion IMEI: %s
                          Tamanio: %.2f
                          Costo inicial: %.2f
                          Iva en porcentaje: %.2f
                          Iva inicial de costo:  %.2f
                          Costo final: %.2f
                          """, celular.obtenerSistema(), 
                          celular.obtenerDireccionMac(), 
                          celular.obtenerInformacionIMEI(),
                          celular.obtenerTamanio(),
                          celular.obtenerCostoInicial(),
                          celular.obtenerIvaPorcentaje(),
                          celular.obtenerIvaInicial(),
                          celular.obtenerCostoFinal());
        
        
    }
    
}
