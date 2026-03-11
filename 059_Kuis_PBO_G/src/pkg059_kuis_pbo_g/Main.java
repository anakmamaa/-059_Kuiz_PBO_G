/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg059_kuis_pbo_g;
import java.io.InputStream;
import pkg059_kuis_pbo_g.SistemResepionis.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Object {
        // TODO code application logic here
        
        Scanner input = new Scannner(System.in);
        Reservasi[] antrean = new Reservasi[100];
        int jumlahSukses = 0;
        boolean isRunning = true;
        
        System.out.println("=== OOP HOTEL ===");
        
        while (isRunning && jumlahSukses < 100){
            System.out.println("\n---Input Reservasi Ke-" + (jumlahSukses + 1) + "---");
            
            try {
                System.out.println("Kode booking(awali 'HTL)");
                String kode = input.nextLine();
                
                System.out.println("Nama: ");
                String nama = input.nextLine();
                
                System.out.println("Nik : ");
                double nik = input.nextDouble();
                
                System.out.println("nomor : ");
                double nomor = input.nextDouble();
                
                System.out.println("Lama menginap(angka) : ");
                int lmp = input.nextInt();
                
                System.out.println("Kamar (1=standar, 2=deluxe, 3=suite): ");
                int kamar = input.nextInt();
                
                Profil profil = new Profil(nama, nik, nomor);
                
                switch (kamar) {
                    case 1:
                        antrean[jumlahSukses]= new KamarStandar(kode, profil, nik);
                        break;
                    case 2:
                        antrean[jumlahSukses]= new KamarDeluxe(kode, profil, nik);
                        break;

                    case 3:
                        antrean[jumlahSukses]= new KamarSuite(kode, profil, nik);
                        break;
                    default:
                        new DataReservasiInvalidException("Pilihan kamar tidak terdaftar");
                        break;
                }
                
                jumlahSukses++;
                System.out.println("[INFO] rESERVASI BERHASIL DITAMBAHKAN");
                
                
            } catch (DataReservasiInvalidException e){
                System.out.println("\n[DITOLAK]" + e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("\n[EROR SISTEM] INPUT ANGKA!");
                input.nextInt();
            }catch(Exception e){
                System.out.println("[FATAL] KESALAHAN TAK TERDUGA");
                String nextLine = input.nextLine();
            } 
            
            System.out.println("\n cetak tiket lain? (y/n): ");
            if(input.nextLine().equalsIgnoreCase("n")){
                isRunning = false;
            }
            
            System.out.println("=======================================");
            System.out.println("          REKAPITULASI                 ");
            System.out.println("=======================================");
            
            if(jumlahSukses == 0){
                System.out.println("belum ada reservasi");
            } else {
                for(int i = 0; i < jumlahSukses; i++){
                    Reservasi r = antrean[i];
                    
                    System.out.println("Kode booking: " + r.getKodeReservasi());
                    System.out.println("Total harga: " + r.gethitungHarga());                                                                                      
                }
            }
        }       
    }

