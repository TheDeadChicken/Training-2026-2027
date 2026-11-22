public class Flywheels extends Subsytems {
    private final FlywheelIO io;
    private final FlywheelsIOInputsAutoLogged inputs = new FlywheelsIOInputsAutoLogged();

    public Flywheels(FlywheelsIO io) {
        this.io = io;
    }

    public void Periodic() {
        io.updateInputs(inputs);
    }

    // For now rename to RunFlywheels and use a constant instead of the magic number  
    public Command runVoltsFast(){
        return run(()-> io.RunVolts(19, 19));
    }

    public Command stopFlywheels(){
        return run(()-> io.RunVolts(0, 0));
    }
}