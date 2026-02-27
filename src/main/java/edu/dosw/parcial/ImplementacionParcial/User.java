package edu.dosw.parcial.ImplementacionParcial;

public class User {
    public void explorarCarpetas(Aggregate<Evaluacion> navegacion){
        Iterator<Evaluacion> iterator = navegacion.createIterator();

        while (iterator.hasNext()){
            Evaluacion p = iterator.next();
            System.out.println("Consultando " + p.getNota());
        }
    }
}
