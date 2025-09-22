package smarthome;

public class LockB extends AbstractLock {
    @Override protected UsageReader makeUsageReader() {
        return new FileUsageReader("data/brandB.txt");
    }
}
