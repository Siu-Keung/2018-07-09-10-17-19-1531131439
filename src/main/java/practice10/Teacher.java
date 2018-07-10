package practice10;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> klasses = new ArrayList<>();


    public List<Klass> getClasses(){
        return this.klasses;
    }

    public void setClasses(List<Klass> list){
        this.klasses = list;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, List<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public String introduceWith(Student student){
        String resultStr = super.introduce() + " I am a Teacher.";
        if(this.isTeaching(student))
            resultStr += " I teach " + student.getName() + ".";
        else
            resultStr += " I don't teach " + student.getName() + ".";
        return resultStr;
    }

    public boolean isTeaching(Student student){
        for (Klass klass : klasses) {
            if(klass.isIn(student))
                return true;
        }
        return false;
    }

    @Override
    public String introduce() {
        String resultStr = super.introduce() + " I am a Teacher." + this.generateClassSpec();
        return resultStr;
    }

    private String generateClassSpec(){
        if(this.klasses.size() == 0)
            return " I teach No Class.";
        else{
            String resultStr = " I teach Class ";
            for (Klass klass : klasses) {
                resultStr += klass.getNumber() + ", ";
            }
            resultStr = resultStr.substring(0, resultStr.length() - 2);
            resultStr += ".";
            return resultStr;
        }
    }
}
