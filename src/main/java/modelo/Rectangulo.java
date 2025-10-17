package modelo;

public class Rectangulo extends Figura {
    
    private final Punto p1;
    private final Punto p2;
    
    public Rectangulo(Punto p1, Punto p2) {
        super(p1);
        this.p1 = p1;
        this.p2 = p2;
    }
    
    @Override
    public double area() {
        double base = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());
        return base * altura;
    }
    
    public double calcularPerimetro() {
        double base = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());
        return 2 * (base + altura);
    }
    
    public void cambiarEscala(double nuevaX2, double nuevaY2) {
        p2.setX(nuevaX2);
        p2.setY(nuevaY2);
    }
    
    public boolean puntoDentro(double x, double y) {
        return x >= p1.getX() && x <= p2.getX() && y >= p1.getY() && y <= p2.getY();
    }
    
    public void moverHorizontal(double dx) {
        p1.setX(p1.getX() + dx);
        p2.setX(p2.getX() + dx);
    }
    
    public void moverVertical(double dy) {
        p1.setY(p1.getY() + dy);
        p2.setY(p2.getY() + dy);
    }
    
    @Override
    public String posicion() {
        return "(" + p1.getX() + "," + p1.getY() + ") hasta (" + p2.getX() + "," + p2.getY() + ")";
    }

    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}