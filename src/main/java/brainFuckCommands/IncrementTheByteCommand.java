package brainFuckCommands;

import memory.Memory;

public class IncrementTheByteCommand implements BrainfuckCommand {
    @Override
    public void execute(Memory memory ){
        byte bytes = memory.currentCell();
        memory.setCurrentCell(++bytes);
    }
}
