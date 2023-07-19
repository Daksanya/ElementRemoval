import java.util.Scanner;
import java.util.Arrays;

public class ElementsRemoval {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }

        System.out.println(cost(array,n));
    }
    static int cost(int[] array,int n){
        Arrays.sort(array);
        int cost=0 ;
        int prefixSum=0;
        for (int i = 0; i <n; i++) {
            prefixSum+=array[i];
            cost+=prefixSum;
        }

        return cost;
    }
}
