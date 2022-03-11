import java.io.IOException;
import java.util.*;

public class grandpasCheckers {
    public static void main(String[] args)  throws IOException  {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char[][] board = new char[n][n];
        int white=0, black=0;
        boolean validRow = true;
        boolean validColumn = true;

        String temp = "";
        for(int i = 0; i < n; i++){
            temp = input.next().toLowerCase();
            white = 0;
            black = 0;
            for(int j = 0; j < temp.length(); j++){
                board[i][j] = temp.charAt(j);
                if(board[i][j]=='b') black++;
                if(board[i][j]=='w') white++;
            }
            if(temp.contains("bbb") || temp.contains("www")){
                validRow = false;
            } else if(white!=black){
                validRow = false;
            }
        }

        //Now I'm going to analyze the columns
        for(int a = 0; a < n; a++){
            white = 0;
            black = 0;
            for(int b = 0; b < n; b++){
                if(board[b][a]=='w') white++;
                if(board[b][a]=='b') black++;
            }
            StringBuilder sb = new StringBuilder();
            for(int b = 0; b<n; b++){
                sb.append(board[b][a]);
            }
            String column = sb.toString();

            if(column.contains("bbb") || column.contains("www")){
                validColumn = false;
            } else if(white!=black){
                validColumn = false;
            }
        }
        System.out.println(validRow && validColumn ? 1 : 0);

        input.close();
    }
}
