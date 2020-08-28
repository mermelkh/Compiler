package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class EndLoopCreator implements CommandCreator {
    @Override
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack) {
        return commandStack.myAddEndLoop();
    }
}
