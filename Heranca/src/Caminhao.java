
public class Caminhao extends Veiculo {
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos=eixos;
	}
	
	@Override
    public void ExibirDados() {
        System.out.println("Placa do Caminhao: "+this.getPlaca());
        System.out.println("Ano:"+this.getAno());
        System.out.println("Numero de eixos: "+this.getEixos()+"\n");
    }
	}

