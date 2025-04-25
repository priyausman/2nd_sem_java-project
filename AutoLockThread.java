package smartdoorlock;
class AutoLockThread extends Thread {
    private SmartLock lockRef;

    public AutoLockThread(SmartLock lockRef) {
        this.lockRef = lockRef;
    }

    public void run() {
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            System.out.println("⚠️ Auto-lock thread interrupted.");
        }
        lockRef.lockDoor();
        lockRef.motor.activateMotor(false);
    }
}
