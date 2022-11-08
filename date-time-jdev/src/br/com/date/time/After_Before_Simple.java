package br.com.date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class After_Before_Simple {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataBoleto = simpleDateFormat.parse("10/11/2022");
		Date dataAtual = simpleDateFormat.parse("09/11/2022");
		
		if (dataBoleto.after(dataAtual)) {
			System.out.println("Boleto vencido");
		} else {
			System.out.println("Boleto ainda não venceu");
		}
	}

}
