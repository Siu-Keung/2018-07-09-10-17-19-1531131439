package practice12;

/**
 * @author Dylan Wei
 * @date 2018-07-10 14:29
 */
public interface Observable {
    void notifyAllLeaderAssignedListeners(Student student, Klass klass);

    void notifyAllNewMemberJoinedListeners(Student student, Klass klass);

    void registerListenser(Observer observer);

}
