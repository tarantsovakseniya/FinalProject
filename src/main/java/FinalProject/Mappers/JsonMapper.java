package FinalProject.Mappers;

import FinalProject.Writers.MyJsonWriter;

@FunctionalInterface
public interface JsonMapper<T> {
    //method get Object and write it into correct JSON form
    void write(T obj, MyJsonWriter writer);
}
