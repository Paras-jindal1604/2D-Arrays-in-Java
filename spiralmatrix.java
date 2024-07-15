public class spiralmatrix {
    public static void printspiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while( startRow<=endRow && startCol<=endCol ){
            
            // top - startrow is fixed and col varies 
            for(int j = startCol;j<=endCol;j++){
                System.out.print( matrix[startRow][j] + " " );
            }

            /*  right - col is fixed as endcol but row varies and startrow ka last element to print hogya hai 
                            upar wle loop mei to startrow + 1 se start krke endrow tak jyenge      */
            
            for(int i=startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            /* bottom - row is fixed as endrow but col varies or endcol ka last element upar wle loop mei 
                            print hogya hai to endcol - 1 se start krenge or startcol tak jyenge kyuki 
                            idhr ulta chalna hai to j-- hoga
                            badi value se code start hoga to j>= use hoga
             */

            for(int j= endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            /* left - col is fixed as startcol but row varies or startrow ka first element and endrow ka last
                         element to upar k loops mei cover hogye hai to endrow -1 se lekar startrow +1 tak 
                         chalna hai ulta to i-- hoga
                         badi value se loop start hoga to i>= use hoga
             */

            for(int i=endRow-1; i>=startRow + 1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

           
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        printspiral(matrix);
    }
    
}
