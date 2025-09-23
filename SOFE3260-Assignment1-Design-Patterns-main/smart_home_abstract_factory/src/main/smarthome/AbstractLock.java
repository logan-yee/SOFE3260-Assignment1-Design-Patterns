package smarthome;

public abstract class AbstractLock extends AbstractDevice implements Lock {
    @Override public int getBattery_mAh() { return getUsage(); }
    @Override public void lock()   { System.out.println(getClass().getSimpleName() + " LOCKED"); }
    @Override public void unlock() { System.out.println(getClass().getSimpleName() + " UNLOCKED"); }
}
