package app_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program_03 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(100L * 60L * 60L * 5L);

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("15/04/2002 15:43:07");
		Date y3 = Date.from(Instant.parse("2039-05-25T15:42:05Z"));

		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2" + sdf2.format(y2));
		System.out.println("X2:" + x2);
		System.out.println("X1:" + x1);
		System.out.println(y3);
		System.out.println("Segundos:" + x3);
		System.out.println(x4);
		System.out.println(sdf3.format(y3));

	}

}
