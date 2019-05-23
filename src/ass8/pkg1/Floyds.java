
package ass8.pkg1;

import java.util.Arrays;


public class Floyds {
    private int INF = 9999;
    private int NIL = 0;
    
    public Floyds()
    {
        
    }
    
    public int[][] floydsAlg(int[][] A)
    {
        
        int n = A[0].length;
        int[][] Aprime = new int[A[0].length][A.length];
        
        for (int i=0; i<A[0].length; i++){
            for (int j=0; j<A.length; j++){
                Aprime[i][j] = A[i][j];
            }
        }
        int[][] D = A;
        int[][] P = predecess(Aprime);
        
        
        
        for (int k = 0; k < n; k++)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (D[i][j] > (D[i][k] + D[k][j])){
                        D[i][j] = (D[i][k] + D[k][j]);
                        P[i][j] = P[k][j];
                    }
                }
            }
            System.out.println("D[" + k + "]:");
            printMatrix(D);
            System.out.println("Pi[" + k + "]:");
            printPMatrix(P);
        }
        System.out.println("D[5]:");
        printMatrix(D);
        System.out.println("Pi[5]:");
        printPMatrix(P);
        return D;
    }
    
    public int[][] predecess(int[][] Pi)
    {
        for (int i = 0; i < Pi[0].length; i++)
        {
            for (int j = 0; j < Pi.length; j++)
            {
                if (i!=j && Pi[i][j] < INF)
                {
                    Pi[i][j] = i+1;
                }
                else if (i == j || Pi[i][j] == INF)
                {
                    Pi[i][j] = NIL;
                }
            }
        }
        return Pi;
    }
    
    
    
    public void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix[0].length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                if (matrix[i][j] == 9999)
                {
                    System.out.print("INF ");
                }
                else
                {
                String num = matrix[i][j] + " ";
                System.out.print(num);
                }

            }
            System.out.println();
        }
        System.out.println("\n");
    }
    
    public void printPMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix[0].length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    System.out.print("NIL ");
                }
                else
                {
                String num = matrix[i][j] + " ";
                System.out.print(num);
                }

            }
            System.out.println();
        }
        System.out.println("\n");
    }

}
