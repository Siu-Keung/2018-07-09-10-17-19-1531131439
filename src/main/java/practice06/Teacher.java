package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String resultStr = super.introduce() + " I am a Teacher. ";
        if(this.klass != null)
            resultStr += "I teach Class " + this.klass + ".";
        else
            resultStr += "I teach No Class.";
        return resultStr;
    }
}
