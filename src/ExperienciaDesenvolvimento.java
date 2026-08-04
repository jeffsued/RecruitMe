
public class ExperienciaDesenvolvimento extends Experiencia{

	private String descricao;
	private String URL;
	private int nFiles;
	
	public ExperienciaDesenvolvimento(int codigo, int valorBase, String descricao, String URL, int nFiles) {
	    super(codigo, valorBase);
	    this.descricao = descricao;
	    this.URL = URL;
	    this.nFiles = nFiles;
	}
	
	@Override
	public double calcularXP() {
		return getValorBase() * nFiles/10;
	}

	
	@Override
	public String toString() {
		return "Desenvolvimento" + getCodigo() + " " + descricao + " " + URL + " " + nFiles + " XP: " + calcularXP();	}

	
}
