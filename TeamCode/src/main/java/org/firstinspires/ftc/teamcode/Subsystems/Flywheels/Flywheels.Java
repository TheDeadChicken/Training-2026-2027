public class Flywheels extends SubsystemBase {
    private final FlywheelsIO io;
    private final FlywheelsIOInputsAutoLogged inputs = new FlywheelsIOInputsAutoLogged();

    public Flywheels(FlywheelsIO io) {
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