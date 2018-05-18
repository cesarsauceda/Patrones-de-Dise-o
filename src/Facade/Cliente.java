package Facade;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BancoFacade bf=new BancoFacade(1234567890,777);
		
		bf.DepositarDinero(1000);
		bf.SacarDinero(1000);
		bf.SacarDinero(3000);
		bf.SacarDinero(9000);
		
		
		//El cliente hace las peticiones al Banco que es el que se encarga de LLamar a la clase que necesite
		//
		
		

	}

}
