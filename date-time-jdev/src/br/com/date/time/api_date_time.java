package br.com.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class api_date_time {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		
		System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime horaDataAtual = LocalDateTime.now();
		
		System.out.println(horaDataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		System.out.println("--------------------------------------------------------------------------");
		
		/*Compração de datas com LocalDate*/
		
		LocalDate dataInicial = LocalDate.parse("2020-02-10");
		
		LocalDate dataFinal = LocalDate.parse("2021-08-11");
		
		
		Period period = Period.between(dataInicial, dataFinal);
		
		System.out.println("Período de dias entre as datas é: "+ period.getDays());
		
		System.out.println("Período de meses entre as datas é: " + period.getMonths());
		
		System.out.println("Período de anos entre as datas é: " + period.getYears());
		
		
	}

}
