public class Bomba{

String  combustivel;
float   precoLitro;
double  qtdeLitros;
double  totalPagar;
boolean emAbastecimento;


public BombaDeCombustivel(String combustivel, float precoLitro);{
	this.combustivel     = combustivel;
	this.precoLitro      = precoLitro;
	this.qtdeLitros      = 0.0f;
	this.totalPagar      = 0.0f
	this.emAbastecimento = false;
}

public void tirarGancho(){
	emAbastecimento = true;
	this.qtdeLitros = 0.0f;
	this.totalPagar = 0.0f;	
}

public void voltarGancho(){
	emAbastecimento = false;
	exibirSumario();	
}

public void abastecerPorLitro(float quantosLitros){
	if(emAbastecimento){
	   this.qtdeLitros = quantosLitros;
	   this.totalPagar = quantosLitros * precoLitro;
	}
	else{
		System.out.println("Retire o bico do gancho");
	}
 }	
public void abastecerPorValor(float valorTotal){
	if(emAbastecimento){
	   this.totalPagar = valorTotal;
	   this.qtdeLitros = valorTotal / this.precoLitro;
	}
	else{
		System.out.println("Retire o bico do gancho");		
	}
  }
public void exibirSumario(){
	System.out.println("====================================");
	System.out.println("Combustivel   :  "+this.combustivel);
	System.out.println("Preco Litro   :  "+this.precoLitro);
	System.out.println("Litros        :  "+this.qtdeLitros);
	System.out.println("Total a Pagar : "+this.totalPagar);
	System.out.println("====================================");
  }   
   
}