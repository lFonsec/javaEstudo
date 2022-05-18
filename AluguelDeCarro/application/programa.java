package application;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Veiculo;
import entities.services.BrasilTax;
import entities.services.RentalService;
public class programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:ss");
        System.out.println("Entre com os dados da reserva: ");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Data da retirada(dd/mm/yy HH:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Data de retorno(dd/mm/yy HH:ss): ");
        Date finish = sdf.parse(sc.nextLine());
        System.out.print("Entre com  o preco por hora: ");
        double pricePerHour = sc.nextDouble(); 
        System.out.print("Entre com  o preco por dia: ");
        double pricePerDay = sc.nextDouble();

        CarRental cr = new CarRental(start, finish, new Veiculo(model));
        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrasilTax());
        rs.processInvoice(cr);
        
        System.out.println("INVOICE: ");
        System.out.print("Basic payment: " + cr.getInVoice().getPayment() );
        System.out.print("Taxa: " + cr.getInVoice().getTax() );
        System.out.print("Total: " + cr.getInVoice().getTotalPayment());
        sc.close();
    }
}
