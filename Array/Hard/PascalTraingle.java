package Array.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTraingle {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i)
                {
                    result.add(1);
                }
                else{
                    result.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(result);
        }
        sc.close();
    }
}
