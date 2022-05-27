package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userprofile = System.getenv("USERPROFILE");
        String path = userprofile + "\\Documents\\Java\\JavaEstudo1\\src\\input.txt";
        String line;
        String[] fields;
        String name;
        Date date;
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>();
            line = br.readLine();

            while(line != null){
                fields = line.split(" ");
                name = fields[0];
                date = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(name, date));
                line = br.readLine();
            }

            System.out.println("Usuarios distintos: " + set.size());
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    
        sc.close();
    }
}