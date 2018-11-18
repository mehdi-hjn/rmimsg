



cd /******/RmiMsg/bin

terminal1: rmic server.ChatServer
	 : rmiregistry

terminal2: java server.ServerMain 

terminal3: java client.ClientMain user1

terminal4: java client.ClientMain user2
