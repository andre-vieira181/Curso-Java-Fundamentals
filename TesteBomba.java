import java.util.Scanner;

public class TesteBomba{
  public static void main(String args[]){
  Scanner entrada = new Scanner(System.in);
  
  //Váriaveis
  String  combustivel;
  float   precoLitro;
  double  qtdeLitros;
  double  totalPagar;
  boolean emAbastecimento;
  
  
  BombaDeCombustivel b01;
  
  System.out.print("Qual o combustivel: ");
  combustivel = entrada.nextLine;
  System.out.print("Valor do litro: ");
  precoLitro = entrada.nextFloat;
  
  b1 = new BombaDeCombustivel(String combustivel,float precoLitro);
  
  b1.tirarGancho();
  b1.abastecerPorLitro();
  
  
  
  }


}