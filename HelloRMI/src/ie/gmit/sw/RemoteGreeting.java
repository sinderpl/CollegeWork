package ie.gmit.sw;
import java.io.*;
import java.rmi.*;
public interface RemoteGreeting extends Remote, Serializable{
	public String getGreeting(String name, int age) throws RemoteException;
}
