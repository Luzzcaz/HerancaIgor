import java.util.ArrayList;

public class Carrinhos {
	
	public static void main(String[]args) {
	
		ArrayList<Veiculo> automoveis= new ArrayList();
		
		Onibus MercedesBenz1 = new Onibus("UUI-7070",1998,44);
		Onibus MercedesBenz2 = new Onibus("QAP-5434",2001,45);
		Onibus MercedesBenz3 = new Onibus("GUE-1540",2000,64);
		Onibus MercedesBenz4 = new Onibus("IGO-6743",2003,34);
		Onibus MercedesBenz5 = new Onibus("WAR-2006",2004,54);
		Caminhao CarretaScania1 = new Caminhao("Ley-4002",1992,4); 
		Caminhao CarretaScania2 = new Caminhao("IUD-8922",1997,6); 
		Caminhao CarretaScania3 = new Caminhao("PUT-4567",1995,8); 
		Caminhao CarretaScania4 = new Caminhao("LUC-4555",1996,6); 
		Caminhao CarretaScania5 = new Caminhao("FGT-3246",1998,4); 
		
		
		automoveis.add(MercedesBenz1);
		automoveis.add(MercedesBenz2);
		automoveis.add(MercedesBenz3);
		automoveis.add(MercedesBenz4);
		automoveis.add(MercedesBenz5);
		automoveis.add(CarretaScania1);
		automoveis.add(CarretaScania2);
		automoveis.add(CarretaScania3);
		automoveis.add(CarretaScania4);
		automoveis.add(CarretaScania5);
		

		for(Veiculo Mostrar : automoveis) {
		 Mostrar.ExibirDados(); 
			
		}
	}
}
