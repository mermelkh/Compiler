package brainFuckCommands;

import memory.Memory;

import java.util.List;

public class LoopCommand implements BrainfuckCommand {
    private List<BrainfuckCommand> innerLoopCommands;
    public LoopCommand(List<BrainfuckCommand> innerLoopCommands) {
        this.innerLoopCommands = innerLoopCommands;
    }

    @Override
    public void execute(Memory memory) {
        if (memory.currentCell()==0)
        {
            for (BrainfuckCommand command: innerLoopCommands)
            {
                command.execute(memory);
            }
        }
        while (memory.currentCell() != 0)
        {
            for (BrainfuckCommand command: innerLoopCommands)
            {
                command.execute(memory);
            }
        }
    }
}
