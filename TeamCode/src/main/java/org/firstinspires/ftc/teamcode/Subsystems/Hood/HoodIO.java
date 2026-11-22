public interface HoodIO {
    @AutoLog
    public static class HoodIOInputs{
        public double hoodPosition;
    }

    public default void UpdateInputs() {}

    public default void SetHoodPosition(double position) {}
}
