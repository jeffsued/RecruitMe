import java.util.Objects;

public class Candidato{
    private String email;
    private String nome;
    private double pontosXp;
    

    public Candidato(String n, String e,double xp){
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
        return nome + " - " + email + " (" + pontosXp + " pts)";
    }

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(email, other.email);
	}

}