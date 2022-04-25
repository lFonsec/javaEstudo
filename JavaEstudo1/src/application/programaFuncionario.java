package application;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Funcionario;
public class programaFuncionario {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de funcionarios: ");
        int numeroFuncionarios = sc.nextInt();
        sc.nextLine();
        int idFuncionarios; 
        String nameFuncionarios;
        double salaryFuncionarios;
        List<Funcionario> list = new ArrayList<>();
        for(int i=0; i<numeroFuncionarios; i++){
            System.out.println("Digite o id do funcionario: ");
            idFuncionarios = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do funcionario: ");
            nameFuncionarios = sc.nextLine();
            System.out.println("Digiteo  salario do funcionario: ");
            salaryFuncionarios = sc.nextDouble();
            list.add(new Funcionario(idFuncionarios, nameFuncionarios, salaryFuncionarios));
        }

        System.out.println("Digite o id do funcionario que quer aumentar o salario: ");
        int id = sc.nextInt();

        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        System.out.print("Digita a porcentagem: ");
		double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Lista dos funcionarios: ");
        for(Funcionario x : list){
            System.out.println(x);
        }

        sc.close();
    }
}
