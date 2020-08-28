package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainFuckCommands.IncrementTheDataPointerCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class IncrementTheDataPointerCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAdd(new IncrementTheDataPointerCommand());
    }
}
