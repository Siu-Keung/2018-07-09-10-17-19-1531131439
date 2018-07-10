package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements Observable {
    private Integer number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

    private List<Observer> observers = new ArrayList<>();

    public Klass() {

    }

    public void registerListenser(Observer observer){
        this.observers.add(observer);
    }

    public boolean isIn(Student student){
        return this.members.contains(student);
    }

    public boolean isLeader(Student student){
        return student.equals(this.leader);
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student){
        if(!isIn(student))
            System.out.print("It is not one of us.\n");
        else {
            this.leader = student;
            this.notifyAllLeaderAssignedListeners(student, this);
        }
    }

    public Klass(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Class " + this.number;
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

    public void appendMember(Student student){
        if(!this.members.contains(student)) {
            this.members.add(student);
            this.notifyAllNewMemberJoinedListeners(student, this);
        }
    }

    @Override
    public void notifyAllLeaderAssignedListeners(Student student, Klass klass) {
        for (Observer lobserver : observers) {
            lobserver.handleLeaderAssigned(student, klass);
        }
    }

    @Override
    public void notifyAllNewMemberJoinedListeners(Student student, Klass klass) {
        for (Observer observer : observers) {
            observer.handleNewMemberJoined(student, klass);
        }
    }
}
