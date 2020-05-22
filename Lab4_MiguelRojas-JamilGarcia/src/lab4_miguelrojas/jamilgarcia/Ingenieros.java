package lab4_miguelrojas.jamilgarcia;

import java.util.ArrayList;
import java.util.Date;

public class Ingenieros extends SeresVivos{
    
    private String I_Correo; 
    private String I_Usuario; 
    private ArrayList <String> I_Idiomas = new ArrayList(); 
    private String I_Pass; 
    private Date I_Fecha; 

    public Ingenieros() {
        super(); 
    }

    public Ingenieros(String I_Correo, String I_Usuario, String I_Pass, Date I_Fecha, String S_Nombre, String S_GSang, String S_Sexo, double S_Altura, int S_Peso) {
        super(S_Nombre, S_GSang, S_Sexo, S_Altura, S_Peso);
        this.I_Correo = I_Correo;
        this.I_Usuario = I_Usuario;
        this.I_Pass = I_Pass;
        this.I_Fecha = I_Fecha;
    }

    public String getI_Correo() {
        return I_Correo;
    }

    public void setI_Correo(String I_Correo) {
        this.I_Correo = I_Correo;
    }

    public String getI_Usuario() {
        return I_Usuario;
    }

    public void setI_Usuario(String I_Usuario) {
        this.I_Usuario = I_Usuario;
    }

    public ArrayList<String> getI_Idiomas() {
        return I_Idiomas;
    }

    public void setI_Idiomas(ArrayList<String> I_Idiomas) {
        this.I_Idiomas = I_Idiomas;
    }

    public String getI_Pass() {
        return I_Pass;
    }

    public void setI_Pass(String I_Pass) {
        this.I_Pass = I_Pass;
    }

    public Date getI_Fecha() {
        return I_Fecha;
    }

    public void setI_Fecha(Date I_Fecha) {
        this.I_Fecha = I_Fecha;
    }

    @Override
    public String toString() {
        return super.toString() + "Ingenieros{" + "I_Correo=" + I_Correo + ", I_Usuario=" + I_Usuario + ", I_Idiomas=" + I_Idiomas + ", I_Pass=" + I_Pass + ", I_Fecha=" + I_Fecha + '}';
    }
    
    
    
}
