public interface DriveIOSIM {

    @AutoLog
    public static class DriveIOSIMInputs {
        public double FrontLeftVolts;
        public double FrontRightVolts;
        public double BackLeftVolts;
        public double BackRightVolts;
    }

    public default void UpdateInputs(DriveIOInputs inputs) {}

    public default void RunVolts(double leftVolts, double rightVolts) {}
}