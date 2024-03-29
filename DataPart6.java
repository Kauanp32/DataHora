package DataHora;

//Importando classes necessárias para manipulação de datas e formatos.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataPart6 {
	
	public static void main (String[] args) throws ParseException {
		
		// Cria um objeto SimpleDateFormat para formatar datas no padrão dia/mês/ano horas:minutos:segundos.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// Converte um Instant (ponto específico no tempo) para um objeto Date.
		Date d = Date.from(Instant.parse("2022-05-28T15:42:07Z"));
		
		// Formata o objeto Date para o padrão definido acima e imprime.
		System.out.println(sdf.format(d));
		
		// Cria uma instância de Calendar para manipular componentes individuais da data, como minutos e mês.
		Calendar cal = Calendar.getInstance();
		// Define a data do objeto Calendar para a data criada anteriormente.
		cal.setTime(d);
		// Obtém os minutos da data/hora especificada pelo Calendar.
		int minutes = cal.get(Calendar.MINUTE);
		// Obtém o mês da data/hora especificada pelo Calendar. Adiciona 1 porque Calendar.MONTH começa do 0.
		int month = 1 + cal.get(Calendar.MONTH);
		
		// Imprime os minutos extraídos.
		System.out.println("Minutes: " + minutes);
		// Imprime o mês extraído, ajustado para corresponder à numeração usual de meses (1-12).
		System.out.println("Month: " + month);
	}
}