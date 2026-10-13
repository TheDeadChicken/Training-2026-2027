public interface RollersIO {
    @Autolog
    public static class RollersIOInputs{
        public double volts; 

    }
    
    public default void UpdateInputs(){}

    public default void RunVolts(){}

}  
