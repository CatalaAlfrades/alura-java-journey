public class Student {
    private String name;
    private String type;

    public Student(String nome, String type) {
        this.name = nome;
        this.type = type;
    }

    public void Identify() {
        System.out.println("Student: " + name + " - Type: " + type);
    }

}
