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
public abstract class Reservasi {
    protected String kode;
    protected Profil profil;
    protected double lamaMenginap;
    
    /**
     *
     * @param kode
     * @param profil
     * @param lamaMenginap
     * @throws DataReservasiInvalidException
     */
    public Reservasi(String kode, Profil profil, double lamaMenginap) throws DataReservasiInvalidException{
        if(!kode.startsWith("HTL")){
            throw new DataReservasiInvalidException("Kode booking wajib diawali 'HTL'");
        }
        
        if(lamaMenginap <= 0){
            throw new DataReservasiInvalidException("Lama Menginap harus lebih dari 0");
        }
        
        this.kode = kode;
        this.profil = profil;
        this.lamaMenginap = lamaMenginap;
    }
    
    public abstract double hitungHarga();
    
    public String getKode(){
        return kode;
    }
    
    public Profil getProfil(){
        return profil;
    }

    public String getKodeReservasi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String gethitungHarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
