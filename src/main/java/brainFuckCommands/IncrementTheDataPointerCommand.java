package brainFuckCommands;

import memory.Memory;

public class IncrementTheDataPointerCommand implements BrainfuckCommand {

    @Override
    public void execute(Memory memory){
        memory.memory.add((byte)0);
        memory.setPointer(memory.getPointer() + 1);
    }

}
