package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, Klass klass) {

        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    public String introduceWith(Student student){
        String resultStr = super.introduce() + " I am a Teacher.";
        if(this.klass.equals(student.getKlass()))
            resultStr += " I teach " + student.getName() + ".";
        else
            resultStr += " I don't teach " + student.getName() + ".";
        return resultStr;
    }

    @Override
    public String introduce() {
        String resultStr = super.introduce() + " I am a Teacher. ";
        if(this.klass != null)
            resultStr += "I teach " + this.klass + ".";
        else
            resultStr += "I teach No Class.";
        return resultStr;
    }
}
