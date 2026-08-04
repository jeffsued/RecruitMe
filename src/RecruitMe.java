import java.util.HashMap;
import java.util.Map;

public class RecruitMe {
    private Map<String, Candidato> candidatos;
    private Map<String, Oportunidade> oportunidades;

    public RecruitMe() {
        this.candidatos = new HashMap<>();
        this.oportunidades = new HashMap<>();
    }

    public boolean cadastrarCandidato(String nome, String email){
    	if(candidatos.containsKey(email)) {
    		return false;
    	}

    	candidatos.put(email, new Candidato(nome, email));
    			return true;
    }
    
    public String[] listarCandidatos(){
    	String[] resultado = new String[candidatos.size()];
    	int i = 0;
    	for (Candidato c : candidatos.values()) {
    	    resultado[i++] = c.toString();
    	}
    	return resultado;
    }
    
    public boolean cadastrarOportunidade(String nomeProjeto, int tam, double pontos){
    	if (oportunidades.containsKey(nomeProjeto)) {
    	    return false;
    	}
    	oportunidades.put(nomeProjeto, new Oportunidade(nomeProjeto, tam, pontos));
    	return true;
    }
    
    public String[] listarOportunidades(){
    	String[] resultado = new String[oportunidades.size()];
    	int i = 0;
    	for (Oportunidade op : oportunidades.values()) {
    	    resultado[i++] = op.toString();
    	}
    	return resultado;
    	
    }
    
    public boolean adicionarCandidatoOportunidade(String email, String nomeProjeto){
    	Candidato candidato = candidatos.get(email);
    	Oportunidade oportunidade = oportunidades.get(nomeProjeto);
    	return oportunidade.adicionarCandidato(candidato);
    	
    }
    
    public String[] listarSelecionadosPorOportunidade(String nomeProjeto){
    	return oportunidades.get(nomeProjeto).listarSelecionados();
    }
}
