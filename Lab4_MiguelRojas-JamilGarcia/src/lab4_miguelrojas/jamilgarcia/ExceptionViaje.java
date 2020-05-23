package lab4_miguelrojas.jamilgarcia;

public class ExceptionViaje extends Exception{
    
    private boolean Viaje; 

    public ExceptionViaje() {
        super();
    }

    public ExceptionViaje(boolean Viaje, String mensaje) {
        super(mensaje);
        this.Viaje = Viaje;
        
    }

    public boolean isViaje() {
        return Viaje;
    }

    public void setViaje(boolean Viaje) {
        this.Viaje = Viaje;
    }

    @Override
    public String toString() {
        return "ExceptionViaje{" + "Viaje=" + Viaje + '}';
    }

   
    
    
    
}
