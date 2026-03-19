package soldati;

public class Cavaliere extends Soldato {

    private String cavallo; 

    public Cavaliere(String nome, int energia, String cavallo) {
        super(nome, energia);
        this.cavallo = cavallo;
    }

    public String getCavallo() { return cavallo; }
    public void setCavallo(String cavallo) { this.cavallo = cavallo; }

    @Override
    public void gridoDiBattaglia() {
        System.out.println(getNome() + " grida: Per l'onore!");
    }

    @Override
    public String toString() {
        return "Cavaliere{" +
                "nome='" + getNome() + '\'' +
                ", energia=" + getEnergia() +
                ", cavallo='" + cavallo + '\'' +
                '}';
    }
}