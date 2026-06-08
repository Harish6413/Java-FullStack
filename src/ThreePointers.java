public class ThreePointers {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b={2,4,6,8,10};
        int []c={2,3,6,9,12};
        int x=0,y=0,z=0;
        while (x<a.length && y<b.length && z<c.length){
            if(a[x]==b[y] && b[y]==c[z]){
                System.out.println(a[x]);
                x++;
                y++;
                z++;
            } else if (a[x]<b[y]) {
                x++;
            } else if (b[y]<c[z]) {
                y++;
            }
            else {
                z++;
            }
        }
    }
}
