package debug.text_picker_test;

import text_picker.EasySplit;
import text_picker.SpaceFilter;

public class EasyFilterTest {
    public static void main(String[] args){
        String s = "hell  o,           worl d";
        System.out.println((s = SpaceFilter.getFilterText(s)));
        EasySplit ea = new EasySplit(" ");
        String[] ss = ea.getSplits(s);
        for(String f:ss){
            System.out.println(f);
        }
    }
}
