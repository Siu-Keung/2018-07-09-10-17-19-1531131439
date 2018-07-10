package practice11;

import java.util.LinkedList;

/**
 * @author Dylan Wei
 * @date 2018-07-10 14:49
 */
public class Main {

    public static void main(String[] a){
        Klass klass2 = new Klass(2);
        LinkedList<Klass> linkedList = new LinkedList<Klass>();
        linkedList.add(klass2);
        Teacher tom = new Teacher(1, "Tom", 21, linkedList);
        Student jerry = new Student(1, "Jerry", 8, new Klass(3));

        klass2.appendMember(jerry);
        klass2.assignLeader(jerry);
    }
}
