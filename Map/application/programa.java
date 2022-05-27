package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class programa {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String userprofile = System.getenv("USERPROFILE");
        String path = userprofile + "\\Documents\\Java\\JavaEstudo1\\src\\input.csv";
        String line;
        String[] fields;
        
        String name;
        Map<String, Integer> map = new TreeMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            line = br.readLine();
            while(line != null){
                fields = line.split(",");
                name = fields[0];
                int  votes = Integer.parseInt(fields[1]);
                if(map.containsKey(name)){
                    int sumVotes = map.get(name);
                    map.put(name, sumVotes + votes);
                }else{
                    map.put(name,votes);
                }
                line = br.readLine();
                
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        sc.close();
    }
}