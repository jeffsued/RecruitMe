public class Candidato{
    private String email;
    private String nome;
    private double pontosXp;
    

    public Candidato(String n, String e,int xp){
        this.email = e;
        this.nome = n;
        this.pontosXp = xp;
    }
 
    public String getEmail() {
        return email;
    }
    public double getPontosXp(){
        return pontosXp;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return ;
    }


}