package application;

import java.util.Locale;
import java.util.Scanner;
public class matriz2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de linhas da matriz: ");
        int n = sc.nextInt();
        System.out.println("Digite o numero de colunas da matriz: ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------");
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(mat[i][j] + " ");
                if(j == m-1){
                    System.out.println();
                }
            }
        }
        System.out.println("------------");

        System.out.println("Digite o numero da ocorrencia: ");
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == x){
                   System.out.println("Posição: " + i + ", " + j);
                   if(j > 0){
                       System.out.println("Esquerda: " + mat[i][j-1]);
                   }
                   if(j < mat[i].length-1){
                       System.out.println("Direita: " + mat[i][j+1]);
                   }
                   if(i < mat.length-1){
                       System.out.println("Baixo: " + mat[i+1][j]);
                   }
                   if(i > 0){
                       System.out.println("Cima: " + mat[i-1][j]);
                   }
                }
            }
        }

        
        sc.close();
    }
}
