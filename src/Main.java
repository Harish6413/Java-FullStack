import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        int [] arr={1,10};
        int n= arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x=arr[i];
            int sum=0;
            while(x!=0)
            {
                int rem=x%10;
                sum+=rem;
                x/=10;
            }
            hm.put(sum,(hm.getOrDefault(sum,0))+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}