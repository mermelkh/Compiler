package brainFuckCommands;

import memory.Memory;
import output.Output;

import java.io.IOException;

public class OutputCommand implements BrainfuckCommand {
    @Override
    public void execute(Memory memory) {
        System.out.print((char) memory.currentCell());
        try {
            Output.getWriter().append((char)memory.currentCell());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
