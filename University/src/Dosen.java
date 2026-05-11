import java.util.*;;
public class Dosen extends User {
    private String nidn;

    public Dosen(String username, String password,String namaLengkap, String nidn) {
        super(username, password, namaLengkap);
        this.nidn = nidn;
    }

    @Override
    public void tampilanMenu(Scanner scanner) {
        boolean isMenuDosenAktif = true;
        while (isMenuDosenAktif) {
            System.out.println("\n=== Dashboard Dosen ===");
            System.out.println("Nama   : " + getNamaLengkap());
            System.out.println("NIDN   : " + this.nidn);
            System.out.println("-----------------------");
            System.out.println("1. Lihat Jadwal Mengajar");
            System.out.println("0. Logout");
            System.out.print(">> ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    jadwalMengajar();
                    break;
                case 0:
                    isMenuDosenAktif = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void jadwalMengajar(){

    }

    public String getNidn() {
        return nidn;
    }
}
