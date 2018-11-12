package practice11;

import java.util.LinkedList;
import java.util.LinkedList;

public class Teacher extends Person{
    private int id;
    private String name;
    private int age;
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = null;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
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

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public String introduce(){
        if (classes == null || classes.size()==0) {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        String c="";
        for(int i=0;i<classes.size();i++){
            if(i!=0){
                c+=", ";
            }
            c+=classes.get(i).getNumber();
        }
        return super.introduce()+" I am a Teacher. I teach Class "+c+".";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber()==classes.get(0).getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public boolean isTeaching(Student student){
        for(Klass klass:classes){
            if(klass.getNumber()==student.getKlass().getNumber()){
                System.out.print("I am "+"Tom"+". I know "+student.getName()+" become Leader of "+student.getKlass().getDisplayName()+".\n");
                return true;
            }
        }
        return false;
    }
}
