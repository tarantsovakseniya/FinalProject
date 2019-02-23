package FinalProject.Mappers;

import FinalProject.Writers.MyJsonWriter;

@FunctionalInterface
public interface JsonMapper<T> {
    //метод, принимает обьект и проверяет его принадлежность к мапперу
    void write(T obj, MyJsonWriter writer);
}