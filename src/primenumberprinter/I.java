/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumberprinter;

/**
 *
 * @author Oana-Maria
 */
import java.rmi.*;

public interface I extends Remote{
    boolean prime( double x) throws RemoteException;
    String getElement(int i) throws RemoteException;
}
