package app_02;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program_02 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2002-04-20");		
		LocalDateTime d02 = LocalDateTime.parse("2022-04-22T01:30:36");
		Instant d03 = Instant.parse("2022-05-20T01:30:26Z");
		
		LocalDate pastWeeklLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("pastWeeklLocalDate = " + pastWeeklLocalDate);
		System.out.println("nextWeeklLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeeklLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		System.out.println("pastWeeklLocalDateTime= " + pastWeeklLocalDateTime);
		System.out.println("nextWeekLocalDateTime= " + nextWeekLocalDateTime);
		
		
		Instant pastWeeklInstante = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeeklInstante = d03.minus(7, ChronoUnit.DAYS);
		
		
		System.out.println("pastWeeklInstante" + pastWeeklInstante);
		System.out.println("nextWeeklInstante" + nextWeeklInstante);
	
		
	
		Duration t2 = Duration.between(pastWeeklLocalDate, d03);
		Duration t3 = Duration.between(pastWeeklInstante,d03);
		System.out.println("Duracao: " + t2.toDays());
		System.out.println("Duracao: " + t3.toDays());
		
		
		
		
		
	}
	
	
	
}
