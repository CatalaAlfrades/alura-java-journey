
public class Main {
        public static void main(String[] args) {

            Car gol = new Car("Gol", "ABC-1234", 2020);

            System.out.println("Registered vehicle:");
            System.out.println("Model: " + gol.getModel());
            System.out.println("Plate: " + gol.getPlate());
            System.out.println("Year: " + gol.getYear());

            Car mercedes = new Car("Gol", "BC-9997", 2021);

            System.out.println("\nRegistered vehicle:");
            System.out.println("Model: " + mercedes.getModel());
            System.out.println("Plate: " + mercedes.getPlate());
            System.out.println("Year: " + mercedes.getYear());

            Car toyota = new Car("Toyota Prado", "AB-4432", 2023);

            System.out.println("\nRegistered vehicle:");
            System.out.println("Model: " + toyota.getModel());
            System.out.println("Plate: " + toyota.getPlate());
            System.out.println("Year: " + toyota.getYear());

            // Second test about heritage
            System.out.println("\n ------------------------------- 2 Testes ---------------------------------------\n");
            Student aluno1 = new Student("Fernanda", "regular");
            Scholarship aluno2 = new Scholarship("Lucas");

            aluno1.Identify();
            aluno2.Identify();

            // Third test about polymorphism
            System.out.println("\n ------------------------------- 3 Testes ---------------------------------------\n");
            Reserve r = new Reserve();
            r.book();
            r.book("10/04");
            r.book("12/04", 4);

            Reserve vip = new VipReserve();
            vip.book();
        }

}