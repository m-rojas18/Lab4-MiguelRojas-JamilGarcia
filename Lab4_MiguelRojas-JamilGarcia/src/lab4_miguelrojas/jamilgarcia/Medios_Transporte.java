package lab4_miguelrojas.jamilgarcia;

import java.util.ArrayList;

public class Medios_Transporte {


    private int cantidad_combustible;
    private int distancia;
    private double altitud;
    //private ArrayList<Primates> lista_primates = new ArrayList();
    
    public Medios_Transporte(){
        
    }

    public Medios_Transporte(int cantidad_combustible, int distancia, double altitud) {
        this.cantidad_combustible = cantidad_combustible;
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public int getCantidad_combustible() {
        return cantidad_combustible;
    }

    public void setCantidad_combustible(int cantidad_combustible) {
        this.cantidad_combustible = cantidad_combustible;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    /*public ArrayList<Primates> getLista_primates() {
        return lista_primates;
    }

    public void setLista_primates(ArrayList<Primates> lista_primates) {
        this.lista_primates = lista_primates;
    }*/

    @Override
    public String toString() {
        return "Medios_Transporte{" + "cantidad_combustible=" + cantidad_combustible + ", distancia=" + distancia + ", altitud=" + altitud + '}';
    }
    
    
    
}
