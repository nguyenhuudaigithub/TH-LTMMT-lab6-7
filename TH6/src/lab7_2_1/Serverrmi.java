/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2_1;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author ad
 */
public class Serverrmi {
    public static void main(String args[]){
     try{
            Calc c= new Calc();
            Registry r= LocateRegistry.createRegistry(3456);
            r.bind("rmiCalc", c);
        }catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
