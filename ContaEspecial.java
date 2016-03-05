public class ContaEspecial extends Conta{
   private float limite;
   
   public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float limite){
	   super(nomeTitular,cpf,numeroConta);	
	   this.limite = limite;  
   }
	
	public void imprimir(){
		System.out.println("*********************");
		System.out.println("Conta Especial ***");
		System.out.println("Nome     "+super.getNomeTitular()+" Conta No "+super.getNumeroConta());
		System.out.println("CPF      "+super.getCpf()); 
		System.out.println("Saldo R$ "+super.getSaldo() + "Limite R$ "+this.limite);
	}
	public boolean debitar(float valor){
		if(valor<=super.getSaldo()+this.limite){
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}
		else{
			return false;
		}
	}

}