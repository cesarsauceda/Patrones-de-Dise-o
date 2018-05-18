package Facade;

public class NumeroConfidencial {
	
	 private int NumeroCodigo=777;

	    

	    public int getNumeroCodigo() {
		return NumeroCodigo;
	}


		public boolean activarCodigo(int codigoaChecar){
	        if(codigoaChecar==getNumeroCodigo()){
	            return true;
	        }else{
	            return false;
	        }



	    }

}
