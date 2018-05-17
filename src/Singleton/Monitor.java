package Singleton;

public class Monitor {
	
	private static Monitor mMonitor; //Se crea un objeto del tipo de la clase
	
	private Monitor() { //Se crea el constructor de la clase
		System.out.println("El constructor de Monitor ah sido llamado");
		
	}

	public static Monitor getmMonitor() {    //Se crea el Getter para poder pasar los datos
		
		if(mMonitor==null) {				//Validacion si el objeto de tipo Monitor en nulo que 
			mMonitor=new Monitor();			//Realice una nueva instancia
		}
		return mMonitor;					//retorna el objeto
	}
	

}
