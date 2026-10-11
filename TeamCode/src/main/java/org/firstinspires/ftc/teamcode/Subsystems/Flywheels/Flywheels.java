public class Flywheels extends Subsystem {
    private final FlywheelsIO io;
    private final FlywheelsIOInputsAutoLogged inputs = new FlywheelsIOInputsAutoLogged();

    public Flywheels(FlywheelsIO io) {
        this.io = io;
    }

    public void Periodic(){
        io.UpdateInputs(inputs);
    }

    public Command runVoltsFast() {
       return run(()-> io.RunVolts(19)); 
    }

    public Command runNoVolts(){
        return run(()-> io.RunVolts(0));
    }

}