package geometria;

public class TestFigureGeometriche {

    public static void main(String[] args) {

        
        Rettangolo rettangolo = new Rettangolo(6, 4);
        Cerchio cerchio = new Cerchio(5);
        Triangolo triangolo = new Triangolo(3, 4, 5, 4, 3);

        
        System.out.println("=== RETTANGOLO ===");
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());

        System.out.println("\n=== CERCHIO ===");
        System.out.println("Area: " + cerchio.calcolaArea());
        System.out.println("Perimetro: " + cerchio.calcolaPerimetro());

        System.out.println("\n=== TRIANGOLO ===");
        System.out.println("Area: " + triangolo.calcolaArea());
        System.out.println("Perimetro: " + triangolo.calcolaPerimetro());
    }
}          