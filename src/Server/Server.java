/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
/**
 *
 * @author Oana-Maria
 */
public class Server {
    static String numbers = "" ;
    
    public static void main(String[] args) throws Exception {
    Generator Ob = new Generator();
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Port : ");
        int port = sc.nextInt();
        Registry reg = LocateRegistry.createRegistry(port);
        reg.rebind("rmi:///Ob",Ob);
        System.out.println("Server has been bound with" +
                           " RMI registry\nInser numbers(with an enter after each number"
                           + "and when you have finished "
                           + "just write down a character) :\n");
        while(sc.hasNextDouble()){
            numbers = numbers +Double.toString(sc.nextDouble())+" ";
        }
       
       
       
    }
    catch(Exception e){
        System.out.println("Log out!");
        System.exit(0);
    }
 }
}

    

