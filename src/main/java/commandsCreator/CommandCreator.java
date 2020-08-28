package commandsCreator;

import brainFuckCommands.BrainfuckCommand;
import brainfuckCompiler.MyDeque;

import java.util.List;

public interface CommandCreator {
    public MyDeque<List<BrainfuckCommand>> create(MyDeque<List<BrainfuckCommand>> commandStack);
}

