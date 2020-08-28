package brainfuckCompiler;

import brainFuckCommands.*;
import commandsCreator.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class BrainfuckCompiler {

    public List<BrainfuckCommand> compile(String program) {
        MyDeque<List<BrainfuckCommand>> commandStack = new MyDeque<>();
        HashMap<Character, CommandCreator> hashMap= new HashMap<>();
        hashMap.put('+', new IncrementTheByteCreator());
        hashMap.put('-', new DecrementTheByteCreator());
        hashMap.put('.', new OutputCreator());
        hashMap.put('>', new IncrementTheDataPointerCreator());
        hashMap.put('<', new DecrementTheDataPointerCreator());
        hashMap.put('[', new StartLoopCreator());
        hashMap.put(']', new EndLoopCreator());

        commandStack.push(new ArrayList<BrainfuckCommand>());
        for (char instruction : program.toCharArray()) {
            commandStack = hashMap.get(instruction).create(commandStack);
        }
        return commandStack.pop();
    }

}



