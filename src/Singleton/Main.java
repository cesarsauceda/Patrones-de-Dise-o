package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor monitor1=Monitor.getmMonitor();
		Monitor monitor2=Monitor.getmMonitor();
		
		System.out.println(monitor1.hashCode());
		System.out.println(monitor2.hashCode());
		
	}


}
