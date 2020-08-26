package factory;

import brainFuckCommands.*;
import brainfuckCompiler.MyDeque;

import java.util.List;

public class Factory {
    private MyDeque<List<BrainfuckCommand>> commandStack;

    public Factory(MyDeque<List<BrainfuckCommand>> stack)
    {
        commandStack = stack;
    }
    public MyDeque<List<BrainfuckCommand>> getCommand(char command)
    {
        switch (command) {
            case '+':
                return commandStack.myAdd(new IncrementTheByteCommand());
                //return  new IncrementTheByteCommand().accept();
            case '-':
                return commandStack.myAdd(new DecrementTheByteCommand());

                //return new DecrementTheByteCommand();
            case '.':
                return commandStack.myAdd(new OutputCommand());
                //return new OutputCommand();
            case '>':
                return commandStack.myAdd(new IncrementTheDataPointerCommand());
                //return new IncrementTheDataPointerCommand();
            case '<':
                return commandStack.myAdd(new DecrementTheDataPointerCommand());
                //return new DecrementTheDataPointerCommand();
            case '[': {
                return commandStack.myAddStartLoop();
                //return command;
            }
            case ']':{
                return commandStack.myAddEndLoop();
            }
            default:
                return null;
        }
    }
}
