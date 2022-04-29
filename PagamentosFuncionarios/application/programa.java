package application;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.List;
import java.util.ArrayList;

public class programa {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    List<Employee> list = new ArrayList<>();

    System.out.println("Digite o numero de funcionarios: ");
    int n = sc.nextInt();

    for(int i = 0; i<n; i++){
        System.out.println("Digite os dados do " + i + "# funcionario");
        System.out.print("Terceirizado: ");
        char ch = sc.next().charAt(0);
        System.out.print("Nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Horas trabalhadas: ");
        int hours = sc.nextInt();
        System.out.print("Valor da hora: ");
        Double valuePerHour = sc.nextDouble();
        if(ch == 'y'){
            System.out.print("Digite o valor da despesa adicional: ");
            double additionalCharge = sc.nextDouble();
            list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        } else {
            list.add(new Employee(name, hours, valuePerHour));
        }
    }
    System.out.println();
    System.out.println("Pagamentos: ");
    for(Employee employee : list){
        System.out.print(employee.getName() + "  -  " + employee.payment());
    }
        
    
    
    sc.close();
    }
}
