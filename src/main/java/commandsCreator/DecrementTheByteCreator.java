package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainFuckCommands.DecrementTheByteCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class DecrementTheByteCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAdd(new DecrementTheByteCommand());
    }
}
