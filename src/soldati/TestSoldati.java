package soldati;

public class TestSoldati {

    public static void main(String[] args) {

        Fante fante = new Fante("Marco", 100, "Spada");
        Cavaliere cavaliere = new Cavaliere("Alarico", 120, "Destriero");

        System.out.println(fante);
        fante.combatti();
        fante.riposa();
        fante.avanza();
        fante.gridoDiBattaglia();

        System.out.println("\n" + cavaliere);
        cavaliere.combatti();
        cavaliere.riposa();
        cavaliere.avanza();
        cavaliere.gridoDiBattaglia();
    }
}