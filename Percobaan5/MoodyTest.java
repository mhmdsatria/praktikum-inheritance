/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author marse
 */
public class MoodyTest {

    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        m.speak();

        m = new HappyObject();
        m.speak();
        m.laugh();

        m = new SadObject();
        m.speak();
        m.cry();
    }
}
