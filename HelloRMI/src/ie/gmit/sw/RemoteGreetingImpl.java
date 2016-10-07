package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class RemoteGreetingImpl extends UnicastRemoteObject implements RemoteGreeting {

	public RemoteGreetingImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public RemoteGreetingImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
		super(port, csf, ssf);
		// TODO Auto-generated constructor stub
	}

	public RemoteGreetingImpl(int port) throws RemoteException {
		super(port);
		// TODO Auto-generated constructor stub
	}

	public void Foo(String s){
		System.out.println(">>>>>>>>>>"+s);
	}
	
	public String fee(String s) throws RemoteException{
		return "Fee-----"+s;
	}

	public String getGreeting(String name, int age) throws RemoteException {
		return "Hello, "+name+". You are "+age+" years old...";
	}
}
