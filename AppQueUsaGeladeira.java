public class AppQueUsaGeladeira{
  public static void main(String args[]){
    Geladeira g1;// declaro uma referência para manipulação.
	Geladeira g2;
	
	g1 = new Geladeira(); //aqui efetivamente eu crio um espaço de memória para armazenar um objeto.
  
	g1.marca = "Consul";
	g1.voltagem= 110;
	g1.cor    = "branca";
	g1.capacidade= 380;
	
	g1.mostrarFichaTecnica();
	g1.ligar();
	
	g2 = new Geladeira();
	g2.marca  ="Brastemp";
	g2.voltagem = 220;
	g2.cor ="inox";
	g2.capacidade=500;
	g2.ligar();
	g2.mostrarFichaTecnica();
	
  
  }

}