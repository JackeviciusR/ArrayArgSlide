/*
 * 
 */
package arrargslide;

/**
 *
 * @author Rokas
 */
public class ArrArgSlide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int type = 0;
        
        int[] m = {1,2,3,4,5,6,7,8,9};
        
        int[][] rez = new int[m.length][m.length];
        
        /*
        eg.
        int[] m = {1,2,3,4,5};
        
        type = 0;
        int[][] rez1 = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 1},
            {3, 4, 5, 1, 2},
            {4, 5, 1, 2, 3},
            {5, 1, 2, 3, 4}
        };
        type = 1;
        int[][] rez2 = {
            {1, 2, 3, 4, 5},
            {5, 1, 2, 3, 4},
            {4, 5, 1, 2, 3},
            {3, 4, 5, 1, 2},
            {2, 3, 4, 5, 1}
        };
        */
        
        for (int i = 0; i < m.length; i++) {
            
            int[] row = rez[i];
            
            for (int j = 0; j < m.length; j++) {
                
                if (i==0) {
                    row[j] = m[j];
                } else {
                    
                    if (type == 0) {

                        if (j < m.length - 1) {
                            row[j] = rez[i - 1][j + 1];
                        } else {
                            row[j] = rez[i - 1][0];
                        }
                    }
                    
                    if (type == 1) {

                        if (j == 0) {
                            row[j] = rez[i - 1][m.length-1];
                        } else {
                            row[j] = rez[i - 1][j - 1];
                        }
                    }
                    
                }
        
                int element = row[j];               
                System.out.print(element + " ");
                
            }
            
            System.out.println("");
            
        }
    }
    
}
