package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estoque2;

public class programaEstoque2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter produto");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeEstoque = sc.nextInt();

        Estoque2 estoque = new Estoque2(nome, preco, quantidadeEstoque);
            
        int opcao;
        System.out.println("Digite a opcao: \n1)Adcionar quantidade no estoque. \n2)Remover quantidade no estoque. \n3)Mostrar estoque. \n4)Mudar nome do produto. \n5)Mudar valor do produto \n0)Sair.");
        opcao = sc.nextInt();
        while(opcao != 0){
            if(opcao == 1){
                System.out.println("Digite a quantidade: ");
                estoque.adcionarEstoque(sc.nextInt());
            } else if(opcao == 2){
                System.out.println("Digite a quantidade: ");
                estoque.removerEstoque(sc.nextInt());
            } else if(opcao == 3){
                System.out.println();
                System.out.println(estoque.toString());
            } else if(opcao == 4){
                System.out.println("Digite o nome: ");
                
                sc.nextLine();
                estoque.setNome(sc.nextLine());
            } else if(opcao == 5){
                System.out.println("Digite o valor: ");
                estoque.setPreco(sc.nextDouble());
            }
            System.out.println();
            System.out.println("Digite a opcao: \n1)Adcionar quantidade no estoque. \n2)Remover quantidade no estoque. \n3)Mostrar estoque. \n4)Mudar nome do produto. \n5)Mudar valor do produto \n0)Sair.");

            opcao = sc.nextInt();
        }
        sc.close();
    }

}

