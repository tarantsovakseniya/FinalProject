package FinalProject;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, TestClass> map = new HashMap<>();
        map.put("Data", new TestClass());

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println(new MyJsonSerializer().serialize(map));
            }).start();
        }
    }
}
