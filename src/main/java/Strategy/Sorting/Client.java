package Strategy.Sorting;

public class Client {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor(null);

        int[] data = new int[]{1,5,6,2};

        dataProcessor.processData(data);
    }
}
