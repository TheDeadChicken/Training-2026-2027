public interface IntakePivotIO {
    @AutoLog
    public static class IntakePivotIOInputs{
        public double pivotPosition;
    }

    public default void UpdatePivot() {}

    public default void RunPivotPosition() {}


}
