package practice06;

public class Teacher extends Person{
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = -1;
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
        if (klass == -1) {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach Class "+klass+".";
    }
}
