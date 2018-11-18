package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import server.ServerInterface;

public class ClientMain{

	public static void main(String[] args)
			 throws MalformedURLException, RemoteException,NotBoundException{
		String chatServerURL="rmi://localhost/RMIChatServer";
		ServerInterface chatServer=(ServerInterface) Naming.lookup(chatServerURL);
		new Thread(new ChatClient(args[0],chatServer)).start();
	}
}
