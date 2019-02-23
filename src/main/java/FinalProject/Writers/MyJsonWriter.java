package FinalProject.Writers;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;

public class MyJsonWriter {

    //write symbols in line
    Writer writer;

    public MyJsonWriter(Writer writer) {
        if (writer == null) {
            throw new NullPointerException("out == null");
        } else {
            this.writer = writer;
        }
    }

    void writeObjectBegin() throws IOException {
        writer.append("{");
    }

    //delete previous symbol and close }
    void writeObjectEnd() throws IOException {
        writer.append("\b");
        writer.append("}");
    }

    void writeArrayBegin() throws IOException {
        writer.append("[");
    }

    //delete previous symbol and close ]
    void writeArrayEnd() throws IOException {
        writer.append("\b");
        writer.append("]");
    }

    //write String
    void writeString(String s) throws IOException {
        writer.append("\"");
        writer.append(s);
        writer.append("\"");
    }

    //write numbers
    void writeNumber(Number n) throws IOException {
        writer.append(n.toString());
    }

    //add ","
    void writeSeparator() throws IOException {
        writer.append(",");
    }

    //add ":"
    void writePropertySeparator() throws IOException {
        writer.append(":");
    }

    void writeBoolean(String b) throws IOException {
        writer.append(b);
    }

    void writeNull() throws IOException {
        writer.append("null");
    }

    void flush() throws IOException {
        writer.flush();
    }
}

