package smarthome;

public class BrandBFactory implements SmartDeviceFactory {
    @Override public Bulb createBulb() {
        BulbB bulb = new BulbB();
        bulb.initUsage("BulbB");   // post-creation load
        return bulb;
    }

    @Override public Lock createLock() {
        LockB lock = new LockB();
        lock.initUsage("LockB");   // post-creation load
        return lock;
    }
}
