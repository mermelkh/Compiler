package output;

import java.io.Writer;

public  class Output {
    private static Writer writer;
    public Output(Writer writer)
    {
        this.writer = writer;
    }

    public static Writer getWriter() {
        return writer;
    }
}
