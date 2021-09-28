import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava9 {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		/*System.out.println("Data Base: " + dataBase);
		
		System.out.println("Mais  5 dia(s): " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais  5 semana(s): " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais  5 mes(es): " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Mais  5 ano(s): " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Menos  1 ano(s): " + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 mes(es): " + (dataBase = dataBase.minusMonths(1)));*/
		
		for (int parcela = 1; parcela <= 12; parcela ++ ) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println(parcela + " parcela " + " Data de vencimento: " 
			+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
}
