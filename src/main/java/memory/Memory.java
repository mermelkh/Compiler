package memory;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    public List<Byte> memory;
    private int pointer = 0;
    public Memory()
    {
        memory=new ArrayList<Byte>();
        memory.add((byte) 0);
    }
    public int getPointer()
    {
        return pointer;
    }
    public void setPointer(int value)
    {
        this.pointer = value;
    }
    public byte currentCell()
    {
        return memory.get(pointer);
    }
    public void setCurrentCell(byte value)
    {
        this.memory.set(pointer, value);
    }
}
