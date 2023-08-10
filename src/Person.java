import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, String age, LocalDate gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }}
