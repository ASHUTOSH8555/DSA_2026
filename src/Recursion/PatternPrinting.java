package Recursion;

public class PatternPrinting {
    public static void main(String[] main){
        Triangle(4,0);
    }
    public static void Triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("*");
            Triangle(row, col+1);
        }
        else{
            System.out.println();
            Triangle(row-1,0);
        }
    }
}
