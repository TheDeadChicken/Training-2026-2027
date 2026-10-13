public interface DriveIO {
    
    @AutoLog
    public static class DriveIOInputs {
       public double frontLeftVolte;
        public double frontRightVolts;
        public double backLeftVolts;
        public double backRightVolts;
    }

    public default void UpdateInputs(DriveIOInputs inputs) {}

    public default void RunVolts(double volts){}
}