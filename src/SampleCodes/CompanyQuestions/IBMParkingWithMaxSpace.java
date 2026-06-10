package SampleCodes.CompanyQuestions;

public class IBMParkingWithMaxSpace {
    public static void main(String[] args) {
        int [] arr={0,0,0,0,1};
        System.out.println(parking(arr));
    }
    public static int parking(int[] arr)
    {
        int max=0;
        int prev=-1;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==1)
            {
                if(prev==-1)
                {
                    max=i;
                }
                else {
                    max=Math.max(max,Math.abs((i-prev)/2));
                }
                prev=i;
            }
        }
        max = Math.max(max,(arr.length-1-prev));
        return max;
    }
}
