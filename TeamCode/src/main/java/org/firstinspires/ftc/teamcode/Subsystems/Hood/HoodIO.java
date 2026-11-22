public interface HoodIO {
    @AutoLog
    public static class HoodIOInputs{
        public double HoodPosition;
    }

    public default void UpdateInputs() {}

    public default void SetHoodPosition(double position) {}
}
