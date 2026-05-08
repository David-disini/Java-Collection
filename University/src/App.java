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
                    menu(pengguna);
                    menuLogin = false;
                    break;
                }
                if (!loginSukses) {
                    System.out.println("Username atau Password salah");
                    menuLogin = false;
                }
            }
        }
    }

    public static void register(){
        boolean menuRegis = true;
        while (menuRegis) {
            System.out.println("+================+");
            System.out.println(" Welcome to ISTTS");
            System.out.println("+================+");
            System.out.println();
            System.out.print("Username: ");
            String username = scanner.nextLine();
            for (User pengguna : users) {
                if(pengguna.getUsername().equals(username)){
                    System.out.println("Username sudah terdaftar");
                    return;
                }
            }
            System.out.print("Password: ");
            String password = scanner.nextLine();
            users.add(new User(username, password));
            System.out.println("Register berhasil");
            menuRegis = false;
        }
    }

    public static void menu(User user){
        System.out.println("+================+");
        System.out.println(" Welcome to ISTTS " + user.getUsername());
        System.out.println("+================+");
        System.out.println();
        System.out.println("Interaksi yang dapat dipilih:");
        System.out.println("1. Informasi data \n2. Jadwal Kelas \n3. List Dosen \n4. Map Kampus");
        System.out.println(">> ");
        int pilihanMenu = scanner.nextInt();
        scanner.nextLine();
        switch (pilihanMenu) {
            case 1:
                informasiData();
                break;
            case 2:
                
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                break;
        }
    }

    public static void informasiData(){

    }
}
