package br.com.date.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance(); 
		
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Data em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do Mês: " + date.getDate());
		System.out.println("Dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) -1 ));
		
		System.out.println("Horas do dia: " + date.getHours());
		System.out.println("Horas do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos: " + date.getMinutes());
		System.out.println("Minutos: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Seungods: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
	//---------------------------------------------------------------------------------------//
	
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
	
		System.out.println("Data em formato padrão já convertido em String " + simpleDateFormat.format(date));
		System.out.println("Data em formato padrão já convertido em String " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato de banco de dados " + simpleDateFormat.format(date));
	}
	
}
