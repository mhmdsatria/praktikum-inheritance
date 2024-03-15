/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author marse
 */
public class Manajer extends Pegawai {

    public String departemen;

    public void isiData(String n, String d) {
        setNama(n);
        departemen = d;
    }
}
