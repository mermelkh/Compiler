import org.junit.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;


public class ProgramTest {
    @Test
    public void main_with_nested_loops_HelloWorld() {
        Main main = new Main();
        String str=  "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        main.main(str, "E://test");
        String actual = null;
        try {
            Reader reader = new FileReader("E://test");
            Scanner scanner = new Scanner(reader);
            actual = scanner.nextLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String expected = "Hello World!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void main_ExclamationPoint() {
        Main main = new Main();
        String str="+++++++++++++++++++++++++++++++++.";
        main.main(str, "E://test1");
        String actual = null;
        try {
            Reader reader = new FileReader("E://test1");
            Scanner scanner = new Scanner(reader);
            actual = scanner.nextLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String expected = "!";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void main_str_with_loops_Hellowirld() {
        Main main = new Main();
        String str=">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.[-]" +
                ">++++++++[<++++>-]<.>+++++++++++[<++++++++>-]<-.--------.+++" +
                ".------.--------.[-]>++++++++[<++++>-]<+.[-]++++++++++.";
        main.main(str, "E://test2");
        String actual = null;
        try {
            Reader reader = new FileReader("E://test2");
            Scanner scanner = new Scanner(reader);
            actual = scanner.nextLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String expected = "Hello world!";
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void main_with_nested_loops_OK() {
        Main main = new Main();        String str="++++++++[->-[->-[->-[-]<]<]<]>++++++++[<++++++++++>-]<[>+>+<<-]>-.>-----.>";
        main.main(str, "E://test3");
        String actual = null;
        try {
            Reader reader = new FileReader("E://test3");
            Scanner scanner = new Scanner(reader);
            actual = scanner.nextLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String expected = "OK";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void main_with_nested_loops_dead_code_Zombie() {
        Main main = new Main();
        String str = "[-]>[-]>[-]<++[>++++++++<-]>[<++++++++>-]<[>++++++++<-]>[<++++++++>-" +
                "]<[<++++++++>-]<[[-]>[-]+++++++++[<++++++++++>-]<.>++++[<+++++>-]<+." +
                "--.-----------.+++++++.----.>>[-]<+++++[>++++++<-]>++.<<[-]]";
        main.main(str, "E://test4");
        String actual = null;
        try {
            Reader reader = new FileReader("E://test4");
            Scanner scanner = new Scanner(reader);
            actual = scanner.nextLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String expected = "Zombie ";
        Assert.assertEquals(expected, actual);
    }
}
