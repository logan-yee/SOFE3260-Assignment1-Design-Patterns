package smarthome;

public class BulbA extends AbstractBulb {
    @Override protected UsageReader makeUsageReader() {
        return new FileUsageReader("data/brandA.txt");
    }
}
