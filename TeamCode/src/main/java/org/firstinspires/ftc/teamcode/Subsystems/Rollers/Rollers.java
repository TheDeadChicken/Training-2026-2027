public class Rollers extends SubsystemBase {
    private final RollerIO io;
    private final RollerIOInputsAutoLogged inputs = new RollerIOInputsAutologged();

    public Roller(RollerIO io){
        this.io =io;
    }

    public void Periodic() {
        io.updateInputs();
    }

    public Command RollersRunVoltsFast() {
        return run(()-> io.RunVolts(19) );
    }

    public Command RollersStop() {
        return run(()-> io.RunVolts(0));

    }

}
