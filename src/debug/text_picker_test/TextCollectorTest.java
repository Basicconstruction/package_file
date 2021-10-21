package debug.text_picker_test;


import text_picker.TextCollector;

import java.io.File;

public class TextCollectorTest {
    public static void main(String[] args){
        TextCollector tc = new TextCollector(new File("H:\\Desktop\\hosts"));
        while(tc.hasNext){
            System.out.println(tc.getLine());
        }
    }
}
