import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T02:30:26");
		Instant d06 = Instant.parse("2022-07-20T02:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T02:30:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2002 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2002, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2002, 7, 20, 1, 30);
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		System.out.println("_____________________________________________");

		System.out.println("d01 " + d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println("D10= " + d10.format(fmt1));
		System.out.println("D10= " + fmt1.format(d10));
		System.out.println("D10= " + fmt1.format(d10));
		System.out.println("D10= " + fmt3.format(d11));

		System.out.println("_____________________________________________");
		System.out.println("D06=" + fmt4.format(d11));

	}

}
