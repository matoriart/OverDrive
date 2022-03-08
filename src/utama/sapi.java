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
public class sapi extends Hewans {
    @Override
    String X() {
        System.out.println(super.X());
        return "Sapi makan rumput";
    }
    @Override
    String Y() {
        System.out.println(super.Y());
        return "Sapi berkembangbiak dengan cara melahirkan";
    }
}
