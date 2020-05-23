package lab4_miguelrojas.jamilgarcia;

public class Espacial extends Medios_Transporte {

    private String tipo_combustible;
    private String planeta_partida;
    private String planeta_llegada;

    public Espacial() {

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

    @Override
    public boolean Viajar(int distanciaVia) {

        int comidaTot = 0, comidaKMTot = 0;
        boolean viajeComp = true;

        //Primates
        if (lista_primates.isEmpty()) {
            viajeComp = false;
        } else {
            

            for (int i = 0; i < lista_primates.size(); i++) {
                comidaTot += lista_primates.get(i).getP_Comida();
                comidaKMTot = lista_primates.get(i).getP_CKiloM();
            }

            if ((comidaKMTot * distanciaVia) > comidaTot) {
                viajeComp = false;
            }
        }

        //Combustible
        if ((distancia * (cantidad_combustible / 100)) < distanciaVia) {
            viajeComp = false;
        }

        try {
                validar(viajeComp);
            } catch (ExceptionViaje e) {
                e.getMessage();
            }
        for (int i = 0; i < lista_primates.size(); i++) {
            lista_primates.get(i).setP_Comida(lista_primates.get(i).getP_CKiloM() * distanciaVia);
        }

        //Formula para El combustible
        cantidad_combustible -= cantidad_combustible / 100;

        return viajeComp;

    }
    
    public void validar(boolean b) throws ExceptionViaje{
        if (b == false) {
            throw new ExceptionViaje(b,"No se realizo el viaje");
        }
    }

}
