package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = null;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
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
                return true;
            }
        }
        return false;
    }
}
