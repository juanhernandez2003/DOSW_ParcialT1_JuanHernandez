package edu.dosw.parcial.ImplementacionParcial;

public class UbicacionArchivo implements Aggregate<Evaluacion> {
    private final Evaluacion[] evaluaciones;

    public UbicacionArchivo() {
        evaluaciones = new Evaluacion[]{
                new Evaluacion("Taller"), new Evaluacion("Laboratorio"), new Evaluacion("Parcial"), new Evaluacion("Proyecto")
        };
    }

    @Override
    public Iterator<Evaluacion> createIterator() {
        return (Iterator<Evaluacion>) new EvaluacionesIterator();
    }

    private class EvaluacionesIterator {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < evaluaciones.length;
        }

        public Evaluacion       next() {
            return evaluaciones[currentIndex++];
        }
    }
}
