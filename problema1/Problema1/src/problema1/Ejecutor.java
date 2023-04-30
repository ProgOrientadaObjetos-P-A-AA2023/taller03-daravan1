/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import terreno.Terreno;

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

        Terreno terr = new Terreno();

        double ancho = 21.6;
        double largo = 35.4;
        double valorMetroCuadrado = 2;

        terr.establecerAncho(ancho);
        terr.establecerLargo(largo);
        terr.establecerValorMetroCuadrado(valorMetroCuadrado);
        terr.calcularArea();
        terr.calcularCostoTerreno();

        System.out.printf("""
                          Calculo Costo Terreno
                          Ancho de terreno: %.2f metros
                          Largo del terreno: %.2f metros
                          Valor del metro cuadrado: %.2f dolares
                          Area del terreno: %.2f metros cuadrados
                          Costo total del terreno: %.2f dolares\n""",
                terr.obtenerAncho(), terr.obtenerLargo(),
                terr.obtenerValorMetroCuadrado(), terr.obtenerArea(),
                terr.obtenerCostoTerreno());

    }

}
