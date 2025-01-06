package Strategy.Sorting;

public class DataProcessor {
    SortingStrategy sortingStrategy;
    DataProcessor(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }


    public void processData(int[] data){
        if(sortingStrategy == null){
            sortingStrategy = SortingStrategyFactory.getSortingStrategy(500);
        }
        sortingStrategy.sort(data);
    }
}
