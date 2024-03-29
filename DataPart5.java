package DataHora;

import java.time.LocalDate;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class DataPart5 {

    public static void main(String[] args) {

        // Definindo datas em diferentes tipos
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        
        // Calculando datas passadas e futuras para LocalDate
        LocalDate pastWeekLocalDate = d04.minusDays(7); // Subtraindo 7 dias da data d04
        LocalDate nextWeekLocalDate = d04.plusDays(7); // Adicionando 7 dias à data d04
        
        // Imprimindo as datas calculadas para LocalDate
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        
        // Calculando datas passadas e futuras para LocalDateTime
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // Subtraindo 7 dias da data e hora d05
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // Adicionando 7 dias à data e hora d05
        
        // Imprimindo as datas calculadas para LocalDateTime
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        
        // Calculando datas passadas e futuras para Instant
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // Subtraindo 7 dias da data e hora d06
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // Adicionando 7 dias à data e hora d06
        
        // Imprimindo as datas calculadas para Instant
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Calculando a diferença de tempo entre datas usando Duration
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // Calculando a diferença entre datas em dias para LocalDate
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05); // Calculando a diferença entre datas e horas para LocalDateTime
        Duration t3 = Duration.between(pastWeekInstant, d06); // Calculando a diferença entre Instantes
        Duration t4 = Duration.between(d06, pastWeekInstant); // Calculando a diferença entre Instantes (invertendo a ordem)

        // Imprimindo as diferenças de tempo calculadas
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t3 dias = " + t4.toDays());

    }

} 