package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PuntoTest {
    
    public PuntoTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("-- Preparando un nuevo test --");
    }

    @Test
    public void testConstructorAsignaValores() {
        System.out.println("Prueba del constructor de Punto");
        Punto p = new Punto(3, 4);
        assertEquals(3, p.x, "La coordenada X debe ser 3");
        assertEquals(4, p.y, "La coordenada Y debe ser 4");
    }

    @Test
    public void testModificarValores() {
        System.out.println("Prueba de modificacion manual de coordenadas");
        Punto p = new Punto(0, 0);
        p.x = 10;
        p.y = -5;
        assertEquals(10, p.x, "La coordenada X debe ser 10");
        assertEquals(-5, p.y, "La coordenada Y debe ser -5");
    }

    @Test
    public void testDistanciaManual() {
        System.out.println("Prueba de distancia entre puntos (calculo manual)");
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 4);
        double distancia = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        assertEquals(5.0, distancia, 0.0001, "La distancia entre (0,0) y (3,4) debe ser 5.0");
    }
}
