package ie.gmit.sw;

import java.rmi.Naming;

public class Client {
	public static void main(String[] args) throws Throwable {
		/*
		 * Internet protocol: Service endpoint
		 * 
		 * <protocol>://ip:port/path/to/resource
		 */
		
		//Get a handle on the remote object through and endpoint address
		RemoteGreeting rg = (RemoteGreeting) Naming.lookup("rmi://127.0.0.1:1099/Howday");
		System.out.println(rg);
		
		//Make the remote invocation.
		String greeting = rg.getGreeting("Alan", 21); //Same as local invocation

		System.out.println(greeting);
	}
}
