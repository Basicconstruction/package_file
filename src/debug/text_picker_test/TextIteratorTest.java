package debug.text_picker_test;

import text_picker.TextCollector;
import text_picker.TextIterator;

import java.io.File;

public class TextIteratorTest {
    public static void main(String[] args){
        TextCollector tc = new TextCollector(new File("H:\\Desktop\\hosts"));
        TextIterator ti = tc.getAsTextIterator();
        while(ti.hasNext){
            System.out.println(tc.getLine());
        }
    }
}
