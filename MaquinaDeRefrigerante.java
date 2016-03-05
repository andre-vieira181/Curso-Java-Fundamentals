public class MaquinaDeRefrigerante{

  private float saldo	;
  private Refrigerante lista[];// Vetor ?? Sim,vamos precisar de vetores.


  public MaquinaDeRefrigerante(){
	saldo =0.0f;
	lista = new Refrigerante[5]; //Criei 5 váriaveis do tipo Refrigerante;
	
	lista[0] = new Refrigerante("Coca-cola", 2.50f,10);
	lista[1] = new Refrigerante("Fanta", 2.30f,5);
	lista[2] = new Refrigerante("Sprite",2.20f,5 );
	lista[3] = new Refrigerante("Kuat",2.10f,5 );
	lista[4] = new Refrigerante("Dollynho", 1.0f,180 );
  }
  
  
  public void inserirCredito(float valor){
	 saldo+= valor;//saldo = saldo + valor;
	  
	  
  }
  public float pedirTroco(){
		float troco;
		troco = saldo;
		saldo = 0.0f;
		return troco;		
	}
	
	public float getSaldo(){
		return this.saldo;
	}
	
  public int comprarRefri(int pos){
		int resultadoCompra;
		if (saldo >= lista[pos].getPreco()){
			if(lista[pos].getQtde() > 0){
				//atualizo saldo
				saldo = saldo - lista[pos].getPreco();
				//atualizo estoque
				lista[pos].setQtde(lista[pos].getQtde()-1);
				//defino o resultado da compra
				resultadoCompra=0;//deu certo ufa
			}
			else{
				resultadoCompra =-2;// sem estoque			
			}		
		}
		else{
			resultadoCompra = -1;//sem saldo
		}
		return resultadoCompra;	
		
	}

	public void mostrarDisplay(){
		System.out.println("****** Maquina de Refrigerante ******");
		System.out.println("");
		System.out.println(" Seu saldo R$ "+ saldo);
		System.out.println("-------------------------------------");
		System.out.println("Escolha sua bebida");
		for (int i=0; i<5; i++){
			System.out.println(lista[i].getNome()+ "R$" +lista[i].getPreco());
		}
		System.out.println("-------------------------------------");
	}
	
}