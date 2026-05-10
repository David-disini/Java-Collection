import java.util.*;
public class Mahasiswa extends User {
    private String nim;
    private String ukm;

    public Mahasiswa(String username, String password, String namaLengkap, String nim, String ukm) {
        super(username, password, namaLengkap);
        this.nim = nim;
        this.ukm = ukm;
    }
    
    @Override
    public void tampilanMenu(Scanner scanner) {
        System.out.println("=== Dashboard Mahasiswa ===");
        System.out.println("Nama   : " + getNamaLengkap());
        System.out.println("NIM    : " + this.nim);
        System.out.println("UKM    : " + this.ukm);
        System.out.println("---------------------------");
        System.out.println("1. Cek Nilai");
        System.out.println("2. Jadwal Kelas Praktikum");
        System.out.println("3. Info Organisasi (" + this.ukm + ")");
        System.out.println("0. Logout");
        System.out.print(">> ");
    }
}
