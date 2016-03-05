import java.util.Scanner;

public class exe02{
   public static void main(String args[]){
     Scanner entrada = new Scanner(System.in);
	 //Variáveis
	 Double lado;
	 
	 //Texto
	 System.out.println("Calculo da area do quadrado: ");
	 System.out.println(" Digite o lado do quadrado: ");
	 
	 //Calculo
     lado = entrada.nextDouble();
	 area = lado*lado;
	 
	 //Resultado
	 System.out.println(" A Area do quadrado é :" + area);
	 
   
   }
}