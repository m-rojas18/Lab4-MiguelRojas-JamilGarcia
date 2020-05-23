package lab4_miguelrojas.jamilgarcia;

public class Avion_Comercial extends Aereo_Normal{

    private int numero_pasajeros;
    private String funcionamiento;
    
    public Avion_Comercial(){
        super();
    }

    public Avion_Comercial(int numero_pasajeros, String funcionamiento, String tipo_gasolina, String pais_partida, String pais_llegada, int cantidad_combustible, int distancia, double altitud) {
        super(tipo_gasolina, pais_partida, pais_llegada, cantidad_combustible, distancia, altitud);
        this.numero_pasajeros = numero_pasajeros;
        this.funcionamiento = funcionamiento;
    }

    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }

    public void setNumero_pasajeros(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    @Override
    public String toString() {
        return super.toString() 
                + "Tipo De Medio De Transporte: Avion Comercial" + "\n"
                + "Numero De Pasajeros: " + numero_pasajeros + "\n" 
                + "Piloto Automatico: " + funcionamiento + "\n";
    }
    
    
}
