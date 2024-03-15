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
public class HappyObject extends MoodyObject{

    HappyObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    protected String getMood(){
        return "happy";
    }
    public void laugh(){
        System.out.println("Hahaha:)");
    }
}
