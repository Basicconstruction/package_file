package debug.data_provider_test;

import data_provider.DataProvider;

import java.util.ArrayList;

public class DataProviderTest {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        for(int i = 0;i <10;i++){
            ArrayList<Integer> y = new ArrayList<>();
            for(int j = 0;j<10;j++){
                y.add(i*10+j);
            }
            x.add(y);
        }
        DataProvider<Integer> provider = new DataProvider<>(x, 6);
        System.out.println(provider.getMaxSteps());
        for(int i = 0;i<10;i++){
            for(Integer in:provider.get()){
                System.out.print(in+" ");
            }
            System.out.println();
        }
        provider.back();
        provider.back();
        provider.back();
        provider.back();
        provider.back();
        for(Integer in:provider.get()){
            System.out.print(in+" ");
        }
        System.out.println("-".repeat(30));
        for(Integer in:provider.get()){
            System.out.print(in+" ");
        }
        System.out.println("-".repeat(30));
//        System.out.println();
//        int i = 0;
//        for(ArrayList<Integer> e: provider.storagePointer){
//            System.out.print(i+" ");
//            for(Integer in:e){
//                System.out.print(in+" ");
//            }
//            i++;
//            System.out.println();
//        }
        provider.run(10);
        for(Integer in:provider.get()){
            System.out.print(in+" ");
        }
        System.out.println("-".repeat(30));
        provider.run(0);
        for(Integer in:provider.get()){
            System.out.print(in+" ");
        }
        System.out.println("-".repeat(30));

    }
}
