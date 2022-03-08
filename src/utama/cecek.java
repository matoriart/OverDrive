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
public class cecek extends Hewans {
    @Override
    String X() {
        System.out.println(super.X());
        return "Cicak makan laron";
    }
    @Override
    String Y() {
        System.out.println(super.Y());
        return "Cicak berkembangbiak dengan cara bertelur";
    }
}
