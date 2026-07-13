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
            System.out.println("\n----------------------3º Test------------------------------");
            double nota1 = 7.5;
            double nota2 = 8.0;
            double nota3 = 9.0;

            float media = (float) (nota1 + nota2 + nota3) / 3;

            System.out.println("The arithmetic mean is: " + media);

            // Converting degrees Celsius to Fahrenheit
            System.out.println("\n----------------------4º Test------------------------------");
            int celsius = 20;

            double fahrenheit = (celsius * 9 / 5.0) + 32;

            System.out.print("The temperature in degrees Fahrenheit is: " + fahrenheit);
        }

}
