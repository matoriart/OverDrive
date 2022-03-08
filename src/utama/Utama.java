/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

/**
 *
 * @author user
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sapi obj = new sapi();
        System.out.println(obj.X());
        System.out.println(obj.Y());
        System.out.println("===========================================");
        cecek obj2 = new cecek();
        System.out.println(obj2.X());
        System.out.println(obj2.Y());
    }
    
}
