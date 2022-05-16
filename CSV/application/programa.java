package application;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Produto;
import java.io.File;
import java.io.FileWriter;

public class programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userprofile = System.getenv("USERPROFILE");
        String path = userprofile + "\\Documents\\Java\\JavaEstudo1\\src\\summary.csv";
        List<Produto> list = new ArrayList<>();
		
		boolean success = new File(path + "\\out").mkdir();
		
		String targetFileStr = path + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line!=null){
                String[] arrOfStr = line.split(",");
                String nome = arrOfStr[0];
                double price = Double.parseDouble(arrOfStr[1]);
				int quantity = Integer.parseInt(arrOfStr[2]);

				list.add(new Produto(nome, price, quantity));

                line=br.readLine();
            }
            
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                
                for(Produto item : list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
                }


            }catch(IOException e){

                System.out.println("Error: " + e.getMessage());
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        sc.close();
    }
}
