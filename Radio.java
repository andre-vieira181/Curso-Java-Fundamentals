public class Radio{
  private String marca;
  private int voltagem;
  private int volume;
  private String banda;
  private double sintonia;
  private boolean ligado;
  private String modo;
  
  public Radio(String marca){
	  this.marca = marca;
	  banda = "FM";
	  volume = 1;
	  sintonia= 87.1;
	  
  }
  
  public void ligar(){
	 if(ligado){
		 System.out.println("Rádio "+marca+" ja esta ligado ");	 
     }
     else{
		 ligado = true;
         System.out.println("Ligando Radio"+ marca);
     
	 }
  }
	  
  public void desligado(){
	  if(!ligado){
	      System.out.println("Radio "+marca+" ja esta desligado");
	  }
	  else{
		  ligado=false;
	      System.out.println("Desligando radio da "+marca);
	  }
  }
	  
	  
  public void sintonizar(double sintonia){
	if(sintonia <87.1 || sintonia > 107.09){
	   System.out.println("Estacao fora da faixa permitida para FM ");		
	}
	else{
		this.sintonia = sintonia;
		System.out.println("Nova Sintonia "+sintonia);
	}
  }
  public void alterarEstacao(boolean valor){
	  if(valor== true){
		banda = "FM";
		System.out.println("Nova banda FM");
	  }
	  else{
		  banda="AM";
		  System.out.println("Nova banda AM");
	  }
  }
	  
 public void aumentarVolume(){
	if (this.volume==10){
		System.out.println("Radio ja esta no volume maximo");
	} 
	else{
		this.volume++;
		System.out.println("Novo volume "+volume);
  }
 } 
  public void diminuirVolume(){
	  if(this.volume == 0){
		 System.out.println("Radio ja esta no volume minimo");
	  }
	  else{
		 this.volume--;
		 System.out.println("Novo volume "+volume);
			  
      }
  }
}