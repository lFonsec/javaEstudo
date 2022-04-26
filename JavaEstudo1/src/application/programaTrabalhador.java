package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import entities.DepartamentoTrabalhador;
import entities.HorasTrabalhador;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class programaTrabalhador {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        System.out.print("Digite o nome do departamento: ");
        String dep = sc.nextLine();

        System.out.println("Digite os dados do trabalhador: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nivel: ");
        String nivel = sc.nextLine();
        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), salarioBase, new DepartamentoTrabalhador(dep));

        System.out.println("Digite o numero de contratos: ");
        int numeroContratos = sc.nextInt();

        for(int i = 0; i<numeroContratos; i++){
            System.out.println("Digite os dado do contrato #" + i+1);
            System.out.print("Digite a data DD/MM/AAAA: ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Digite o valor hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Digite as horas: ");
            int duracao = sc.nextInt();
            HorasTrabalhador contrato = new HorasTrabalhador(dataContrato, valorHora, duracao);
            trabalhador.addContract(contrato);
        }

        System.out.println();
        System.out.print("Digite o mes e o ano para calcular o income: ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("income para " + mesAno + ": " + trabalhador.income(ano, mes));

        sc.close();
    }
}
