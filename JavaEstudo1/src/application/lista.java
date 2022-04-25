package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class lista {
    
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("juri");
        list.add("lucas");
        list.add("alex");
        list.add("gief");
        list.add(3,"mika");
        
        for(String x: list){
            System.out.println(x);
        }
        
        System.out.println();
        
        list.removeIf(y -> y.charAt(0) == 'm');

        for(String x: list){
            System.out.println(x);
        }
        
        System.out.println("index de gief:" + list.indexOf("gief"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'l').collect(Collectors.toList());

        System.out.println();
        System.out.println(result);
    
        String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
        System.out.println(name);
    }   
}
