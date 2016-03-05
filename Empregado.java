

public class Empregado{
//atributos
String nome;
double salario;

public Empregado(String nome,double salario){
	this.nome=nome;
	this.salario=salario;
}

  void imprimir(){
  System.out.println("O nome do empresago é: "+nome);
  System.out.println("O salario do empregado é: "+salario);

}
  void aumentarSalario(double percentual){
	  salario = salario+salario*percentual/100;
  }

}