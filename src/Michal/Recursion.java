package Michal;

public class Recursion {

    // recursion call in a stack . takes O(n) time and O(n) space.
    public int sum (int n){
        if (n <= 0) return 0;
        return n + sum(n-1);
    }
}
