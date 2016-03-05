
import java.util.Scanner;

public class exe02e{
  public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);
	
	//Váriaveis
	Double bmaior,bmenor,alt,area;
	
	//Programa
	System.out.println(" Informe a altura do trápezio: ");
	alt = entrada.nextDouble();
	System.out.println("Agora informe a base maior do trápezio");
	bmaior = entrada.nextDouble();
	System.out.println("Por ultimo informe a base menor do trápezio");
	bmenor = entrada.nextDouble();
	
	//Calculo
	area = (bmaior+bmenor)*alt/2;
	
	//Saída
	System.out.println("A area do trapezio é: "+area);
  
	
  
  
  }


}