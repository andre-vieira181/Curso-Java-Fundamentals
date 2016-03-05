import java.util.Scanner;
public class TesteEmpregado{
  public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);
	
	String txtNome;
	double txtSalario;
  
	Empregado emp01;
	
	System.out.print("Digite o nome do empregado: ");
	txtNome = entrada.nextLine();
	System.out.print("Digite o salario do empregado: ");
	txtSalario = entrada.nextDouble();
	
	emp01 = new Empregado(txtNome,txtSalario);
	emp01.imprimir();
	emp01.aumentarSalario(15);
	emp01.imprimir();
	
 }

}