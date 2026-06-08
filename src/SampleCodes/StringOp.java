package SampleCodes;

public class StringOp {
    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
            int res=str.charAt(0)-'0';
        for (int i = 1; i < str.length(); i+=2) {
            int val=str.charAt(i+1)-'0';
            char ch=str.charAt(i);
            if(ch=='A'){
                res=res&val;
            }
            if(ch=='B'){
                res=res|val;
            }
            if(ch=='C'){
                res=res^val;
            }
        }
        System.out.println(res);
    }
}
