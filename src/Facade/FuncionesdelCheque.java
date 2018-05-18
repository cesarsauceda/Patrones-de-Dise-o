package Facade;

public class FuncionesdelCheque {
	 public double Saldo=10000;

	    public double getSaldo() {
	        return Saldo;
	    }

	    public void Retirar(double Retiro){
	        Saldo-=Retiro;
	    }
	    public void Depositar(double Deposito){
	        Saldo+=Deposito;
	    }

	    public boolean DineroSuficiente(double dinero){
	        if (dinero>getSaldo()){
	        	System.out.println("Dinero Insuficiente");
	        	System.out.println("Tu Saldo es de: "+ getSaldo());
	            return false;
	        }else{
	        	Retirar(dinero);
	        	System.out.println("RetiroExitoso");
	        	System.out.println("Tu Saldo es de: "+ getSaldo());
	        	return true;
	        }

	    }

	    public void HacerDeposito(double dineroaDepositar){
	        Depositar(dineroaDepositar);
	        System.out.println("Deposito Exitoso: Su saldo es: "+getSaldo());
	        
	    }
}
