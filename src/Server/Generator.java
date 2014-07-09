/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

/**
 *
 * @author Oana-Maria
 */
import java.rmi.*;
import java.rmi.server.*;
public class Generator extends UnicastRemoteObject implements I_Generator {
    static int contor;
    Generator() throws RemoteException {}
    public I own_server() throws Exception {
        return new C(contor++);
    }

}