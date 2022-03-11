import java.util.*;

public class wizardOfOdds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double k = input.nextDouble();

        if(Math.log10(n) / Math.log10(2) <= k)
            System.out.println("Your wish is granted!");
        else
            System.out.println("You will become a flying monkey!");

        input.close();
    }
}