import java.util.Scanner;

public class TerrenoMeteoro{
public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);
	//Váriaveis
	int x1,y1,x2,y2,nMeteoritos,conteMeteoritos=0;
	

	System.out.println("=============================================================================");
	System.out.println("Imaginando que a propriedade não se encontra no centro do terreno mas partindo dele informe quantos metros a esquerda, ");
	System.out.println("devemos andar para encontrar o limite esquerdo do terreno, e quantos metros ");
	System.out.println(" precisamos subir para encontrar o canto superior esquerdo");
	System.out.println("=============================================================================");
	
	x1=entrada.nextInt();
	y1=entrada.nextInt();
	
	System.out.println("=============================================================================");
	System.out.println("Agora partindo do mesmo ponto central do terreno quantos metros a esquerda teremos o limite direito da propriedade ");
	System.out.println(" e quantos metros abaixo teremos o limite inferior do terreno");
	System.out.println(" ");
	System.out.println("=============================================================================");
	
	x2=entrada.nextInt();
	y2=entrada.nextInt();
	
	System.out.println("Ok, quantos meteoritos cairam ?");
	nMeteoritos = entrada.nextInt();
	
	do{
		
		
		System.out.println("teste "+conteMeteoritos);
		conteMeteoritos=conteMeteoritos+1;
	}
	while(nMeteoritos>=conteMeteoritos);
	
}






}