package lab4_miguelrojas.jamilgarcia;

public class Mono extends Primates{
    
    private String M_ColorP;

    public Mono() {
        super(); 
    }

    public Mono(String M_ColorP, Medios_Transporte P_MTrans, int P_Comida, int P_CKiloM, String P_Planeta, String P_Nacimiento, String S_Nombre, String S_GSang, String S_Sexo, double S_Altura, int S_Peso) {
        super(P_MTrans, P_Comida, P_CKiloM, P_Planeta, P_Nacimiento, S_Nombre, S_GSang, S_Sexo, S_Altura, S_Peso);
        this.M_ColorP = M_ColorP;
    }

    public String getM_ColorP() {
        return M_ColorP;
    }

    public void setM_ColorP(String M_ColorP) {
        this.M_ColorP = M_ColorP;
    }

    @Override
    public String toString() {
        return super.toString() + "Mono{" + "M_ColorP=" + M_ColorP + '}';
    }
    
    
}
