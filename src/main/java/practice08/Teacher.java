package practice08;

public class Teacher extends Person{
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.id = id;
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

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        if (klass == null) {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach "+klass.getDisplayName()+".";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber()==klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
