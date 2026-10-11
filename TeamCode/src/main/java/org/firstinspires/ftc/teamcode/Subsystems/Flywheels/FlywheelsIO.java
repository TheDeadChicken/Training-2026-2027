public interface FlywheelsIO {
    @AutoLog
    
    public static class FlywheelsIOInputs {
        public double upperVolts;
        public double lowerVolts;
    }

    public default void UpdateInputs(FlywheelsIOInputs inputs) {}
    
    public default void RunVolts(double upperVolts, double lowerVolts) {}
}