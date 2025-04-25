package smartdoorlock;
class Motor {
    public void activateMotor(boolean open) {
        if (open) {
            System.out.println("🔄 Motor : UNLOCKING DOOR...");
        } else {
            System.out.println("🔄 Motor : LOCKING DOOr...");
        }
    }
}
