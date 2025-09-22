package smarthome;

public class LockA extends AbstractLock {
    @Override protected UsageReader makeUsageReader() {
        return new FileUsageReader("data/brandA.txt");
    }
}
