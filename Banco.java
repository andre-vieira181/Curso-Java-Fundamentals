import java.util.Scanner;

public class Banco{
  public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
	
	Conta c1,c2;
	ContaEspecial e1;
	
	c1 = new Conta("Isidro","111.222.333-44",12345);
	c2 = new Conta("Josineidson","999.888.777-66",98765);
	e1 = new ContaEspecial("Romulo","876.543.123-98",1233987,1000.0f);
	
	c1.creditar(100);
	c2.creditar(200);
	

	  
	if(c1.debitar(150)){
	   System.out.println("Conta de "+c1.getNomeTitular()+" debitada com sucesso!");
	}
	else{
	   System.out.println("Saldo insuficiente para "+c1.getNomeTitular());	
	}
	if(c2.debitar(150)){
	   System.out.println("Conta de "+c2.getNomeTitular()+" debitada com sucesso!");
	}
	else{
	   System.out.println("Saldo insuficiente para "+c2.getNomeTitular());	
	}
	
	// e1 debitar
	if(e1.debitar(150)){
	   System.out.println("Conta de "+e1.getNomeTitular()+" debitada com sucesso!");
	}
	else{
	   System.out.println("Saldo insuficiente para "+e1.getNomeTitular());	
	}
	
	c1.imprimir();
	c2.imprimir();  
	e1.imprimir();
	}  
	  

 }