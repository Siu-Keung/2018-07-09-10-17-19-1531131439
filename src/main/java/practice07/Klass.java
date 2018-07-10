package practice07;

public class Klass {
    private Integer number;

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
