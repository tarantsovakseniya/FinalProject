package FinalProject;


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, A> map = new HashMap<>();
        map.put("Data", new A());

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println(new MyJsonSerializer().serialize(map));
            }).start();
        }
    }
}
