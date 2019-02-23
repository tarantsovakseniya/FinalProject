package FinalProject;

import java.io.File;
import java.util.ArrayList;

public class TestClass {
    interface iMyInter {
        void get();
    }

    int i = 50;
    String j = "bla-bla";
    iMyInter iMyInter = new iMyInter() {
        ArrayList<File> list = new ArrayList(); {
            list.add(new File("hell"));
        }

        @Override
        public void get() {
            System.out.println("get method");
        }
    };

}
