public interface RollerIO {

    @AutoLog
    public static class RollerIOInputs {
        public double volts;
    }

    public default void UpdateInputs() {}

    public default void RunVolts() {}
}
