package lab4_miguelrojas.jamilgarcia;

import java.util.ArrayList;

public class Medios_Transporte {

    private int cantidad_combustible;
    private int distancia;
    private double altitud;
    private ArrayList<Primates> lista_primates = new ArrayList();

    public Medios_Transporte() {

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

    public ArrayList<Primates> getLista_primates() {
        return lista_primates;
    }

    public void setLista_primates(ArrayList<Primates> lista_primates) {
        this.lista_primates = lista_primates;
    }

    @Override
    public String toString() {
        return "Medios_Transporte{" + "cantidad_combustible=" + cantidad_combustible + ", distancia=" + distancia + ", altitud=" + altitud + '}';
    }

    public boolean Viajar(int distanciaVia) {
        int comidaTot = 0, comidaKMTot = 0;

        if (lista_primates.size() < 1) {
            return false;
        } else {
            for (int i = 0; i < lista_primates.size(); i++) {
                comidaTot += lista_primates.get(i).getP_Comida();
                comidaKMTot = lista_primates.get(i).getP_CKiloM();
            }
            if ((comidaKMTot * distanciaVia) > comidaTot) {
                return false;
            }
        }
        
        if ((distancia * (cantidad_combustible / 100)) < distanciaVia) {
            return false;
        }

        return true;
    }

}
