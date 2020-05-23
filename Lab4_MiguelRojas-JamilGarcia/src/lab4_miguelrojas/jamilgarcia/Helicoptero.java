package lab4_miguelrojas.jamilgarcia;

public class Helicoptero extends Aereo_Normal{
    
    private int numero_helices;
    private int numero_patas;
    
    public Helicoptero(){
        super();
    }

    public Helicoptero(int numero_helices, int numero_patas, String tipo_gasolina, String pais_partida, String pais_llegada, int cantidad_combustible, int distancia, double altitud) {
        super(tipo_gasolina, pais_partida, pais_llegada, cantidad_combustible, distancia, altitud);
        this.numero_helices = numero_helices;
        this.numero_patas = numero_patas;
    }

    public int getNumero_helices() {
        return numero_helices;
    }

    public void setNumero_helices(int numero_helices) {
        this.numero_helices = numero_helices;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Tipo De Medio De Transporte: Helicoptero" + "\n"
                + "Numero De Helices: " + numero_helices + "\n"
                + "Numero De Patas" + numero_patas + "\n";
    }
    
    
}
