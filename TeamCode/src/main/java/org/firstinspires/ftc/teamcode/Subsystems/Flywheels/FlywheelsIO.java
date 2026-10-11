public interface FlywheelsIO {
    @AutoLog
    public static class FlywheelsIOInputs{
        public double upvolts;
        public double lowvolts;
    }

    public default void UpdateInputs(FlywheelsIOInputs inputs) {}

    public default void RunVolts(double upvolts, double lowvolts) {}









}