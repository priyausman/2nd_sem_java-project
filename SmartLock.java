package smartdoorlock;
class SmartLock extends LockSystem {
    BiometricSensor biometric;
    Keypad keypad;
    Motor motor;
    UserDatabase userDB;

    public SmartLock(UserDatabase userDB) {
        this.userDB = userDB;
        biometric = new BiometricSensor();
        keypad = new Keypad();
        motor = new Motor();
    }

    public void loginWithFingerprint(String fingerprint) {
        if (biometric.scanFingerprint(fingerprint) && userDB.isFingerprintValid(fingerprint)) {
            unlockDoor();
            motor.activateMotor(true);
            AutoLockThread auto=new AutoLockThread(this);
            auto.start();
        } else {
            System.out.println("Invalid fingerprint.");
        }
    }

    public void loginWithPIN(String pin) {
        if (keypad.enterPIN(pin) && userDB.isPinValid(pin)) {
            unlockDoor();
            motor.activateMotor(true);
            AutoLockThread auto=new AutoLockThread(this);
            auto.start();
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}