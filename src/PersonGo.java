/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leman
 */
public class PersonGo {

    public static void main(String[] args) {
        Person Anton = new Person();
        Person Riko = new Person();

        Anton.setNama("Anton");
        Anton.setJenisKelamin("Laki-laki");
        Anton.setUmur(19);

        Riko.setNama("Riko");
        Riko.setJenisKelamin("Laki-laki");
        Riko.setUmur(21);

        System.out.println("Nama: " + Anton.getNama());
        System.out.println("JenisKelamin: " + Anton.getJenisKelamin());
        System.out.println("Umur: " + Anton.getUmur());
        System.out.println("\nNama: " + Riko.getNama());
        System.out.println("JenisKelamin: " + Riko.getJenisKelamin());
        System.out.println("Umur: " + Riko.getUmur());
    }
}
