package vista;

import java.util.Scanner;
import modelo.Punto;
import modelo.Rectangulo;

public class RectanguloVista {
    private final Scanner sc = new Scanner(System.in);
    private Rectangulo rect; 

    public void menu() {
        int op = 0;
        while (op != 6) {
            System.out.println("\nRECTANGULO");
            System.out.println("1. Crear rectangulo");
            System.out.println("2. Ver area y perimetro");
            System.out.println("3. Cambiar escala");
            System.out.println("4. Saber si un punto esta dentro");
            System.out.println("5. Mover rectangulo");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> crearRectangulo();
                case 2 -> mostrarArea();
                case 3 -> cambiarEscala();
                case 4 -> verificarPunto();
                case 5 -> moverRectangulo();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion no valida");
            }
        }
    }

    private void crearRectangulo() {
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        rect = new Rectangulo(p1, p2);
        System.out.println("Rectangulo creado con exito.");
    }

    private void mostrarArea() {
        if (rect == null) {
            System.out.println("Primero debes crear un rectangulo.");
            return;
        }
        System.out.println("Posicion: " + rect.posicion());
        System.out.println("Area: " + rect.calcularArea());
        System.out.println("Perimetro: " + rect.calcularPerimetro());
    }

    private void cambiarEscala() {
        if (rect == null) {
            System.out.println("Primero debes crear un rectangulo.");
            return;
        }
        System.out.print("Nueva X2: ");
        double nx2 = sc.nextDouble();
        System.out.print("Nueva Y2: ");
        double ny2 = sc.nextDouble();
        rect.cambiarEscala(nx2, ny2);
        System.out.println("Nueva posicion: " + rect.posicion());
    }

    private void verificarPunto() {
        if (rect == null) {
            System.out.println("Primero debes crear un rectangulo.");
            return;
        }
        System.out.print("Punto X: ");
        double px = sc.nextDouble();
        System.out.print("Punto Y: ");
        double py = sc.nextDouble();
        boolean dentro = rect.puntoDentro(px, py);
        if (dentro) {
            System.out.println("El punto esta dentro del rectangulo.");
        } else {
            System.out.println("El punto esta fuera del rectangulo.");
        }
    }

    private void moverRectangulo() {
        if (rect == null) {
            System.out.println("Primero debes crear un rectangulo.");
            return;
        }
        System.out.println("1. Mover horizontal");
        System.out.println("2. Mover vertical");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1 -> {
                System.out.print("Unidades en X: ");
                double dx = sc.nextDouble();
                rect.moverHorizontal(dx);
            }
            case 2 -> {
                System.out.print("Unidades en Y: ");
                double dy = sc.nextDouble();
                rect.moverVertical(dy);
            }
            default -> System.out.println("Opcion invalida.");
        }

        System.out.println("Nueva posicion: " + rect.posicion());
    }
}