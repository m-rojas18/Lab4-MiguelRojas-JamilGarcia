package lab4_miguelrojas.jamilgarcia;

public class Espacial extends Medios_Transporte{
    
    private String tipo_combustible;
    private String planeta_partida;
    private String planeta_llegada;
    
    public Espacial(){
        
    }

    public Espacial(String tipo_combustible, String planeta_partida, String planeta_llegada, int cantidad_combustible, int distancia, double altitud) {
        super(cantidad_combustible, distancia, altitud);
        this.tipo_combustible = tipo_combustible;
        this.planeta_partida = planeta_partida;
        this.planeta_llegada = planeta_llegada;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String getPlaneta_partida() {
        return planeta_partida;
    }

    public void setPlaneta_partida(String planeta_partida) {
        this.planeta_partida = planeta_partida;
    }

    public String getPlaneta_llegada() {
        return planeta_llegada;
    }

    public void setPlaneta_llegada(String planeta_llegada) {
        this.planeta_llegada = planeta_llegada;
    }

    @Override
    public String toString() {
        return super.toString() 
                + "Tipo De Combustible: " + tipo_combustible + "\n"
                + "Planeta De Partida: " + planeta_partida + "\n"
                + "Planeta De Llegada: " + planeta_llegada + "\n";
    }
    
    
    
}
