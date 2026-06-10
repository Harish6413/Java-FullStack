package SampleCodes.CompanyQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class IBMCoinFactory {
    public static void main(String[] args) {
        int[] arr={1,10};
        System.out.println(coins(arr));
    }
    public static int coins(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            int sum=0;
            while(x!=0)
            {
                int rem=x%10;
                sum+=rem;
                x/=10;
            }
            map.put(sum,(map.getOrDefault(sum,0))+1);
        }
        int max=0;
        for (int val: map.values())
        {
            max=Math.max(max,val);
        }
        return max;
    }
}
