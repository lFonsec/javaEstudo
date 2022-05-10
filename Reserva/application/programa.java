package application;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Reservation;

public class programa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		try{
			System.out.println("Digite os dados da reserva: ");

			System.out.print("Numero do Quarto: ");
			int roomNumber = sc.nextInt();
			System.out.print("Digite a data do Check-In(DD/MM/AAAA):  ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Digite a data do Check-Out(DD/MM/AAAA):  ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation); 
			System.out.println();

			System.out.println("Digite os dados para mudar a reserva: ");  
			System.out.print("Digite a data do Check-In(DD/MM/AAAA):  ");
			Date novoCheckIn = sdf.parse(sc.next());
			System.out.print("Digite a data do Check-Out(DD/MM/AAAA):  ");
			Date novoCheckOut = sdf.parse(sc.next());
			
			reservation.update(novoCheckIn, novoCheckOut);

			System.out.println(reservation);
			System.out.println();
			System.out.println(reservation);
		}
		catch( ParseException e){
			System.out.println("Data invalida");
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e){
			System.out.println("fatal error");
		}
        
    

        sc.close();
    }
}
