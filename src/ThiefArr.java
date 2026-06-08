import java.util.Arrays;

public class ThiefArr {
    public static void main(String[] args) {
        int []arr={5,4,3,8,5,1,0,2,8};
        int []a=new int[arr.length*2];
        int x=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==0){
                    a[x++]=arr[j];
                }
                else if(i==1 && j%2!=0){
                    a[x++]=arr[j];
                } else if (i==2 && j%2==0) {
                    a[x++]=arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
