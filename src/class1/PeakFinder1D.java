package class1;

public class PeakFinder1D {

    public static void main(String[] args) {
        System.out.println(findAPeek(new int[]{40, 5, 60, 7, 8, 9, 10}));
    }

    public static int findAPeek(int[] values){
        int med = values.length/2;

        return finding(values, 0, values.length-1);
    }

    private static int finding(int[] values, int lo, int hi) {
        int med = 0;

            med = (hi+lo)/2;
            if(med>0 && values[med]<values[med-1]){
                return finding(values, lo, med-1);
            }else if(med<values.length-1 && values[med]<values[med+1]){
                return finding(values,med+1, hi);
            }
        return values[med];
    }

}
