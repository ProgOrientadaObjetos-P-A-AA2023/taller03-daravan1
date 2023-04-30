/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import institucionesEducativas.InstitucionesEducativas;

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
        InstitucionesEducativas inst = new InstitucionesEducativas();
        String nombre = "Bernardo";
        String tipoInstitucion = "Publica";
        int numeroAlumnos = 286;
        int numeroDocentes = 40;
        int numeroSedes = 2;
        double gastosEstudiante = 45;

        inst.establecerNombre(nombre);
        inst.establecerTipoInstitucion(tipoInstitucion);
        inst.establecerNumeroSedes(numeroSedes);
        inst.establecerNumeroDocentes(numeroDocentes);
        inst.establecerNumeroAlumnos(numeroAlumnos);
        inst.establecerGastosEstudiante(gastosEstudiante);
        inst.calcularPresupesto();

        System.out.printf("""
                          Instituciones Educativas
                          Nombre: %s
                          Tipo de institucion: %s
                          Numero de sedes: %d
                          Numero de docentes: %d
                          Numero de alumnos: %s
                          Gastos por estudiante: %.2f
                          Presupuesto total de: %.2f\n""",
                inst.obtenerNombre(), inst.obtenerTipoInstitucion(),
                inst.obtenerNumeroSedes(), inst.obtenerNumeroDocentes(),
                inst.obtenerNumeroAlumnos(), inst.obtenerGastosEstudiante(),
                inst.obtenerPresupuesto());
    }

}
