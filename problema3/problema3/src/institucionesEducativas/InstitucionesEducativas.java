/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institucionesEducativas;

/**
 *
 * @author darav
 */
public class InstitucionesEducativas {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public void establecerNombre(String c) {
        nombre = c;
    }
    public void establecerTipoInstitucion(String c) {
        tipoInstitucion = c;
    }
    public void establecerNumeroAlumnos(int c) {
        numeroAlumnos = c;
    }
    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }
    public void establecerNumeroSedes(int c) {
        numeroSedes = c;
    }
    public void establecerGastosEstudiante(double c) {
        gastosEstudiante = c;
    }
    public void calcularPresupesto() {
        presupuesto = numeroAlumnos * gastosEstudiante ;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    public int obtenerTipoInstitucion() {
        return numeroSedes;
    }
    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }
    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }
    public int obtenerNumeroSedes() {
        return numeroSedes;
    }
    public double obtenerGastosEstudiante() {
        return gastosEstudiante;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
}
