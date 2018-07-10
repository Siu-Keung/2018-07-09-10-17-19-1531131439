package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String resultStr = super.introduce() + " I am a Student.";
        if(this.klass.isLeader(this))
            resultStr += " I am Leader of " + this.klass + ".";
        else
            resultStr += " I am at " + this.klass + ".";

        return resultStr;
    }

}
