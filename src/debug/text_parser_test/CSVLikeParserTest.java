package debug.text_parser_test;

import text_parser.CSVLikeParser;

public class CSVLikeParserTest {
    public static void main(String[] args){
        StringBuilder sv = new StringBuilder();
        sv.append("3,4,5\n,4,3,\n,1,2,3,4");
        CSVLikeParser cs = new CSVLikeParser(sv,",",3);
//        System.out.println(cs.getData().length);
        for(double [] i:cs.getData()){
            for(double j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
