package brainfuckCompiler;

import brainFuckCommands.*;
import factory.Factory;

import java.util.ArrayList;
import java.util.List;



public class BrainfuckCompiler {

    public List<BrainfuckCommand> compile(String program) {
        MyDeque<List<BrainfuckCommand>> commandStack = new MyDeque<>();
        commandStack.push(new ArrayList<BrainfuckCommand>());
        for (char instruction : program.toCharArray()) {
            commandStack = new Factory(commandStack).getCommand(instruction);
        }
        return commandStack.pop();
    }

}



