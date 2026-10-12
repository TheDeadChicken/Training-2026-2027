public interface FlywheelsIO {
    @AutoLog
    public static class FlywheelsIOInputs {
        public double topFlywheelVolts;
        public double bottemFlywheelVolts;
    }

    public default void UpdateInputs(FlywheelsIOInputs inputs) {}

    public default void RunVolts(double volts) {}
}
