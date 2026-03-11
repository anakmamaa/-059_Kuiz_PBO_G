/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg059_kuis_pbo_g.SistemResepionis;

import pkg059_kuis_pbo_g.*;

/**
 *
 * @author Lab Informatika
 */
public class Profil {
    private final String nama;
    private final double nik;
    private final double nomor;
    
    public Profil(String nama, double nik, double nomor){
        this.nama = nama;
        this.nik = nik;
        this.nomor = nomor;
    }
    
    public String getInfoProfil(){return nama + " " + nik + " nomor: " + nomor;
}
}
