package class1;

public class PeakFinder2D {

    public static void main(String[] args) {
        System.out.println(findAPeek(new int[][]{{10,8,10,10},{14,13,12,11},{15,9,11,21},{16,17,19,20}}));
    }

    public static int findAPeek(int [][] values){
        return finding(values, 0, values.length-1);
    }

    private static int finding(int[][] values, int lo, int hi) {
        int j = (hi+lo)/2;

        int maxJ = Integer.MIN_VALUE;
        int i=-1;
        for(int x = 0; x < values.length; x++){
            if(maxJ<values[x][j]){
                maxJ=values[x][j];
                i=x;
            }
        }
        if(j>0 && values[i][j]<values[i][j-1]){
            return finding(values, lo, hi-1);
        }else if(j<values.length-1 && values[i][j]<values[i][j+1]){
            return finding(values, lo+1, hi);
        }


        return values[i][j];
    }
}
