package edu.dosw.parcial.ImplementacionParcial;
public interface Aggregate<T> {
    Iterator<T> createIterator();
}