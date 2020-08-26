
    import brainFuckCommands.BrainfuckCommand;
import brainfuckCompiler.BrainfuckCompiler;
import memory.Memory;
import output.Output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

    public class Main {

        public static void main(String[] args) {

            //String program = "+++++++++++++++++++++++++++++++++."; // any brainfuck program
            //String program = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++."; // Hello World!
            // String program ="++++++++[->-[->-[->-[-]<]<]<]>++++++++[<++++++++++>-]<[>+>+<<-]>-.>-----.>"; // OK
            String program = "[-]>[-]>[-]<++[>++++++++<-]>[<++++++++>-]<[>++++++++<-]>[<++++++++>-]<[<++++++++>-]<[[-]>[-]+++++++++[<++++++++++>-]<.>++++[<+++++>-]<+.--.-----------.+++++++.----.>>[-]<+++++[>++++++<-]>++.<<[-]]"; // Zombie

            List<BrainfuckCommand> compiledProgram = new BrainfuckCompiler().compile(program);


            Writer file = null;
            try {
                file = new FileWriter("E://testMain", true);
                Output output = new Output(file);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Memory memory = new Memory();
            for (BrainfuckCommand command : compiledProgram) {
                command.execute(memory);
            }


            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public static void main(String program , String filePath) {
            List<BrainfuckCommand> compiledProgram = new BrainfuckCompiler().compile(program);
            Writer file = null;
            try {
                file = new FileWriter(filePath, true);
                Output output = new Output(file);
            } catch (IOException e) {
                e.printStackTrace();
            }


            Memory memory = new Memory();
            for (BrainfuckCommand command : compiledProgram) {
                command.execute(memory);
            }


            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

