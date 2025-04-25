package smartdoorlock;
class UserDatabase {
    public boolean isFingerprintValid(String fingerprint) {
        return fingerprint.equalsIgnoreCase("Aayat") || fingerprint.equalsIgnoreCase("Manaahil");
    }
public boolean isPinValid(String pin) {
        return pin.equals("1234");
    }
}

