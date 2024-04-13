public class SelectionSort {
    public int[] basicSelectionSort(int[] x) 
    {
        for (int i = 0; i < x.length - 1; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    // Swap x[i] and x[j]
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
    