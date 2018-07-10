package practice08;

public class Klass {
    private Integer number;
    private Student leader;

    public boolean isLeader(Student student){
        return this.leader == student;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Class " + this.number;
    }

    public Klass() {

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName(){
        return this.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass)
            return this.number.equals(((Klass)obj).getNumber());
        else
            return false;
    }
}
