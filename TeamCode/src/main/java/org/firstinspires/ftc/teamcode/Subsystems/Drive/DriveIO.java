public interface DriveIO {
    @Autolog
    public static class DriveIOInputs{
        public double voltsFL;
        public double voltsFR;
        public double voltsBL;
        public double voltsBR;
    }
    
    public default void UpdateInputs(){}

    public default void RunVolts(){}

}  
