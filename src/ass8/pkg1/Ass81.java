
package ass8.pkg1;

public class Ass81 {

    public static void main(String[] args) {
        int INF = 9999;
        int NIL = 0;
        
        int[][] dZero = {
            {0,2,INF,1,8},
            {6,0,3,2,INF},
            {INF,INF,0,4,INF},
            {INF,INF,2,0,3},
            {3,INF,INF,INF,0}};
        
        int[][] pZero = {
            {0,3,8,INF,-4},
            {INF,0,INF,1,7},
            {INF,4,0,INF,INF},
            {2,INF,-5,0,INF},
            {INF,INF,INF,6,0}};

        Floyds floyd = new Floyds();
        System.out.println("P==============================================\n");
        floyd.floydsAlg(pZero);
        System.out.println("D==============================================\n");
        floyd.floydsAlg(dZero);
    }
    
}
