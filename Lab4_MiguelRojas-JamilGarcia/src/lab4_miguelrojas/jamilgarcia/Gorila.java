package lab4_miguelrojas.jamilgarcia;

public class Gorila extends Primates{
   
    private int G_IQ; 

    public Gorila() {
        super(); 
    }

    public Gorila(int G_IQ, Medios_Transporte P_MTrans, int P_Comida, int P_CKiloM, String P_Planeta, String P_Nacimiento, String S_Nombre, String S_GSang, String S_Sexo, double S_Altura, double S_Peso) {
        super(P_MTrans, P_Comida, P_CKiloM, P_Planeta, P_Nacimiento, S_Nombre, S_GSang, S_Sexo, S_Altura, S_Peso);
        this.G_IQ = G_IQ;
    }

    public int getG_IQ() {
        return G_IQ;
    }

    public void setG_IQ(int G_IQ) {
        this.G_IQ = G_IQ;
    }

    @Override
    public String toString() {
        return super.toString() + "Gorila{" + "G_IQ=" + G_IQ + '}';
    }

    
    
    
    
}
