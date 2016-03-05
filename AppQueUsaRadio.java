public class AppQueUsaRadio{
	public static void main(String args[]){
		Radio r1 = new Radio("Pioner");
		
		r1.ligar();
		r1.sintonizar(102.01);
		
		r1.alterarEstacao(false);
		r1.alterarEstacao(true);
		r1.sintonizar(109.1);
		r1.diminuirVolume();
		r1.diminuirVolume();
		
	}



}