public interface IntakePivotIO {
    @AutoLog
    public static class IntakePivotIOInputs{
        public double pivotPosition;
        public double pivotDown;
        public double pivotUp;
    }

    public default void UpdatePivot() {}

    public default void RunPivotPosition() {}


}
