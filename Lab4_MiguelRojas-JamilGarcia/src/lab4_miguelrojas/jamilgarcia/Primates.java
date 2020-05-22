package lab4_miguelrojas.jamilgarcia;

public class Primates extends SeresVivos{
    
    private Medios_Transporte P_MTrans; 
    private int P_Comida; 
    private int P_CKiloM; 
    private String P_Planeta;
    private String P_Nacimiento; 

    public Primates() {
        super(); 
    }

    public Primates(Medios_Transporte P_MTrans, int P_Comida, int P_CKiloM, String P_Planeta, String P_Nacimiento, String S_Nombre, String S_GSang, String S_Sexo, double S_Altura, int S_Peso) {
        super(S_Nombre, S_GSang, S_Sexo, S_Altura, S_Peso);
        this.P_MTrans = P_MTrans;
        this.P_Comida = P_Comida;
        this.P_CKiloM = P_CKiloM;
        this.P_Planeta = P_Planeta;
        this.P_Nacimiento = P_Nacimiento;
    }

    public Medios_Transporte getP_MTrans() {
        return P_MTrans;
    }

    public void setP_MTrans(Medios_Transporte P_MTrans) {
        this.P_MTrans = P_MTrans;
    }

    public int getP_Comida() {
        return P_Comida;
    }

    public void setP_Comida(int P_Comida) {
        this.P_Comida = P_Comida;
    }

    public int getP_CKiloM() {
        return P_CKiloM;
    }

    public void setP_CKiloM(int P_CKiloM) {
        this.P_CKiloM = P_CKiloM;
    }

    public String getP_Planeta() {
        return P_Planeta;
    }

    public void setP_Planeta(String P_Planeta) {
        this.P_Planeta = P_Planeta;
    }

    public String getP_Nacimiento() {
        return P_Nacimiento;
    }

    public void setP_Nacimiento(String P_Nacimiento) {
        this.P_Nacimiento = P_Nacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Primates{" + "P_MTrans=" + P_MTrans + ", P_Comida=" + P_Comida + ", P_CKiloM=" + P_CKiloM + ", P_Planeta=" + P_Planeta + ", P_Nacimiento=" + P_Nacimiento + '}';
    }
    
    
    
    
}
