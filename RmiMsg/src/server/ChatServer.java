package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import client.ClientInterface;

public class ChatServer extends UnicastRemoteObject implements ServerInterface{
	private static final long serialVersionUID=1L;
	private ArrayList<ClientInterface> chatClients;
	protected ChatServer() throws RemoteException{
		chatClients=new ArrayList<ClientInterface>();
	}
	public synchronized void registerChatClient(ClientInterface chatClient)
		throws RemoteException{
		this.chatClients.add(chatClient);
	}
	public synchronized void broadcastMessage(String message)throws RemoteException{
		int i=0;
		while(i<chatClients.size()) {
			chatClients.get(i++).retrieveMessage(message);
		}
	}
}
