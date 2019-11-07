/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan58.tambahkurang;

/**
 *
 * @author RyanJuan
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        Bilangan b = new Bilangan();
        System.out.println("Hasil Selisih : " + b.getX() + " - " + b.getY() + " = " + (b.getX()-b.getY()));
    }
}
