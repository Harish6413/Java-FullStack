package SampleCodes.CompanyQuestions;

import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        String[] garbage={"G","P","GP","GG"};
        int[] time={2,4,3};
        StringBuffer sb = new StringBuffer();
        int g=-1,m=-1,p=-1;
        for (String str: garbage) {
            sb.append(str);
            if(str.contains("G")){
                g++;
            }
            if (str.contains("M")){
                m++;
            }
            if (str.contains("P")){
                p++;
            }
        }
        for (int i = 1; i < time.length; i++) {
            time[i]=time[i]+time[i-1];
        }
        int totalTime = sb.length();
            if(m>0){
                totalTime+=time[m];
            }
            if(g>0){
                totalTime+=time[g];
            }
            if(p>0){
                totalTime+=time[p];
            }
        System.out.println(totalTime);
    }
}
