import java.util.*;
public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        boolean menuAwal = true;
        while(menuAwal) {
            System.out.println("+================+");
            System.out.println(" Welcome to ISTTS");
            System.out.println("+================+");
            System.out.println();
            System.out.println("1. Register \n2. Login \n0. Exit");
            System.out.print(">> ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            if(pilihan == 1){
                register();
            }
            else if(pilihan == 2){
                login();
            }
            else if(pilihan == 0){
                menuAwal = false;
            }
            else{
                System.out.println("Tidak Valid!");
            }
        }
    }

    public static void login(){
        if(users.isEmpty()){
            System.out.println("Register dulu");
            return;
        }
        boolean menuLogin = true;
        while (menuLogin) {
            System.out.println("+================+");
            System.out.println(" Welcome to ISTTS");
            System.out.println("+================+");
            System.out.println();
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            boolean loginSukses = false;
            for (User pengguna : users) {
                if(pengguna.getUsername().equals(username) && pengguna.getPassword().equals(password)){
                    loginSukses = true;
                    pengguna.tampilanMenu(scanner);
                    menuLogin = false;
                    break;
                }
            }
            if (!loginSukses) {
                System.out.println("Username atau Password salah");
                menuLogin = false;
            }
        }
    }

    public static void register(){
        boolean menuRegis = true;
        boolean usernameAda = false;
        while (menuRegis) {
            System.out.println("+================+");
            System.out.println(" Welcome to ISTTS");
            System.out.println("+================+");
            System.out.println();
            System.out.println("1. Mahasiswa");
            System.out.println("2. Dosen");
            System.out.println(">> ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            if(pilihan != 1 && pilihan != 2){
                System.out.println("Gak ada");
                continue;
            }
            System.out.print("Username: ");
            String username = scanner.nextLine();
            for (User pengguna : users) {
                if(pengguna.getUsername().equals(username)){
                    System.out.println("Username sudah terdaftar");
                    usernameAda = true;
                    return;
                }
            }
            if(usernameAda){
                return;
            }
            System.out.print("Password: ");
            String password = scanner.nextLine();
            if(pilihan == 1){
                System.out.print("Nama lengkap: ");
                String namaLengkap = scanner.nextLine();
                System.out.print("NIM          : ");
                String nim = scanner.nextLine();
                System.out.print("UKM/Organisasi: ");
                String ukm = scanner.nextLine();
                users.add(new Mahasiswa(username, password, namaLengkap, nim, ukm));
                System.out.println("Register berhasil");
            }
            else if(pilihan == 2){
                System.out.print("Nama lengkap: ");
                String namaLengkap = scanner.nextLine();
                System.out.print("NIDN         : ");
                String nidn = scanner.nextLine();
                users.add(new Dosen(username, password, namaLengkap, nidn));
            }
            menuRegis = false;
        }
    }

}
