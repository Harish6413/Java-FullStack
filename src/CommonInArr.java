import java.util.Arrays;

public class CommonInArr {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b={2,4,6,8,10};
        int []c={2,3,6,9,12};
        System.out.println(Arrays.toString(arr(a,b,c)));
    }
    static int[] arr(int []a,int []b,int []c){
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++){
                    if(a[i]==b[j] && a[i]==c[k]){
                        return new int[]{a[i]};
                    }
                }
            }
        }
        return a;
    }
}
