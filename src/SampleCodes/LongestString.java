package SampleCodes;

public class LongestString {
    public static void main(String[] args) {
        String str="I love to code in java programming";
        String []arr=str.split(" ");
        int m=0,x=0;
        for(int i=0;i< arr.length;i++){
            String s=arr[i];
            int len=s.length();
            if(len>m){
                m=len;
                x=i;
            }
        }
        System.out.println(arr[x]);
    }
}
