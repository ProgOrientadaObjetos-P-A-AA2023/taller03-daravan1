/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terreno;

/**
 *
 * @author darav
 */
public class Terreno {

    public double costo_terreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetroCuadrado;

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void calcularArea() {
        area = ancho * largo;
    }

    public void establecerValorMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }

    public void calcularCostoTerreno() {
        costo_terreno = area * valorMetroCuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerCostoTerreno() {
        return costo_terreno;
    }
}
