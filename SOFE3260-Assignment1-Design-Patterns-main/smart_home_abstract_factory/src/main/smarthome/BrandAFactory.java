package smarthome;

public class BrandAFactory implements SmartDeviceFactory {
    @Override public Bulb createBulb() {
        BulbA bulb = new BulbA();
        bulb.initUsage("BulbA");   // post-creation load
        return bulb;
    }

    @Override public Lock createLock() {
        LockA lock = new LockA();
        lock.initUsage("LockA");   // post-creation load
        return lock;
    }
}
