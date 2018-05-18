package Facade;

public class NumerodeTarjeta {
	
	private int NumerodeTarjeta=1234567890;

    public int getNumerodeTarjeta(){
        return getNumerodeTarjeta();
    }

    public boolean activarCuenta(int tarjetaaChecar){
        if(tarjetaaChecar==NumerodeTarjeta){
            return true;
        }else{
            return false;
        }



    }

}
