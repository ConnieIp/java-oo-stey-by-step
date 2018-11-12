package practice11;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

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

    public void assignLeader(Student student){
        if(student.getKlass().getNumber()==number){
            leader = student;
            System.out.print("I am Tom. I know "+student.getName()+" become Leader of "+student.getKlass().getDisplayName()+".\n");

        }else{
            System.out.print("It is not one of us.\n");
            leader=new Student();
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
        System.out.print("I am Tom. I know "+student.getName()+" has joined "+student.getKlass().getDisplayName()+".\n");
    }
}

