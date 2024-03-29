package DataHora;

//Importação das classes necessárias para trabalhar com datas e horas do pacote java.time
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

//Declaração da classe pública "DataPart3"
public class DataPart3 {
	
 // Método principal "main" que será executado ao iniciar o programa
	public static void main(String[] args) {

     // Parseando strings para criar datas nas formas LocalDate, LocalDateTime e Instant
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

     // Convertendo a data e hora instantâneas d06 para datas e horas locais em diferentes fusos horários
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

     // Impressão das datas e horas locais convertidas
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

     // Obtendo componentes individuais (dia, mês, ano) da data d04
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());

     // Obtendo componentes individuais (hora, minutos) da data e hora d05
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());

	}
}