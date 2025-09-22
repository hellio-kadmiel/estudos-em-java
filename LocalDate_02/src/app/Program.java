package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2002-04-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-04-22T01:30:36");
		Instant d03 = Instant.parse("2022-05-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R1 = " + r3);
		System.out.println("R2 = " + r4);

		System.out.println("d04 dia = " + d01.getDayOfMonth());
		System.out.println("d04 dia do ano = " + d01.getDayOfYear());
		System.out.println("d04 Ano = " + d01.getYear());
		System.out.println("d02 Minutos = " + d02.getMinute());

	}

}
