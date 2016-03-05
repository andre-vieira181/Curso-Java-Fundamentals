import javax.swing.*;


public class Programabonito{
   public static void main(String args[]){
   String texto;
   
   texto = JOptionPane.showInputDialog("Digite alguma coisa");
   
   JOptionPane.showMessageDialog(null, texto, "Resultado da Digitacao", JOptionPane.PLAIN_MESSAGE);
   
   System.exit(0);   

 }
}