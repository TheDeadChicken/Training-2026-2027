public interface FlywheelsIO {
    @AutoLog

    public static class FlywheelsIOInputs {
        public double frontVolts;
        public double backVolts;
    }

    public default void UpdateInputs(FlywheelsIOInputs inputs) {}

    public default void RunVolts(double frontVolts, double backVolts) {}
}