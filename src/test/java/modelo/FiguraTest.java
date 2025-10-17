package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {

    private Figura figura;

    public FiguraTest() {
    }

    @BeforeEach
    public void setUp() {
        figura = new Rectangulo(new Punto(0, 0), new Punto(4, 3));
    }

    @Test
    public void testArea() {
        System.out.println("Prueba de calculo de area mediante polimorfismo");
        double resultado = figura.area();
        assertEquals(12.0, resultado, 0.001, "El area debe ser 12.0");
    }
    
    @Test
    public void testPosicion() {
        System.out.println("Prueba de obtencion de posicion mediante polimorfismo");
        String pos = figura.posicion();
        assertTrue(pos.contains("(") && pos.contains(")"), "La posicion debe contener coordenadas");
    }

    @Test
    public void testInstanciaDeRectangulo() {
        System.out.println("Prueba de instancia polimorfica");
        assertTrue(figura instanceof Rectangulo, "La figura debe ser una instancia de Rectangulo");
    }
}
