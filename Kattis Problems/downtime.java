import java.util.*;

public class downtime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        int output = 1;
        int[] times = new int[n];
        int index = 0, temp = 1;

        times[0] = input.nextInt();
        for(int i = 1; i < n; i++){
            times[i] = input.nextInt();
            while(times[index] + 1000 <= times[i]){
                index++;
                temp--;
            }
            temp++;
            output = Math.max(output, temp);
        }
        System.out.println((int) Math.ceil(1.0*output / k));
        input.close();
    }
}
