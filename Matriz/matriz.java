package application;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o arranjo da matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Diagonal principal: ");
        for(int i=0; i<n; i++){
            System.out.print(mat[i][i] + ", ");
        }
        
        System.out.println();
        int x = 0;

        System.out.println("Numeros negativos da matriz: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] > 0){
                    x++;
                }
            }
        }
        System.out.println(x);
        sc.close();

    }

}
