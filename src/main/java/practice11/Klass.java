package practice11;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class "+number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber()==number){
            leader = student;
            if(teacher!=null) {
                teacher.notifyTeacher(student);
            }
        }else{
            System.out.print("It is not one of us.\n");
            leader=new Student();
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
        if(teacher!=null) {
            teacher.notifyTeacher(student);
        }
    }
}

