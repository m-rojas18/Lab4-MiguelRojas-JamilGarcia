package lab4_miguelrojas.jamilgarcia;

public class Cohete extends Espacial{


    private int numero_separaciones;
    
    public Cohete(){
        super();
    }

    public Cohete(int numero_separaciones, String tipo_combustible, String planeta_partida, String planeta_llegada, int cantidad_combustible, int distancia, double altitud) {
        super(tipo_combustible, planeta_partida, planeta_llegada, cantidad_combustible, distancia, altitud);
        this.numero_separaciones = numero_separaciones;
    }

    public int getNumero_separaciones() {
        return numero_separaciones;
    }

    public void setNumero_separaciones(int numero_separaciones) {
        this.numero_separaciones = numero_separaciones;
    }

    @Override
    public String toString() {
        return "Cohete{" + "numero_separaciones=" + numero_separaciones + '}';
    }

    
    
}
