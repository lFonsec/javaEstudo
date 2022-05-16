package application;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userprofile = System.getenv("USERPROFILE");
        String path = userprofile + "\\Documents\\Java\\JavaEstudo1\\src\\sumary.csv";
        System.out.println(path);
        sc.close();
    }
}
