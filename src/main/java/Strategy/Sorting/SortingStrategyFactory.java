package Strategy.Sorting;

public class SortingStrategyFactory {
    public static SortingStrategy getSortingStrategy(int size){
        if(size <= 10){
            return new QuickSort();
        }else if(size <= 1000){
            return new HeapSort();
        }else return new MergeSort();
    }
}
