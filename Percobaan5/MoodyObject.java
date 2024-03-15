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
public class MoodyObject {
    protected String getMood (){
        return "moody :[";
    }
    public void speak(){
        System.out.println("I am " + getMood());
    }
    void laugh(){}
    void cry (){}
}

