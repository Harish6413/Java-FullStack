package SampleCodes;

public class CheckPassword {
    public static void main(String[] args) {
        String str="aA1_67";
        char []arr=str.toCharArray();
        int n=arr.length;
        System.out.println(CP(arr,n));
    }
    static int CP(char []arr,int n){
        if(n<4 || Character.isDigit(arr[0])){
            return 0;
        }
        else{
            boolean uc=false,nd=false;
            for (int i = 0; i < n; i++) {
                char ch=arr[i];
                if(Character.isDigit(ch)){
                    nd=true;
                }
                else if(Character.isUpperCase(ch)){
                    uc=true;
                }
                else if(ch==' ' || ch=='/'){
                    return 0;
                }
            }
            if(uc&nd){
                return 1;
            }
        }
        return 0;
    }
}
