public class Flywheels extends SubsystemBase{
    private final FlywheelsIO io;
    private final FlywheelsIO.FlywheelsIOInputsAutoLogged inputs = new FlywheelsIOInputsAutoLogged();

    public Flywheels(FlywheelsIO io) {
        this.io = io;
    }

    

}
