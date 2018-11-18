package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.ClientInterface;

public interface ServerInterface extends Remote{
	void registerChatClient(ClientInterface chatClient) throws RemoteException;
	void broadcastMessage(String message) throws RemoteException;
}
