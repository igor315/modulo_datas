import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava4 {

	public static void main(String[] args) {

	/*Nova API de data a partir do Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd//MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("São " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " horas, Horário de Brasília");
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e horario: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
	}

}
