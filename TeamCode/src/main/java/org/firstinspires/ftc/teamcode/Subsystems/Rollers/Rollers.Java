
public class Rollers extends Subsystembase {
    private final RollersIO io;
    private final RollersIOInputsAutoLogged inputs = new RollersIOInputsAutoLogged();

    public Rollers(RollersIO io) {
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
