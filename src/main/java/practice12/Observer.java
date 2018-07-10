package practice12;

/**
 * @author Dylan Wei
 * @date 2018-07-10 14:25
 */
public interface Observer {
    void handleLeaderAssigned(Student student, Klass klass);
    void handleNewMemberJoined(Student student, Klass klass);
}
