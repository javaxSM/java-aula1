package course;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class calendar {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2019-01-13T21:44:00Z")); //Padrão ISO-8601-UTC
		
		
		System.out.println(sdf1.format(d));
		
		Calendar cal = Calendar.getInstance(); // Instanciando um calendario.
		cal.setTime(d); // Buscando minha data.
		cal.add(Calendar.HOUR_OF_DAY, 2);
		d = cal.getTime();
		
		System.out.println(sdf1.format(d));
		
		System.out.println("------------------------");
		
		
		int minutes = cal.get(Calendar.HOUR_OF_DAY);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(minutes);
		System.out.println(month);
		System.out.println(day);

		System.out.println("------------------------");
		
	}

}
