public class exe1{
   public static void main(String args[]){
   int valor;
   int u, d, c, r, novoValor;
 
   if (args.length ==1){
   //pego o valor da linha de comando e converto para fazer as contas
   valor = Integer.parseInt(args[0]);
   
   c=valor/100; // isolei a centena ex: 456/100 --> 4
   r=valor%100; // isolo o resto         456%100 --> 56
   
   d= r/10;  //isolo a dezena       ex: 56/10   --> 5
   u= r%10;  //isolo a unidade          56%10   --> 6

   novoValor= u*100 + d*10 +c;

   System.out.println("Novo valor = "+ novoValor);   
   }
   else{
	 System.out.println("Informe um valor de 3 digitos, seu animal!");  
   }
   }
   }