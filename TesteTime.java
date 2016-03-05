import java.util.Scanner;

public class TesteTime{
  public static void main(String args[]){
  Scanner entrada = new Scanner(System.in);
  
  int hora,minuto,segundo;
  
  Time t01;
  
  System.out.print("Insira a Hora: ");
  hora= entrada.nextInt();
  System.out.print("Insira os Minutos: ");
  minuto= entrada.nextInt();
  System.out.print("Insira os Segundos: ");
  segundo= entrada.nextInt();
  
  t01 = new Time(hora,minuto,segundo);
  
  t01.horaUniversal();
  t01.horaPadrao();
  
  }

}