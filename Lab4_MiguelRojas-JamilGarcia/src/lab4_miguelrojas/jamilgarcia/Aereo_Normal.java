package lab4_miguelrojas.jamilgarcia;

public class Aereo_Normal extends Medios_Transporte{

    private String tipo_gasolina;
    private String pais_partida;
    private String pais_llegada;

    public Aereo_Normal() {
    }

    public Aereo_Normal(String tipo_gasolina, String pais_partida, String pais_llegada, int cantidad_combustible, int distancia, double altitud) {
        super(cantidad_combustible, distancia, altitud);
        this.tipo_gasolina = tipo_gasolina;
        this.pais_partida = pais_partida;
        this.pais_llegada = pais_llegada;
    }

    

    public String getTipo_gasolina() {
        return tipo_gasolina;
    }

    public void setTipo_gasolina(String tipo_gasolina) {
        this.tipo_gasolina = tipo_gasolina;
    }

    public String getPais_partida() {
        return pais_partida;
    }

    public void setPais_partida(String pais_partida) {
        this.pais_partida = pais_partida;
    }

    public String getPais_llegada() {
        return pais_llegada;
    }

    public void setPais_llegada(String pais_llegada) {
        this.pais_llegada = pais_llegada;
    }

    @Override
    public String toString() {
        return super.toString() 
                + "Tipo De Gasolina: " + tipo_gasolina + "\n"
                + "Pais De Partida: " + pais_partida + "\n"
                + "Pais De Llegada: " + pais_llegada + "\n";
    }
    
    
    
}
