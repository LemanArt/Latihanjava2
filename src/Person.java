/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leman
 */
public class Person {
    private String Nama;
    private String JenisKelamin;
    private Integer Umur;
    
    public void setNama(String Nama) {
        this.Nama = Nama;
}
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    // getter
    public String getNama() {
        return this.Nama;
    }
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }
    public int getUmur() {
        return this.Umur;
    }
}
