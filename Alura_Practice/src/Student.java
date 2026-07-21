public class Student {
    private String name;
    private String type;

    public Student(String nome, String tipo) {
        this.name = nome;
        this.type = tipo;
    }

    public void Identify() {
        System.out.println("Student: " + name + " - Type: " + type);
    }

}
