import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do m�s: " + date.getDate());
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("minuto da hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + (date.getYear() + 1900 ));
		
		
		/*----------Simple Date Format----------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18 19:57.50"));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-18-10"));
		
		simpleDateFormat = new SimpleDateFormat("yyyy/dd/MM");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987/18/10"));
		
						/*---------Calendar----------*/
		
	}
}
