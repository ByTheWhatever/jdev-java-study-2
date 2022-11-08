package br.com.date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class data_jdev_3 {

	public static void main(String[] args) throws ParseException {

		
		Calendar calendar = Calendar.getInstance();
		
		/*Simular uma data retirada do banco de dados*/
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("13/12/2015"));
	
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 3);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 2);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
	
	//---------------------------------------------------------------------------------------------------------------//
		System.out.println("---------------------------------------------------------------------");
		
		/*ChronoUnit test*/
	
		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2015-12-13"), LocalDate.now());
		
		System.out.println(dias);
		
	}

}
