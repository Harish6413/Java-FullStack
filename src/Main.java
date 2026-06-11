import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        int [] nums={-1};
        int k=2;
        int [] arr = new int[nums.length];
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(k!=0)
            {
                arr[i]=nums[n-k];
                k--;
            }
            else{
                arr[i]=nums[j++];
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}