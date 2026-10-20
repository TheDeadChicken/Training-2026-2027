
public class Drive extends Subsystembase {
    private final DriveIO io;
    private final DriveIOInputsAutoLogged inputs = new DriveIOInputsAutoLogged();

    public Drive(DriveIO io) {
        this.io = io;
    }
    
    public void Periodic() {
        io.UpdateInputs(inputs);
    }

    public Command RunVoltsFast() {
        return run(()-> io.RunVolts(19));
    }

    public Command RunNoVolts() {
        return run(()-> io.RunVolts(0));
    }
}