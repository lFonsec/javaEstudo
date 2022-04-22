package application;
import entities.Vetor;
import java.util.Locale;
import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vetor[] vect = new Vetor[n];
        for(int i = 0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Vetor(name, price);
        }

        double sum = 0.0;

        for(int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/n;
        System.out.println("Soma dos precos: " + sum + " Media dos precos: " + avg);

        sc.close();
    }
}
