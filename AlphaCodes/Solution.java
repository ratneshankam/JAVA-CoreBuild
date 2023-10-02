public class Solution  
{  
    public static void prime(int n)  {
        int count = 2;
        int itr = 0;
        int []arr = new int[100];
        while(count<=n) {
            for (int i=2; i<=count; i++) {
                if (i==count || count==2) {
                    arr[itr] = count;
                    itr++;
                }
                if (count==2) {
                    break;
                }
                if (count%i==0) {
                    break;
                }
            }
            count++;
        }
        for(int i=0; i<=arr.length; i++) {
            if(arr[i] == 0) {
                break;
            }
            System.out.print(arr[i]+ " ");
        }
    }
public static void main(String[] args) {
    prime(11);

}
}  