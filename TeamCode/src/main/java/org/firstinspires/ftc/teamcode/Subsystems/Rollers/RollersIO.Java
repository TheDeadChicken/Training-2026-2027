public interface RollersIO {

    @AutoLog
    public static class RollersIOInputs {
        public double volts;   
    }

    public default void UpdateInputs(RollersIOInputs inputs) {}

    public default void RunVolts(double volts) {}
}