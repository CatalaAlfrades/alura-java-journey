import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {

        public static void main(String[] args) {

            // Log report system
            System.out.println("------------------------------ 1º Test ------------------------------------------");
            String task = "Send weekly report";

            LocalDate creationDate = LocalDate.now();
            LocalTime creationHour = LocalTime.now();

            System.out.println("Task: \"" + task + "\"");
            System.out.println("Creation data: " + creationDate);
            System.out.println("Creation hour: " + creationHour);

            // Formatting date and time for Brazilian type.
            System.out.println("\n------------------------------ 2º Test ------------------------------------------");
            LocalDate correntDate = LocalDate.now();
            LocalTime correntHour = LocalTime.now();

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

            String formattedDate = correntDate.format(dateFormat);
            String formattedHour = correntHour.format(formatoHora);

            System.out.println("Formatted Date: " + formattedDate);
            System.out.println("Formatted Hour: " + formattedHour);

            // Difference between times.
            System.out.println("\n------------------------------ 3º Test ------------------------------------------");
            LocalTime startTime = LocalTime.of(14, 30, 0);
            LocalTime endTime = LocalTime.of(16, 45, 0);

            Duration duration = Duration.between(startTime, endTime);

            System.out.println("Difference between times: " + duration.toHours() + " hours and " + duration.toMinutesPart() + " minutes");

            // Delivery date.
            System.out.println("\n------------------------------ 4º Test ------------------------------------------");
            LocalDate startDate = LocalDate.now();
            int deadlineDays = 15;
            LocalDate deliveryDate = startDate.plusDays(deadlineDays);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate2 = deliveryDate.format(formatter);

            System.out.println("Delivery date: " + formattedDate2);

            // Difference between times.
            System.out.println("\n------------------------------ 5º Test ------------------------------------------");
            LocalDate eventDate = LocalDate.of(2025, 3, 10);
            LocalDate correntDate2 = LocalDate.of(2025, 3, 15);

            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            String formattedEventDate = eventDate.format(formatter);
            String correntDateFormatted = correntDate2.format(formatter);

            System.out.println("Event date: " + formattedEventDate);
            System.out.println("Corrent date: " + correntDateFormatted);

            if (eventDate.isBefore(correntDate2)) {
                System.out.println("The event has already taken place.");
            } else {
                System.out.println("The event has not yet taken place.");
            }

            // Zone time.
            System.out.println("\n------------------------------ 6º Test ------------------------------------------");
            ZonedDateTime tokyoHour = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedHour2 = tokyoHour.format(formatter3);

            System.out.println("The Tokyo current time is: " + formattedHour2);

            // working hours tracking.
            System.out.println("\n------------------------------ 7º Test ------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH:mm");

            // User input
            System.out.print("Enter the start time (HH:mm): ");
            LocalTime entrada = LocalTime.parse(scanner.next(), formatter4);

            System.out.print("Enter the daily workload (in hours): ");
            int workloadDuration = scanner.nextInt();

            System.out.print("Enter the actual departure time (HH:mm): ");
            LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter4);

            scanner.close();

            // Calculation of projected output
            LocalTime scheduledDeparture = entrada.plusHours(workloadDuration);

            // Calculation of the difference between actual and projected output
            Duration difference = Duration.between(scheduledDeparture, saidaReal);
            long overtime = difference.toHours();
            long extraMinutes = difference.toMinutesPart();

            // Display of formatted results
            System.out.println("\nArrival time: " + entrada.format(formatter4));
            System.out.println("Departure time: " + scheduledDeparture.format(formatter4));
            System.out.println("Actual departure time: " + saidaReal.format(formatter4));

            if (overtime == 0 && extraMinutes == 0) {
                System.out.println("Hours balance: 0h 0min");
            } else {
                String sinal;

                if (overtime > 0 || extraMinutes > 0) {
                    sinal = "+";
                } else {
                    sinal = "-";
                }

                System.out.println("Hours balance: " + sinal + Math.abs(overtime) + "h " + Math.abs(extraMinutes) + "min");

            }
        }

}
