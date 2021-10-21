package debug.text_picker_test;

import text_picker.SpaceFilter;

public class SpaceFilterTest {
    public static void main(String[] args){
        String s = "hell  o,           worl d";
        System.out.println(SpaceFilter.getFilterText(s));
    }
}
