

import java.util.Scanner;
public class exe02d{
  public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);
	//Váriaveis
	double diag1,diag2;
	
	System.out.println("Informe a diagonal do losango");
	diag1 = entrada.nextDouble();
	System.out.println("Informe a outra diagonal do losango");
	diag2 = entrada.nextDouble();
	
	System.out.println(" A Area do losango é "+(diag1*diag2));
	
  
    }
  }