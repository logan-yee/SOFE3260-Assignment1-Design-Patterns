package smarthome;

public abstract class AbstractBulb extends AbstractDevice implements Bulb {
    @Override public int getPowerWatts() { return getUsage(); }
    @Override public void turnOn()  { System.out.println(getClass().getSimpleName() + " ON"); }
    @Override public void turnOff() { System.out.println(getClass().getSimpleName() + " OFF"); }
}
