package DataHora;

//Importação das classes necessárias para trabalhar com datas e horas do pacote java.time
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//Declaração da classe pública "DataPart4"
public class DataPart4 {
	
 // Método principal "main" que será executado ao iniciar o programa
	public static void main(String[] args) {

     // Parseando strings para criar datas nas formas LocalDate, LocalDateTime e Instant
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
     // Obtendo a data passada e a data futura em relação a d04
		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);
		
     // Obtendo a data e hora passada e a data e hora futura em relação a d05
		LocalDateTime pastWeekLocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);
		
     // Obtendo a data e hora instantânea passada e a data e hora instantânea futura em relação a d06
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
     // Impressão das datas passadas e futuras
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
     // Cálculo da diferença entre as datas passadas e presentes em termos de dias
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}