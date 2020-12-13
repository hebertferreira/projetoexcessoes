package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do quarto:");
		int numeroQuarto = sc.nextInt();
		System.out.print("Digite a data de checkIn:");
		Date dataHoraEntrada = sdf.parse(sc.next()); 
		System.out.print("Digite a data de checkOut:");
		Date dataHoraSaida = sdf.parse(sc.next());
		
		Reserva reserva = new Reserva(numeroQuarto, dataHoraEntrada, dataHoraSaida);
		
		System.out.println(reserva);
	}

}
