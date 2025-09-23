package smarthome;

public interface SmartDeviceFactory {
    Bulb createBulb();
    Lock createLock();
}