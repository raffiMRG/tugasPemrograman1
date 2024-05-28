package com.coba1gui;

import javax.swing.*; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mrg
 */
public class Coba1GUI {

    public static void main(String[] args) {
        // instansiasi jframe
        JFrame form = new JFrame("coba 1 gui cara manual");
        // atur ukuran frame
        form.setSize(400, 300);
        // atur agar program berhenti ketika user menekan tombol close
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // atur agar ketika program dijalankan akan berada di tengah layar dan tidak relatif ke posisi 0,0
        form.setLocationRelativeTo(null);
        // mengatur layout secara manual
        
        // ============= bagian komponen =================
        // instansiasi JLabel
        JLabel judul = new JLabel("Ini Label Coba 1");
        // mengatur posisi dan ukuran komponen
        judul.setBounds(150, 20, 200, 10);
        // menambahkan komponen ke form / container
        form.add(judul);
        
        // bagian kode buku 
        JLabel kodeBuku = new JLabel("Kode Buku");
        kodeBuku.setBounds(20, 55, 100, 10);
        form.add(kodeBuku);
        
        JTextField kodeBukuText = new JTextField();
        kodeBukuText.setBounds(120, 50, 200, 25);
        form.add(kodeBukuText);
        
        // bagian nama buku 
        JLabel namaBuku = new JLabel("Nama Buku");
        namaBuku.setBounds(20, 90, 100, 10);
        form.add(namaBuku);

        JTextField namaBukuText = new JTextField();
        namaBukuText.setBounds(120, 85, 200, 25);
        form.add(namaBukuText);
        
        // bagian membershp
        JLabel membershp = new JLabel("Membership");
        membershp.setBounds(20, 125, 100, 15);
        form.add(membershp);
        
        JRadioButton radioEksklusif = new JRadioButton();
        radioEksklusif.setText("Eksklusif");
        radioEksklusif.setBounds(120, 120, 80, 25);
        form.add(radioEksklusif);
        
        JRadioButton radioUmum = new JRadioButton();
        radioUmum.setText("Umum");
        radioUmum.setBounds(200, 120, 80, 25);
        form.add(radioUmum);

        ButtonGroup grupMembership = new ButtonGroup();
        grupMembership.add(radioEksklusif);
        grupMembership.add(radioUmum);
        
        // bagian biaya perhari
        JLabel biayaPerhari = new JLabel("Biaya Perhari");
        biayaPerhari.setBounds(20, 160, 100, 15);
        form.add(biayaPerhari);
        
        JTextField biayaPerhariText = new JTextField();
        biayaPerhariText.setBounds(120, 155, 200, 25);
        form.add(biayaPerhariText);
        
        
        
        
        
        
        
        
        form.setLayout(null);
        
        // menampilkan GUI kelayar
        form.setVisible(true);
    }
}
