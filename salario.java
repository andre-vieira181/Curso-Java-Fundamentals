public class Salario{
   public static void main(String args[]){
    float salario;
	
	salario = Float.parseFloat(args[0]);
	
	if(salario <= 1000)
		System.out.println("Esta insento de impostos R$ "+salario);
	else
		if(salario > 1000 & salario <= 2500)
		  System.out.println("Salario com dedução do imposto é R$ : "+(-salario*0.125+salario));
	  else
			if (salario > 2500 & salario <= 5000)
				System.out.println("Salario com dedução do imposto é R$ : "+(-salario*0.25+salario));
			else
				System.out.println("Salario com dedução do imposto é R$ : "+(salario - 1300));
   }
}