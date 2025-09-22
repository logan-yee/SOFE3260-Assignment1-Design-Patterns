package smarthome;

public class BulbB extends AbstractBulb {
    @Override protected  UsageReader makeUsageReader() {
        return new FileUsageReader(data/brandB.txt);
    }
}