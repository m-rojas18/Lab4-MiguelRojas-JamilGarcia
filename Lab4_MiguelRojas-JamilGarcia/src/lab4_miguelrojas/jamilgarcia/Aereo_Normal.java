package lab4_miguelrojas.jamilgarcia;

public class Aereo_Normal extends Medios_Transporte {

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

    public void validar(boolean b) throws ExceptionViaje {
        if (b == false) {
            throw new ExceptionViaje(b, "No se realizo el viaje");
        }
    }

}
