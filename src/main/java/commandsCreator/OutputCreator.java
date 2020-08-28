package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainFuckCommands.OutputCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class OutputCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAdd(new OutputCommand());
    }
}
