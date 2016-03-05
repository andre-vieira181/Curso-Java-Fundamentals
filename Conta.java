public class Conta{
  private String nomeTitular;
  private String cpf;
  private int numeroConta;
  protected float saldo;
  
	//Construtor
  public Conta(String nomeTitular,String cpf, int numeroConta){
	this.nomeTitular = nomeTitular;
	this.cpf         = cpf;
	this.numeroConta = numeroConta;
	this.saldo       =0.0f;
	  
  }

	//Setter e getter.
    public void setNometitular(String nomeTitular){
	  this.nomeTitular=nomeTitular;	
    }
	public String getNomeTitular(){
	  return this.nomeTitular;	
	}
	public void setCpf(String cpf){
	  this.cpf=cpf;		
	}
	public String getCpf(){
	  return this.cpf;	
	}
	public void setNumeroConta(int numeroConta){
	  this.numeroConta=numeroConta;
	}
	public int getNumeroConta(){
	  return this.numeroConta;
	}  
	public float getSaldo(){
	  return this.saldo;
	} 
	
	protected void setSaldo(float saldo){
		this.saldo=saldo;
	}
	 
	//Metodo imprimir	
    public void imprimir(){
	  System.out.println("==================================");	
	  System.out.println(" Titular da conta: "+nomeTitular);
	  System.out.println(" CPF: "+cpf);
	  System.out.println(" Conta: "+numeroConta);
	  System.out.println(" Saldo: "+saldo);	
	  System.out.println("==================================");
    }
	
	//Metodo Creditar
	public void creditar(float valor){
		saldo = saldo + valor;
	}
		
	//Metodo Debitar
    public boolean debitar(float valor){
	  if (valor > saldo){
		  return false;
	  }
	  else {
		saldo = saldo - valor;
		return true;	
	  }
	
	
 }
}