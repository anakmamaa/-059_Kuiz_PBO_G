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
public class KamarSuite extends Reservasi implements LayananEksklusif {
    
    public KamarSuite(String kode, Profil profil, double lamaMenginap) throws DataReservasiInvalidException {
    super(kode, profil, lamaMenginap);
}

    @Override
    public double hitungHarga(){
    return lamaMenginap * 1000000;
}

    @Override
    public String getFasilitasTambahan(){
    return "Sarapan Prasmanan dan Akses Kolam Renang VIP";
}
    
}
