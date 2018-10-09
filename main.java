/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author toshiba
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        System.out.println("----------Object Kelas Kotak-----------");
        //Buat object dari kelas kotak
        Kotak main = new Kotak();
        //mengatur ukuran kotak
        main.setPanjang(22.10);
        main.setLebar(26.98);

        //memanggil object kotak
        System.out.println("panjang: " + main.getPanjang());
        System.out.println("lebar: " + main.getLebar());
        System.out.println("luas: " + main.getPanjang() * main.getLebar());
        System.out.println("keliling: " + main.getPanjang() * main.getLebar() * main.getPanjang() * main.getLebar());

        System.out.println("----------------Object Kelas Mahasiswa---------------");
        Mahasiswa Mahasiswa = new Mahasiswa();

        Mahasiswa.nama = "Sirajuddin";
        Mahasiswa.nim = "D0217340";
        Mahasiswa.alamat = "Galung Tengah";
        Mahasiswa.golonganDarah = "-";
        Mahasiswa.status = "Mahasiswa";
        Mahasiswa.tinggiBadan = "154";
        Mahasiswa.beratBadan = "45";

        //getter mahasiswa
        System.out.println("nama: " + Mahasiswa.getNama());
        System.out.println("nim: " + Mahasiswa.getNim());
        System.out.println("alamat: " + Mahasiswa.getAlamat());
        System.out.println("golongan darah: " + Mahasiswa.getGolonganDarah());
        System.out.println("status: " + Mahasiswa.getStatus());
        System.out.println("tinggi badan: " + Mahasiswa.getTinggiBadan());
        System.out.println("berat badan: " + Mahasiswa.getBeratBadan());

        System.out.println("---------------Objek Node---------------");
        //membuat object dari kelas note
        node node = new node();
        node.Label = "Extra Joss";
        node.Value = 3;

        //getter node
        System.out.println("Nama Label: " + node.getLabel());
        System.out.println("Jumlah Label: " + node.getValue());

        System.out.println("-------------object class -------------");
        //membuat object kelas stack
        stack stack = new stack();

        stack.value[0] = "SIRAJUDDIN";
        stack.value[1] = "Paulo Dybala";
        stack.value[2] = "Moh Salah";
        stack.value[3] = "Fiersa Besari";
        stack.value[4] = "countinho";
        stack.value[5] = "messi";
        stack.setValueAt(6, "ronaldo");

        for (int i = 0; i < stack.value.length; i++) {
            System.out.println(stack.value[i]);};

        }
    
}
