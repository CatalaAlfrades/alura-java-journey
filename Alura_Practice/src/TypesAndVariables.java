public class TypesAndVariables {

        public static void main(String[] args) {
            // Printing something using different types to variables
            System.out.println("----------------------1º Test------------------------------");
            String nome = "Maria";
            int age = 25;
            double height = 1.68;
            boolean idStudante = true;

            System.out.println("Name: " + nome);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Is studante: " + idStudante);

            // Castle conversion method
            System.out.println("\n----------------------2º Test------------------------------");
            double doubleValor = 19.5;
            int intValor = (int) doubleValor;

            System.out.println("The whole valor is: " + intValor);

            // Calculating the arithmetic mean
            System.out.println("\n----------------------3º Test------------------------------\n");
            double nota1 = 7.5;
            double nota2 = 8.0;
            double nota3 = 9.0;

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("The arithmetic mean is: %.2f" + media);

            // Converting degrees Celsius to Fahrenheit
            System.out.println("\n----------------------4º Test------------------------------\n");
            int celsius = 20;

            double fahrenheit = (celsius * 9 / 5.0) + 32;

            System.out.print("The temperature in degrees Fahrenheit is: " + fahrenheit);

            // Cadastring books
            System.out.println("\n----------------------5º Test------------------------------\n");
            String title = "The Little Prince";
            String autor = "Antoine de Saint-Exupéry";
            int pages = 96;
            double price = 39.90;
            char categoria = 'F';

            String categoriaDescricao;

            if (categoria == 'F') {
                categoriaDescricao = "Fiction";
            } else if (categoria == 'N') {
                categoriaDescricao = "No fiction";
            } else if (categoria == 'T') {
                categoriaDescricao = "Technology";
            } else if (categoria == 'H') {
                categoriaDescricao = "History";
            } else {
                categoriaDescricao = "The category is invalidity";
            }

            System.out.println("The book registered: \"" + title + "\", de " + autor + ". it's has " + pages + " pages, cost " + price + "$ and belongs to the category " + categoriaDescricao + ".");

            // Categorizing prices
            System.out.println("\n----------------------6º Test------------------------------\n");
            double priceSecond = 150.00;

            if (priceSecond <= 50.00) {
                System.out.println("Product category: Economic");
            } else if (priceSecond > 50.00 && priceSecond <= 200.00) {
                System.out.println("Product category: Intermedia");
            } else {
                System.out.println("Product category: Premium");
            }

            // Par or impar
            System.out.println("\n----------------------7º Test------------------------------\n");
            int number = 7;

            if (number % 2 == 0) {
                System.out.println("The number is par.");
            } else {
                System.out.println("The number is ímpar.");
            }

            // Exchange coins
            System.out.println("\n----------------------8º Test------------------------------\n");
            double reaisValue = 451.50;
            double feeCost = 5.25;

            double dollaValues = reaisValue / feeCost;

            System.out.println("The values R$: " + reaisValue + " in dollar is : US$ " + dollaValues);

            // Age verify
            System.out.println("\n----------------------9º Test------------------------------\n");
            int ageN = 17;
            String message;

            if (ageN >= 18) {
                message = "You are of legal age.";
            } else {
                message = "You are a minor.";
            }

            System.out.println(message);

            //trip planning
            System.out.println("\n----------------------10º Test------------------------------\n");
            double averageConsumption = 12.5;
            double tankCapacity = 50;
            double currentFuel = 20;
            double tripDistance = 200;

            double autonomyMaximum = averageConsumption * tankCapacity;
            double autonomyCurrent = averageConsumption * currentFuel;

            System.out.printf("Autonomy maximum to vehicle: %.1f km%n", autonomyMaximum);
            System.out.printf("current autonomy: %.1f km%n", autonomyCurrent);

            if (autonomyCurrent >= tripDistance) {
                System.out.println("You will be able to complete the trip without needing to refuel.");
            } else {
                System.out.println("Attention! You will need to refuel before completing the trip.");
            }

        }

}
