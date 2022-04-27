package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estoque;

public class programaEstoque {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();

        System.out.println("enter produto");
        System.out.print("Nome: ");
        estoque.nome = sc.nextLine();
        System.out.print("Preco: ");
        estoque.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        estoque.quantidadeEstoque = sc.nextInt();

        System.out.println(estoque.nome + " , " + estoque.preco + " , " + estoque.quantidadeEstoque);
        
        int opcao;
        System.out.println("Digite a opcao: \n1)Adcionar quantidade no estoque. \n2)Remover quantidade no estoque. \n0)Sair.");
        opcao = sc.nextInt();
        while(opcao != 0){
            if(opcao == 1){
                System.out.println("Digite a quantidade: ");
                estoque.adcionarEstoque(sc.nextInt());
            } else if(opcao == 2){
                System.out.println("Digite a quantidade: ");
                estoque.removerEstoque(sc.nextInt());
            } else if(opcao == 3){
                System.out.println(estoque.toString());
            }
            System.out.println();
            opcao = sc.nextInt();
            System.out.println("Digite a opcao: \n1)Adcionar quantidade no estoque. \n2)Remover quantidade no estoque. \n0)Sair.");          
        }
        sc.close();
    }

}