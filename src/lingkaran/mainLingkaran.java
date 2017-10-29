/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DIF
 */
public class mainLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menggambar Lingkaran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Memanggil fungsi garis yang ada di class Garis
        Garis hasil = new Garis();
        hasil.setxc(300); // nilai x
        hasil.setyc(280); // nilai y
        hasil.setR(150); // jari - jari
        System.out.println(hasil);
        
        //Menampilkan Frame
        frame.add(hasil);
        frame.setBackground(Color.ORANGE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

}
