package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class StartLoopCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAddStartLoop();
    }
}
