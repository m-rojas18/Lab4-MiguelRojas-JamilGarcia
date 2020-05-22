package lab4_miguelrojas.jamilgarcia;

public class SeresVivos {
    
    private String S_Nombre; 
    private String S_GSang; 
    private String S_Sexo; 
    private double S_Altura; 
    private double S_Peso; 

    public SeresVivos() {
    }

    public SeresVivos(String S_Nombre, String S_GSang, String S_Sexo, double S_Altura, double S_Peso) {
        this.S_Nombre = S_Nombre;
        this.S_GSang = S_GSang;
        this.S_Sexo = S_Sexo;
        this.S_Altura = S_Altura;
        this.S_Peso = S_Peso;
    }

    public String getS_Nombre() {
        return S_Nombre;
    }

    public void setS_Nombre(String S_Nombre) {
        this.S_Nombre = S_Nombre;
    }

    public String getS_GSang() {
        return S_GSang;
    }

    public void setS_GSang(String S_GSang) {
        this.S_GSang = S_GSang;
    }

    public String getS_Sexo() {
        return S_Sexo;
    }

    public void setS_Sexo(String S_Sexo) {
        this.S_Sexo = S_Sexo;
    }

    public double getS_Altura() {
        return S_Altura;
    }

    public void setS_Altura(double S_Altura) {
        this.S_Altura = S_Altura;
    }

    public double getS_Peso() {
        return S_Peso;
    }

    public void setS_Peso(double S_Peso) {
        this.S_Peso = S_Peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "S_Nombre=" + S_Nombre + ", S_GSang=" + S_GSang + ", S_Sexo=" + S_Sexo + ", S_Altura=" + S_Altura + ", S_Peso=" + S_Peso + '}';
    }
    
    
    
}
