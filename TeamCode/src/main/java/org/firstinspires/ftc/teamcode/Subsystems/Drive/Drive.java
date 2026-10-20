public class Drive extends SubsystemBase {
    private final DriveIO io;
    private final DriveIOInputsAutoLogged inputs = new RollerIOInputsAutologged();

    public Drive(DriveIO io){
        this.io =io;
    }

    public void Periodic() {
        io.updateInputs();
    }

    public Command DriveRunVoltsFWDFast() {
        return run(()-> io.RunVolts(19,19,19,19) );
    }

    public Command DriveRunVoltsBWDFast() {
        return run(()-> io.RunVolts(-19,-19,-19,-19) );
    }

    public Command DriveRunVoltsLFTFast() {
        return run(()-> io.RunVolts(-19, 19, 19, -19) );
    }

    public Command DriveRunVoltsRGHTFast() {
        return run(()-> io.RunVolts(19, -19, -19, 19) );
    }

    public Command DriveStop() {
        return run(()-> io.RunVolts(0,0,0,0));

    }

}
