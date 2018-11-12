package practice02;

public class Student extends Person{
    private String name;
    private int age;
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        return "I am a Student. I am at Class "+klass+".";
    }
}
