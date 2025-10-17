package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    private Rectangulo rect;

    @BeforeEach
    public void setUp() {
        System.out.println("-- Creando nuevo rectángulo para prueba --");
        rect = new Rectangulo(new Punto(2, 3), new Punto(5, 7));
    }

    @Test
    public void testCalcularArea() {
        System.out.println("Probando calcularArea()");
        double area = rect.calcularArea();
        assertEquals(12.0, area, 0.001, "El área debe ser 12.0");
    }

    @Test
    public void testCalcularPerimetro() {
        System.out.println("Probando calcularPerimetro()");
        double perimetro = rect.calcularPerimetro();
        assertEquals(14.0, perimetro, 0.001, "El perímetro debe ser 14.0");
    }

    @Test
    public void testCambiarEscala() {
        System.out.println("Probando cambiarEscala()");
        rect.cambiarEscala(8, 9);
        double nuevaArea = rect.calcularArea();
        assertEquals(36.0, nuevaArea, 0.001, "El área debe ser 36.0 después de escalar");
    }

    @Test
    public void testPuntoDentro() {
        System.out.println("Probando puntoDentro()");
        assertTrue(rect.puntoDentro(3, 5), "El punto (3,5) debe estar dentro");
        assertFalse(rect.puntoDentro(10, 10), "El punto (10,10) debe estar fuera");
    }

    @Test
    public void testMoverHorizontal() {
        System.out.println("Probando moverHorizontal()");
        rect.moverHorizontal(3);
        String pos = rect.posicion();
        assertEquals("(5.0,3.0) hasta (8.0,7.0)", pos, "Debe moverse correctamente 3 unidades en X");
    }

    @Test
    public void testMoverVertical() {
        System.out.println("Probando moverVertical()");
        rect.moverVertical(2);
        String pos = rect.posicion();
        assertEquals("(2.0,5.0) hasta (5.0,9.0)", pos, "Debe moverse correctamente 2 unidades en Y");
    }

    @Test
    public void testPosicion() {
        System.out.println("Probando posicion()");
        String pos = rect.posicion();
        assertEquals("(2.0,3.0) hasta (5.0,7.0)", pos, "Debe mostrar la posición correcta");
    }

    @Test
    public void testAreaConPuntosInvertidos() {
        System.out.println("Probando calcularArea() con puntos invertidos");
        Rectangulo r2 = new Rectangulo(new Punto(7, 3), new Punto(2, 6));
        double area = r2.calcularArea();
        assertEquals(15.0, area, 0.001, "El área debe ser 15.0 con puntos invertidos");
    }
}
