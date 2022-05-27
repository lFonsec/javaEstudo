package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.print("Quantos estudantes para o curso A: ");
        int x = sc.nextInt();
        for(int i=0 ; i<x; i++){
            set.add(sc.nextInt());
        }

        System.out.print("Quantos estudantes para o curso B: ");
        x = sc.nextInt();
        for(int i=0 ; i<x; i++){
            set.add(sc.nextInt());

        }  

        System.out.print("Quantos estudantes para o curso C: ");
        x = sc.nextInt();
        for(int i=0 ; i<x; i++){
            set.add(sc.nextInt());
        }
        System.out.println("Numero de estudantes distintos: " + set.size());
        sc.close();
    }
}