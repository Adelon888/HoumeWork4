



public class Main {
    public static void main(String[] args) {
        int[][] a=new int[10][10];
        int b;

        for(int i=1;i<a.length;i++)
            for (int j = 1; j < a[0].length; j++)
                a[i][j] = j;

        for(int j=1;j<a.length;j++) {
            for (int i = 1; i < a[0].length; i++) {
                b=a[i][i]+a[i][j];
                if(b>=10) System.out.print(a[i][i]+"+"+a[i][j]+"="+b+" ");
                else System.out.print(a[i][i]+"+"+a[i][j]+"="+b+"  ");
            }
            System.out.println();
        }
    }
}