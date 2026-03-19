package geometria;

public class Triangolo extends FiguraGeometrica {

    private double lato1;
    private double lato2;
    private double lato3;
    private double base;
    private double altezza;

    public Triangolo(double lato1, double lato2, double lato3,
                     double base, double altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}