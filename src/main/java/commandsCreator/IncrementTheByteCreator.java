package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainFuckCommands.IncrementTheByteCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class IncrementTheByteCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAdd(new IncrementTheByteCommand());
    }
}
