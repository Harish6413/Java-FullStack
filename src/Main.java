import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {100,180,260,310,40,535,695};
        int p=0,b=arr[0];
        int s=0;
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<b){
                s=arr[i-1];
                p+=(s-b);
                b=arr[i];
            }
        }
        p+=(s-b);
        System.out.println(p);
    }
}