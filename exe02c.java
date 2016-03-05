import java.util.Scanner;

public class exe02c{
  public static void main(String args[]){
  Scanner entrada = new Scanner(System.in);
  // Váriaveis
  double base,altura,area;
  
  //Programa
  System.out.println("Insira o valor da base do triangulo: ");
  base =  entrada.nextDouble();
  
  System.out.println(" Agora insira o valor da altura do triangulo: ");
  altura = entrada.nextDouble();
  
  //Calculo
  area = (base*altura)/2;
  
  //Resultado
  System.out.println(" A Area do triangulo é: "+ area);
  
  }
}