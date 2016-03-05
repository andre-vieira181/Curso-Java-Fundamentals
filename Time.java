public class Time{
//Atributos
   int h=0,m,s;

   public Time(int h,int m, int s){
	  this.h=h;
  	  this.m=m;
	  this.s=s;
   }
	
	void horaUniversal(){
	  System.out.print(h+" Hora ");
	  System.out.print(m+" Minutos ");
	  System.out.print(s+ " Segundos ");
	}
	void horaPadrao(){
		if(h>12)
		{System.out.print("A hora padrao e: "+(h-12)+" "+m+" "+s+" PM");	
		}
		if(h==0){
		 System.out.print("A hora padrao e: "+(h+12)+" "+m+" "+s+" AM");	
		}
		else{
			System.out.print(" A hora padrao e: "+h+" "+m+" "+s+" AM");
		}
		
	}
	
}


