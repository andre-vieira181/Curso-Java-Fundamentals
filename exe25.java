public class exe25{
   public static void main(String args[]){
   double  ze,chico;
   int anos;
   
   chico = 1.50;
   ze = 1.10;
   anos = 0;
   
   while(chico > ze){
	chico=chico+0.02;
    ze=ze+0.03;
   anos=anos+1;}
   
   System.out.println("Levou cerca de: "+ anos + " anos");
   
   
   
   
   
   }
 }