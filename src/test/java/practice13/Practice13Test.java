package practice13;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Dylan Wei
 * @date 2018-07-10 16:08
 */
public class Practice13Test {
    private Klass klass;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String systemOut() {
        return outContent.toString();
    }

    @Before
    public void setup() {
        klass = new Klass(1);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_teacher_and_computer_be_notified() throws Exception {
        Computer computer = new Computer();
        klass.registerListenser(computer);
        List<Klass> klasses = new ArrayList<>();
        klasses.add(klass);
        Teacher tom = new Teacher(1, "Tom", 21, klasses);
        Student jerry = new Student(1, "Jerry", 8, new Klass(3));

        klass.appendMember(jerry);
        klass.assignLeader(jerry);


        assertThat(systemOut()).contains("I am the Machine. I know Jerry has joined Class 1.");
        assertThat(systemOut()).contains("I am the Machine. I know Jerry become Leader of Class 1.");

    }

}
