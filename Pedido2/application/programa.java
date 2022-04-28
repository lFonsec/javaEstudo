package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/AAA): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println();


        System.out.println("Enter order data:");
		System.out.print("Status: ");

		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

        System.out.print("Quantos item nesse pedido: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){

            System.out.println("Entre os dados do " + i+1 + "# produto: ");
            System.out.print("Digite o nome do produto: ");
            String produtctName = sc.nextLine();
            System.out.println("Digite o valor do produto: ");
            double productPrice = sc.nextDouble();
            System.out.print("Digite a quantidade: ");
            int quantity = sc.nextInt();

            Product product = new Product(produtctName, productPrice);

			OrderItem orderItem = new OrderItem(quantity, productPrice, product); 

			order.addItem(orderItem);
        }

        System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		

        sc.close();
    }

}
