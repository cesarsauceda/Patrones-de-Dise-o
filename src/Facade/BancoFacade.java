package Facade;

public class BancoFacade {
	
	private int NumeroTarjetaCheck;
    private int NipTarjetaCheck;

    //Se instancian las clases a las cuales hará uso
    NumerodeTarjeta numerodeTarjeta;
    NumeroConfidencial numeroConfidencial;
    FuncionesdelCheque funcionesdelCheque;

    public BancoFacade(int Tarjeta, int Nip){
        NumeroTarjetaCheck=Tarjeta;
        NipTarjetaCheck=Nip;


        numerodeTarjeta= new NumerodeTarjeta();
        numeroConfidencial =new NumeroConfidencial();
        funcionesdelCheque=new FuncionesdelCheque();

    }

    public int getNumeroTarjetaCheck() {
        return NumeroTarjetaCheck;
    }

    public int getNipTarjetaCheck() {
        return NipTarjetaCheck;
    }

    public void SacarDinero(double Dinero){

        if (numerodeTarjeta.activarCuenta(getNumeroTarjetaCheck())
                &&numeroConfidencial.activarCodigo(getNipTarjetaCheck())
                &&funcionesdelCheque.DineroSuficiente(Dinero)){
        	System.out.println("Transaccion Correcta\n");

        	//Valida con las clases  
        
        }
        else {
        	System.out.println("Transaccion Fallida\n");
        	
        }

    }

    public void DepositarDinero(double Dinero){
        if (numerodeTarjeta.activarCuenta(getNumeroTarjetaCheck())
                &&numeroConfidencial.activarCodigo(getNipTarjetaCheck())){
            funcionesdelCheque.HacerDeposito(Dinero);
            System.out.println("Transaccion Correcta\n");
        }else {
        	System.out.println("Transaccion Fallida\n");
        	
        }
    }

}
