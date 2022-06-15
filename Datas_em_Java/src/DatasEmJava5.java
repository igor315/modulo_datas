import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava5 {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		
		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		
		System.out.println("Mês: " + localDate.getMonth());
		
		System.out.println("Ano: " + localDate.getYear());
		
	}
}
