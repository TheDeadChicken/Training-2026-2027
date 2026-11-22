public interface RollerIO {

    @AutoLog
    public static class RollerIOInputs {
        public double leftVolts;
        public double rightVolts;
    }

    public default void UpdateInputs() {}

    public default void RunVolts() {}
}
