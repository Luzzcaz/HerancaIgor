
public abstract class Veiculo {
	
	protected String placa;
	protected int ano;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public abstract void ExibirDados();
	
	public Veiculo(String placa, int ano) {
		this.placa=placa;
		this.ano=ano;
		
		
		
	}
	public Veiculo() {
		
	}

}
