package course;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class job_date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date x1 = new Date(); // Busca a data atual.
		Date x2 = new Date(System.currentTimeMillis()); // Data atual + hora atual.
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 8); // Calculo do horario.
		Date y1 = sdf1.parse("13/01/2019");
		Date y2 = sdf2.parse("13/01/2019 21:15:25");
		Date y3 = Date.from(Instant.parse("2019-01-13T21:33:00Z"));
		
		System.out.println("x1 - Data de agora em padrão JAVA: " + x1);
		System.out.println("x2: " + x2); 
		System.out.println("x4: " + x3);
		System.out.println("x5: " + x4); 
		System.out.println("y1: " + y1); // format - Usado para formatação da DATA.
		System.out.println("y2: " + y2); // format - Usado para formatação da DATA.
		System.out.println("y3: " + y3);
		System.out.println("----------------------------------------");
		System.out.println("x1 - Date de agora : " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x3));
		System.out.println("x5: " + sdf2.format(x4));
		System.out.println("y1: " + sdf1.format(y1)); // format - Usado para formatação da DATA.
		System.out.println("y2: " + sdf2.format(y2)); // format - Usado para formatação da DATA.
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("----------------------------------------");
		System.out.println("x1 - Date de agora : " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x3));
		System.out.println("x5: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1)); // format - Usado para formatação da DATA.
		System.out.println("y2: " + sdf3.format(y2)); // format - Usado para formatação da DATA.
		System.out.println("y3: " + sdf3.format(y3));
	}

}
