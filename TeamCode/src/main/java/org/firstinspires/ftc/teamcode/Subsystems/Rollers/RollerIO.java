public interface RollerIO {

    @AutoLog
    public static class RollerIOInputs {
        public double volts;
    }

    public default void UpdateInputs(RollerIOInputs inputs) {}

    public default void RunVolts(double volts) {}
}
