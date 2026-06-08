package SampleCodes;

public class SubArrSum {
    public static void main(String[] args) {
        int []arr={2,-5,1,7,-3,4,-6};
        int sum=0;
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=arr.length-1;
        for (int i = l; i < arr.length; i++) {
            for (int j = l; j < arr.length; j++) {
                for (int k = l; k < r; k++) {
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;
                }
                r--;
                sum=0;
            }
            l++;
            r=arr.length-1;
        }
        System.out.println(max);
    }
}
