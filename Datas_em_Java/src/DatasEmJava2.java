import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {
		
		/*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimento = simpleDateFormat.parse("09/09/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("10/09/2021");
		
		//after: se data 1 é maior que data 2
		//before: se data 1 é menor que data 2
		
		if (dataVencimento.after(dataAtualHoje)) {//Posterior ou maior ou depois da data atual
			System.out.println("Seu boleto ainda nao venceu, VENCIMENTO PARA: " + simpleDateFormat.format(dataVencimento));
		}else if(dataVencimento.equals(dataAtualHoje)){
			System.out.println("Seu boleto está programado para vencer hoje: " + simpleDateFormat.format(dataVencimento));
		}else {
			System.out.println("Boleto vencido - URGENTE seu boleto venceu na data: " + simpleDateFormat.format(dataVencimento));
		}*/
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/*Calendar calendar = Calendar.getInstance();
		
		//Simular que a data vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("24-09-2021")); // Definindo uma data qualquer
		
		calendar.add(calendar.DAY_OF_MONTH, 1); //date de hoje mais 40 dias
		
		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.MONTH, 1);
		
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
calendar.add(calendar.YEAR, 1);
		
		System.out.println("Somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));*/
	
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		Long anos = ChronoUnit.YEARS.between(LocalDate.parse("2010-08-01"), LocalDate.now() );
		
		System.out.println("Possuí " + anos + " ANOS entre a faixa de data");
		
		Long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2010-08-01"), LocalDate.now() );
		
		System.out.println("Possuí " + meses + " MESES entre a faixa de data");
		
		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2010-08-01"), LocalDate.now() );
		
		System.out.println("Possuí " + dias + " DIAS entre a faixa de data");
		
	}

}
