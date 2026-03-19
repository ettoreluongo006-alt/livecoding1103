package geometria;

public class Cerchio extends FiguraGeometrica {

    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return PI_GRECO * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * PI_GRECO * raggio;
    }
}