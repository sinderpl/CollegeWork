package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servant {
	public static void main(String[]args)throws Throwable {
		//Start the registry on the default port
		LocateRegistry.createRegistry(1099); //The first 1024 port require root access
		
		
		//Instantiate the remote object
		RemoteGreeting greeting = new RemoteGreetingImpl();
		
		Naming.bind("Howday", greeting);
		System.out.println("Server ready....");
	}
}
