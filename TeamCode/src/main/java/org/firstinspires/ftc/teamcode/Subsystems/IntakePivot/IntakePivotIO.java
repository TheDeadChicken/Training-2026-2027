public interface IntakePivotIO {
    @AutoLog
    public static class IntakePivotIOInputs{
        public double pivotPosition;
    }

    public default void UpdateInputs() {}

    public default void SetPivotPosition(double position) {}


}
