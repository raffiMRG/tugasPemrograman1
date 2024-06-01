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
        form.setSize(400, 550);
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
        
        // bagian tanggal pinjam
        JLabel labelTanggalPinjam = new JLabel("Tanggal Pinjam");
        labelTanggalPinjam.setBounds(20, 200, 100, 15);
        form.add(labelTanggalPinjam);
        
        String hari[] = new String[31];
        for (int i = 0; i <hari.length; i++) {
            hari[i] = Integer.toString(i+1);
        }
        
        JComboBox comboHari = new JComboBox(hari);
        comboHari.setBounds(120, 195, 40, 25);
        form.add(comboHari);
        
        String bulan[] = {"Jan", "Feb", "Mar", "Apr", "Mei", "jun", "Jul", "Ags", "Sep", "Okt", "Nov", "Des"};
        JComboBox comboBulan = new JComboBox(bulan);
        comboBulan.setBounds(180, 195, 55, 25);
        form.add(comboBulan);
        
        String tahun[] = new String[15];
        for (int i = 0; i <tahun.length; i++) {
            tahun[i] = Integer.toString(i+2010);
        }
        JComboBox comboTahun = new JComboBox(tahun);
        comboTahun.setBounds(250, 195, 70, 25);
        form.add(comboTahun);
        
        // bagian lama pinjam
        JLabel labelLamaPinjam = new JLabel("Lama Pinjam");
        labelLamaPinjam.setBounds(20, 240, 100, 15);
        form.add(labelLamaPinjam);
        
        String lamaPinjam[] = {"1", "2", "3", "4", "5", "6", "7"}; 
        JComboBox comboLamaPinjam = new JComboBox(lamaPinjam);
        comboLamaPinjam.setBounds(120, 235, 40, 25);
        form.add(comboLamaPinjam);
        
        JLabel labelHariLamaPinjam = new JLabel("Hari");
        labelHariLamaPinjam.setBounds(170, 235, 50, 25);
        form.add(labelHariLamaPinjam);
        
        // bagian total biaya
        JLabel totalBiaya = new JLabel("Total Biaya");
        totalBiaya.setBounds(20, 280, 100, 15);
        form.add(totalBiaya);
        
        JTextField totalBiayaText = new JTextField();
        totalBiayaText.setBounds(120, 275, 200, 25);
        form.add(totalBiayaText);
        
        // bagian Jumlah Bayar
        JLabel JumlahBayar = new JLabel("Jumlah Bayar");
        JumlahBayar.setBounds(20, 320, 100, 15);
        form.add(JumlahBayar);
        
        JTextField JumlahBayarText = new JTextField();
        JumlahBayarText.setBounds(120, 315, 200, 25);
        form.add(JumlahBayarText);
        
        // bagian Kembalian
        JLabel Kembalian = new JLabel("Kembalian");
        Kembalian.setBounds(20, 360, 100, 15);
        form.add(Kembalian);
        
        JTextField KembalianText = new JTextField();
        KembalianText.setBounds(120, 355, 200, 25);
        form.add(KembalianText);
        
        // bagian Simpan | Reset
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(120, 395, 80, 25);
        form.add(btnSimpan);
        
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(240, 395, 80, 25);
        form.add(btnReset);
        
        System.out.println("Done");
        
        form.setLayout(null);
        
        // menampilkan GUI kelayar
        form.setVisible(true);
    }
}
