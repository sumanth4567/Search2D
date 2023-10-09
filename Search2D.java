import java.util.*;
public class Search2D {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int target,rows,cols;
        System.out.println("Enter the matrix row and col:");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the target value:");
        target=sc.nextInt();
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(target>matrix[i][cols-1]){
                    //breaking loop if target is greater than last element of pcurrent row
                    break;
                }
                else{
                    if(target==matrix[i][j]){
                        System.out.println("The target is present in the matrix");
                        k=1;
                        return ;
                    }
                }
            }
        }
        if(k==0){
            System.out.println("Element is not present in the matrix");
        }
    }    
}
