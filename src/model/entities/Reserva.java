package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int numeroQuarto;
	private Date dataHoraEntrada;
	private Date dataHoraSaida;
	
	public Reserva() {
		
	}

	public Reserva(int numeroQuarto, Date dataHoraEntrada, Date dataHoraSaida) {
		this.numeroQuarto = numeroQuarto;
		this.dataHoraEntrada = dataHoraEntrada;
		this.dataHoraSaida = dataHoraSaida;
	}
	
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public Date getDataHoraSaida() {
		return dataHoraSaida;
	}

	public long duracaoEstadia() {
		
		//GETTIME retorna uma data em milissegundos 
		long diff = dataHoraSaida.getTime() - dataHoraEntrada.getTime();
		
		// TIMEUNIT converte um valor (no caso abaixo converte milissegundos em dias)
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizaDiasEstadia(Date dataHoraEntrada, Date dataHoraSaida) {
		this.dataHoraEntrada = dataHoraEntrada;
		this.dataHoraSaida = dataHoraSaida;		
	}
	
	@Override
	public String toString() {
		
		return "Quarto Reservado: "
				+ numeroQuarto
				+ ", CheckIn: "
				+ sdf.format(dataHoraEntrada)
				+ " - CheckOut: "
				+ sdf.format(dataHoraSaida)
				+ " - Duração: "
				+ duracaoEstadia()
				+ " noites";
	}
}	
