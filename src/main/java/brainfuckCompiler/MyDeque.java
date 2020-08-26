package brainfuckCompiler;

import brainFuckCommands.BrainfuckCommand;
import brainFuckCommands.LoopCommand;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class MyDeque<E> extends ArrayDeque<List<BrainfuckCommand>> {

    public MyDeque<E> myAdd(BrainfuckCommand command)
    {
        this.peek().add(command);
        return this;
    }
    public MyDeque<E> myAddStartLoop()
    {
         this.push(new ArrayList<BrainfuckCommand>());
         return this;
    }
    public MyDeque<E> myAddEndLoop()
    {
        List<BrainfuckCommand> innerLoopCommands = this.pop();
        this.peek().add(new LoopCommand(innerLoopCommands));
        return this;
    }
}
