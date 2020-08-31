package StringAndArrays;

import java.util.ArrayList;

public class String_Arrays {

    //Given two strings, determine if one string is a permutation of the other.
  /*  public static boolean permutation (String st1, String st2){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        int size1 = st1.length(), size2 = st2.length();
        for (int i = 0; i < size1; i++){
            arrayList1.add((int)(st1.charAt(i), );
        }
    }
       */
    public static boolean reversedString (String st){
        int size = st.length();
        String reversedString = st;
        if (st.length() == 0 || st.length() == 1) return true;
        int pos = 0;
        for (int i = size-1; i >=0 ; i--){
                if (reversedString.charAt(i) != st.charAt(pos)) {
                System.out.println("The string " + st +  " is not a permutation");return false;
            }
            pos++;
        }
        System.out.println("The string " + st +  " is a permutation");
        return true;
    }

    // Sentence Reversed
    public static void reverseLetters (char[] st, int start, int end) {
        // 'd', 'o', 'g' , ' ', 'a' , 'b'
        // 'b', 'a',' ', 'g', 'o',' d'

        while (start < end) {
            char temp = st[start];
            st[start] = st[end];
            st[end] = temp;
            start++;
            end--;
           }
    }

    public static char[] reversingWords(char[]st){
        int start = 0, end = st.length-1;
        reverseLetters(st, start, end);

        for (int i = 0; i <= end; i++){
            if (st[i] == ' '){
                reverseLetters(st,start, i-1);
                start = i+1;}

        }
        // reversing the last word:
        reverseLetters(st, start, end);

    return st;
    }

}
