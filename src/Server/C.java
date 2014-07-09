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

import static Server.Server.numbers;
import java.lang.*;
import java.rmi.*; 
import java.rmi.server.*;

public class C extends UnicastRemoteObject implements I {
    int order_number;
    
    
    public C(int nr) throws RemoteException {
         order_number = nr;
         
         
     }
    
    public boolean prime(double x) throws RemoteException{
       if(x==1||x==-1||x==0){
           return false;
       }
        for(int i= Math.abs((int)x/2); i>1; i--)
            if(x%i == 0)
                return false;
        return true;
       
      
    }
    
    public String getElement() throws RemoteException{
        
        
        return numbers;
            
        
    }
}