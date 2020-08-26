package brainFuckCommands;

import memory.Memory;

public class DecrementTheDataPointerCommand implements BrainfuckCommand {
    @Override
    public void execute(Memory memory){
        memory.setPointer(memory.getPointer() - 1);
    }
}
