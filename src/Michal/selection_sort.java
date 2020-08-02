package Michal;

import java.util.ArrayList;
import java.util.Collections;

public class selection_sort {

    public static ArrayList<Integer> selection_sort_algo (ArrayList<Integer> arr){
        int min_index =0 ;
        for (int i = 0;i<arr.size(); i++){
             i = min_index;
             for (int j = i+1; j < arr.size(); j++){
                 if (arr.get(j) < arr.get(min_index))
                     min_index = j;
             }
            Collections.swap(arr,i,min_index);
        }
        return arr;
    }
}
