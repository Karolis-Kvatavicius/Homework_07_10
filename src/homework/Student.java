package homework;

public class Student {

    private String name;
    private String surname;
    private  int age;

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "    " + surname + "    " + age + "   written to output.txt";
    }
}
