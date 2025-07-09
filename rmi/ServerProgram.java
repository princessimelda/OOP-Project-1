
package rmi;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Remote;

public class ServerProgram {
    public static void main(String[] args)throws java.rmi.AlreadyBoundException {
        try{
            StudentDbImplementation implement = new StudentDbImplementation();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("StudentDatabase", (Remote) implement);
        } catch (RemoteException e){
            e.printStackTrace();
        }catch(AlreadyBoundException ex){
            ex.printStackTrace();
        }
    }
}
