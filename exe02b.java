import java.util.Scanner;

public class exe02b{
   public static void main(String args[]){
	   Scanner entrada = new Scanner(System.in);
	   //Váriaveis
	   double base,altura,area;
	   
    System.out.println(" Insira o valor da base do retangulo");
       base = entrada.nextDouble();
	System.out.println(" Insira o valor da altura do retangulo");   
		altura = entrada.nextDouble();
   
   area = base*altura;
   
   System.out.println("O valor da area é: "+area);
   }
}