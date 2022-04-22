package application;
import entities.Vetor2;
import java.util.Locale;
import java.util.Scanner;


public class vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Vetor2[] vect = new Vetor2[10];
        System.out.println("quantos quartos para ser reservados:");
        int numeroEstudantes = sc.nextInt();
        for(int i = 0; i<numeroEstudantes; i++){
            System.out.println("digite o quarto escohido: ");
            int quartoEscolhido = sc.nextInt();
            sc.nextLine();
            System.out.println("digite o nome: ");
            String name = sc.nextLine();
            System.out.println("digite o email: ");
            String email = sc.nextLine();
            vect[quartoEscolhido] = new Vetor2(name, email);
        }

        for(int i=0; i<10; i++){
            if(vect[i] != null ){
                System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }


        sc.close();
    }
}
