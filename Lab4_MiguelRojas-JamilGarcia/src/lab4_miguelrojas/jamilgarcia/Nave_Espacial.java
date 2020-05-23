package lab4_miguelrojas.jamilgarcia;

public class Nave_Espacial extends Espacial{


    private int numero_propulsores;

    public Nave_Espacial() {
    }

    public Nave_Espacial(int numero_propulsores, String tipo_combustible, String planeta_partida, String planeta_llegada, int cantidad_combustible, int distancia, double altitud) {
        super(tipo_combustible, planeta_partida, planeta_llegada, cantidad_combustible, distancia, altitud);
        this.numero_propulsores = numero_propulsores;
    }

    public int getNumero_propulsores() {
        return numero_propulsores;
    }

    public void setNumero_propulsores(int numero_propulsores) {
        this.numero_propulsores = numero_propulsores;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de Medio De Transporte: Nave Espacial" + "\n"
                + "Numero De Propulsores: " + numero_propulsores + "\n";
    }
    
    
}
