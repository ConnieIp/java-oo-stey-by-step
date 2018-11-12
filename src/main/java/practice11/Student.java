package practice11;

public class Student extends Person{
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Student() {
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
        if(klass.getLeader()!=null && klass.getLeader().getId()==id){
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }else {
            return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
    }

    public boolean isIn(Klass klass){
        if(klass.getNumber()==this.klass.getNumber()){
            return true;
        }else{
            return false;
        }
    }
}
