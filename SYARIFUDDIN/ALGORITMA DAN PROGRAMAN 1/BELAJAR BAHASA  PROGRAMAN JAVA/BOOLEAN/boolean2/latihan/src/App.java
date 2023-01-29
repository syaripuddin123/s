import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

        
        public class AgeCalculator {
            private LocalDate birthday;
        
            public void getBirthday() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan tanggal lahir (dd-MM-yyyy): ");
                String input = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                birthday = LocalDate.parse(input, formatter);
            }
        
            public void calculateAge() {
                LocalDate now = LocalDate.now();
                Period age = Period.between(birthday, now);
                System.out.println("Umur: " + age.getYears() + " tahun " + age.getMonths() + " bulan " + age.getDays() + " hari");
            }
        
            public static void main(String[] args) {
                AgeCalculator ageCalculator = new AgeCalculator();
                ageCalculator.getBirthday();
                ageCalculator.calculateAge();
            }
        }
        
        
    }

