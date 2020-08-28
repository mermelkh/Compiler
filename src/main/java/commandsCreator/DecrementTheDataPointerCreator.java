package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainFuckCommands.DecrementTheDataPointerCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class DecrementTheDataPointerCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAdd(new DecrementTheDataPointerCommand());
    }
}
