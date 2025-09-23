package smarthome;

public class TestRunner {
    private static int passed = 0, failed = 0;

    private static void assertEquals(String name, int expected, int actual) {
        if (expected == actual) {
            System.out.println("[PASS] " + name + " -> " + expected);
            passed++;
        } else {
            System.out.println("[FAIL] " + name + " -> expected=" + expected + " actual=" + actual);
            failed++;
        }
    }

    static class TestBulbA extends BulbA {
        @Override protected UsageReader makeUsageReader() {
            return new FileUsageReader("smart_home_abstract_factory/testdata/brandA.txt");
        }
    }
    static class TestLockB extends LockB {
        @Override protected UsageReader makeUsageReader() {
            return new FileUsageReader("smart_home_abstract_factory/testdata/brandB.txt");
        }
    }

    public static void main(String[] args) {
        System.out.println("Running manual tests...\n");

        TestBulbA bulb = new TestBulbA();
        bulb.initUsage("BulbA");
        bulb.turnOn();
        bulb.turnOff();
        assertEquals("BulbA watts", 60, bulb.getPowerWatts());

        TestLockB lock = new TestLockB();
        lock.initUsage("LockB");
        lock.lock();
        lock.unlock();
        assertEquals("LockB battery (mAh)", 2500, lock.getBattery_mAh());

        System.out.println("\nSummary: " + passed + " passed, " + failed + " failed");
        if (failed > 0) System.exit(1);
    }
}
