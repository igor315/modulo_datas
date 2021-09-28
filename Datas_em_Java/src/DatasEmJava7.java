import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava7 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.parse("1995-08-03");
		LocalDate dataNova = LocalDate.parse("2021-09-28");
		
		System.out.println("Data antiga � maior que data nova? " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga � anterior a data nova? " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas s�o iguais? " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		
		System.out.println("Quantos meses: " + periodo.getMonths());
		
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("Periodo � : " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + " e " + periodo.getDays() + " dias ");
		
		
	}

}
