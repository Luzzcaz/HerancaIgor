
public class Onibus extends Veiculo{
	int assentos;

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public Onibus(String placa, int ano, int assentos) {
		super(placa,ano);
		this.assentos=assentos;
	}
	@Override
    public void ExibirDados() {
        System.out.println("Placa do Caminhao: "+this.getPlaca());
        System.out.println("Ano:"+this.getAno());
        System.out.println("Numero de eixos: "+this.getAssentos()+"\n");
    }
	}
	

