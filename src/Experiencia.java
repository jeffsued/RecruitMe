
public abstract class Experiencia {
	
	private int codigo;
	private int valorBase;

	public Experiencia(int codigo, int valorBase) {
		this.codigo = codigo;
		this.valorBase = valorBase;
	}

	public abstract double calcularXP();
	public abstract String toString();
	
	public int getCodigo() {
		return codigo;
	}
	public int getValorBase() {
		return valorBase;
	}
}
