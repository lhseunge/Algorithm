import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] aArray = a.split("");
        
        for (int i = 0; i <= a.length() - 1; i++) {
            System.out.println(aArray[i]);
        }
    }
}