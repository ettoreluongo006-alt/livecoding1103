package soldati;

public class Fante extends Soldato {

    private String arma; 

    public Fante(String nome, int energia, String arma) {
        super(nome, energia);
        this.arma = arma;
    }

    public String getArma() { return arma; }
    public void setArma(String arma) { this.arma = arma; }

    
    @Override
    public void gridoDiBattaglia() {
        System.out.println(getNome() + " grida: Per la patria!");
    }

    
    @Override
    public String toString() {
        return "Fante{" +
                "nome='" + getNome() + '\'' +
                ", energia=" + getEnergia() +
                ", arma='" + arma + '\'' +
                '}';
    }
}