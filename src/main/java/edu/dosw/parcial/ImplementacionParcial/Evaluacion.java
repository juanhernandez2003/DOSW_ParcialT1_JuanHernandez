package edu.dosw.parcial.ImplementacionParcial;

public class Evaluacion implements Item{
    private String nombre;
    private String tipo;
    private double nota;
    private double pesoPorcentual;

    public Evaluacion(String nombre){
        this.nombre = nombre;
        /*
        this.tipo = tipo;
        this.nota = nota;
        this.pesoPorcentual = pesoPorcentual;
         */
    }

    @Override
    public double getNota(){
        return nota * pesoPorcentual;
    }

}
