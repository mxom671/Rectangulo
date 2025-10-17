package modelo;

public abstract class Figura {
    
    protected Punto origen;
    
    public Figura(Punto origen) {
        this.origen = origen;
    }
    
    public Punto getOrigen() {
        return origen;
    }
    
    public abstract double area();
    
    public abstract String posicion();
}
