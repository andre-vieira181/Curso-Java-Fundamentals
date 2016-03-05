import java.util.Scanner;

public class LojaDeConveniencia{
  public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
    MaquinaDeRefrigerante m;
	m = new MaquinaDeRefrigerante();
	
	
	int  opcao;
	float valor;
	
	do{
	  m.mostrarDisplay();
	  System.out.println("Escolha um opcao");
      System.out.println("0 -4 para comprar seu refrigerante");
	  System.out.println("10 para inserir credito na maquina");
	  System.out.println("11 para solicitar seu troco");
	  System.out.println("-1 para encerrar");	
	  opcao = teclado.nextInt();
	  switch (opcao){
		  case 0:
		  case 1:
		  case 2:
		  case 3:
		  case 4:
				int resultado =m.comprarRefri(opcao);
				if (resultado == 0){
					System.out.println("Retire seu refrigerante e aproveite! ");
					
				}
				else {
					if(resultado == -1){
					   System.out.println("Saldo insuficiente para este refrigerante ");
				    }
				    else {
					 System.out.println("Desculpe, mas não temos estoque disponível ");	
					}
				}
				break;
				case 10:
					System.out.println("Digite o valor a ser inserido");
					valor = teclado.nextFloat();
					if (valor > 0){
						m.inserirCredito(valor);
					}
					else{
						System.out.println("Valor Invalido! ");
					}
					break;
				case 11:	
					valor = m.pedirTroco();
					System.out.println("Seu troco R$ "+valor);
					break;
				case -1:
					if (m.getSaldo()>0){
						valor= m.pedirTroco();
						System.out.println("Não esqueça seu troco R$ "+valor);
					}
					System.out.println("Obrigado! Volte sempre! Saldo da Maquina R$ "+m.getSaldo());
					break;
					
				
		  default:
		     System.out.println("Opcao Invalida");
			 break;
	    }
	} while (opcao!= -1);
  
  
  
  }


}