public class Roller extends Subsystems {

    private final RollerIO io;
    private final RollerIOInputsAutoLogged inputs = new RollerIOInputsAutoLogged();

    public Roller(RollerIO io) {
        this.io = io;

    }

    public void Periodic() {
        io.UpdateInputs(inputs);

    }

    public Command RunVoltsFast() {
        return run(() -> io.RunVolts(19));

    }

    public Command RunNoVolts() {
        return run(() -> io.RunVolts(0));

    }

}