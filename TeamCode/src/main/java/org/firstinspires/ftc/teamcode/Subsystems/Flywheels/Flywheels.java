public class Flywheels extends Subsytems {
    private final FlywheelIO io;
    private final FlywheelsIOInputsAutoLogged inputs = new FlywheelsIOInputsAutoLogged();

    public Flywheels(FlywheelsIO io) {
        this.io = io;
    }

    public void Periodic() {
        io.updateInputs(inputs);
    }

    public Command runVoltsFast(){
        return run(()-> io.RunVolts(19));
    }

    public Command runNoVolts(){
        return run(()-> io.RunVolts(0));
    }
}