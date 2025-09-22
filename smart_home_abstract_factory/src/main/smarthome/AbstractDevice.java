package smarthome;

/* Common base; Factory Method exists here. */
public abstract class AbstractDevice {
    private int usage; // watts for bulbs, mAh for locks

    public int getUsage() {
        return usage;
    }

    /* Template: load usage after creation. */
    public final void initUsage(String key) {
        this.usage = makeUsageReader().read(key);
    }

    /* Factory Method: subclasses decide which reader/config to use. */
    protected abstract UsageReader makeUsageReader();
}
