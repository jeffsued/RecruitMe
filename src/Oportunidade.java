import java.util.ArrayList;
import java.util.List;

public class Oportunidade {
	
    private String nomeProjeto;
    private String status;
    private double pontos;
    private int qtdPessoas;
    private List<Candidato> selecionados;
	
    public Oportunidade(String nomeProjeto, int qtdPessoas, double pontos) {
        this.nomeProjeto = nomeProjeto;
        this.qtdPessoas = qtdPessoas;
        this.pontos = pontos;
        this.status = "aberta";            
        this.selecionados = new ArrayList<>();   
    }
    
    public boolean adicionarCandidato(Candidato candidato) {
    	if (this.status.equals("fechada")) {
    	    return false;
    	}
    	if(candidato.getPontosXp() < this.pontos) {
    		return false;
    	}
    	if (this.selecionados.contains(candidato)) {
    	    return false;
    	}
    	
    	this.selecionados.add(candidato);
    	
    	if(selecionados.size()== this.qtdPessoas) {
    		 this.status = "fechada";
    	}
    	
		return true;
    }
    
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getStatus() {
        return status;
    }

    public List<Candidato> getSelecionados() {
        return selecionados;
    }
    
}
