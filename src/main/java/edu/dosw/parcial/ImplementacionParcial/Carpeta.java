package edu.dosw.parcial.ImplementacionParcial;
import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Item {
    private String name;
    private ArrayList<Item> items = new ArrayList();

    @Override
    public double getNota(){
        double total = 0;
        for (Item i : items){
            total += i.getNota();
        }
        return total;
    }
}
