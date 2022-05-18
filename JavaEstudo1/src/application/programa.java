package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import entities.services.ContratoServico;
import entities.services.PaypalServico;

public class programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYY");

        System.out.println("Entre com os dado do contrato: ");
        System.out.print("Numero do contrato: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        sc.nextLine();
        Date data = sdf.parse(sc.nextLine());
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        Contrato contrato = new Contrato(number, data, valor);
		
		ContratoServico contractService = new ContratoServico(new PaypalServico());
		
		contractService.processContract(contrato, parcelas);
		
		System.out.println("Parcelas: ");
		for (Parcela x : contrato.getParcelas()) {
			System.out.println(x);
		}

        sc.close();
    }
}
