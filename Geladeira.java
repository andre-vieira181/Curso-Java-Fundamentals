public class Geladeira{
//atributos
String marca;
int voltagem;
int capacidade;
int intensidade;
String cor;
boolean ligada;

void ligar(){
	ligada=true;
	System.out.println("A Geladeira está ligada");
}

void desligar(){
	ligada = false;
	System.out.println("A Geladeira "+marca+" está desligada");
}
void aumentarIntensidade(){
	intensidade++;
	System.out.println("Nova intensidade ="+intensidade);
}
void diminuirIntensidade(){
	intensidade --;
	System.out.println("Nova intensidade="+intensidade);	
}
void ativarDegelo(){
	intensidade=0;
	System.out.println("Entrou em modo degelo");
}
void mostrarFichaTecnica(){
	System.out.println("===Geladeira===");
	System.out.println("Marca"+marca);
	System.out.println("Capacidade"+capacidade+"litros");
	System.out.println("Voltagem"+voltagem+" volts");
	System.out.println("Cor"+cor);
}

}