package application;
import java.util.Scanner;

import entities.Account;

public class programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite os dados da conta: ");
            System.out.print("Numero da conta: ");
            int n = sc.nextInt();
            System.out.print("Nome do dono da conta: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();
            
            Account account = new Account(n, nome, saldo, limiteSaque);

            System.out.println("Oque deseja fazer: ");
            System.out.print("1) Saque \n2) Deposito\n");
            int x = sc.nextInt();
            System.out.println();

            if(x == 1){
                System.out.print("Digite o valor a ser sacado: ");
                double saque = sc.nextDouble();
                account.Withdraw(saque);
                System.out.println();
                System.out.print("Novo saldo: " + account.getBalance());
            }else if(x == 2){
                System.out.print("Digite o valor a ser depositado: ");
                double balance = sc.nextDouble();
                account.Deposit(balance);
                System.out.println();
                System.out.print("Novo saldo: " + account.getBalance());
            }else{
                System.out.println("Opção incorreta");
            }
   
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
