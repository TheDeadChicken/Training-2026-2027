package org.firstinspires.ftc.teamcode;

public final class Constants {
    private Constants() {}

    public static final Mode simMode = Mode.SIM;
    public static final Mode currentMode = isRealRobot() ? Mode.REAL : simMode;
    public static final boolean tuningMode = true;

    public static enum Mode {
        /** Running on a real robot (Android Control Hub / phone). */
        REAL,
        /** Running a desktop physics simulator. */
        SIM,
        /** Replaying from a log file. */
        REPLAY
    }

    private static boolean isRealRobot() {
        try {
            // Only exists when running on Android (Control Hub / RC phone)
            Class.forName("android.os.Build");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}