/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import equivalenteHora.EquivalenteHora;

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
        EquivalenteHora hora = new EquivalenteHora();

        double horas = 58;

        hora.establecerHoras(horas);
        hora.calcularSegundos();
        hora.calcularMinutos();
        hora.calcularDias();

        System.out.printf("Equivalencia de horas\nHoras: %.2f"
                + "\nSegundos: %.2f\nMinutos: %.2f\nDias: %.2f\n",
                hora.obtenerHoras(), hora.obtenerSegundos(),
                hora.obtenerMinutos(), hora.obtenerDias());

    }

}
