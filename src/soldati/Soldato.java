package soldati;

public abstract class Soldato {

   
    private String nome;
    private int energia;

    
    public Soldato(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    
    public void combatti() {
        System.out.println(nome + " sta combattendo!");
        energia -= 10;
    }

    public void riposa() {
        System.out.println(nome + " sta riposando...");
        energia += 5;
    }

    public void avanza() {
        System.out.println(nome + " avanza verso il nemico!");
    }

    
    public abstract void gridoDiBattaglia();

    @Override
    public String toString() {
        return "Soldato{" +
                "nome='" + nome + '\'' +
                ", energia=" + energia +
                '}';
    }
}