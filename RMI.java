// Remote: Common.java
import java.rmi.Remote;
import java.rmi.RemoteException;
interface Common extends Remote{
public String sayHello() throws RemoteException;
class Hello implements Common{
    public String sayHello()throws RemoteException{
        return "Hello";
    }
}

}


//Server.java
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
class Server{
    public static void main(String[] args) {
        try{
      Hello obj=new Hello();
      Registry reg=LocateRegistry.getRegistry();
      Common stub=(Common)UnicastRemoteObject.exportObject(obj, 0);
      reg.bind("Stub", stub);
      System.out.println("Server is ready");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


//Client.java

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
class Client{
    public static void main(String[] args) {
        try{
        Registry reg=LocateRegistry.getRegistry();
        Common obj=(Common) registry.lookup("stub");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

// Note we have to save all the files separately 