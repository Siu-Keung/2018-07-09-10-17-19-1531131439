package practice12;

/**
 * @author Dylan Wei
 * @date 2018-07-10 16:09
 */
public class Computer implements Observer {
    @Override
    public void handleLeaderAssigned(Student student, Klass klass) {
        System.out.print("I am the Machine. I know " + student.getName() + " become Leader of " + klass.getDisplayName() + ".\n");
    }

    @Override
    public void handleNewMemberJoined(Student student, Klass klass) {
        System.out.print("I am the Machine. I know " + student.getName() + " has joined " + klass.getDisplayName() + ".\n");
    }
}
