public interface DriveIO {

    @AutoLog
    public class DriveIOInputs {
        double frontRightVolts;
        double frontLeftVolts;
        double backRightVolts;
        double backLeftVolts;
    }

    public default void UpdateInputs() {}

    public default void RunVolts() {}
    
}