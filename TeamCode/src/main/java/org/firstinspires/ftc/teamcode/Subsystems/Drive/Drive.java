public class Drive {
    private final DriveIO io;
    private final DriveIOInputsAutoLogged inputs = new DriveIOInputsAutoLogged();

    public Drive(DriveIO io) {
        this.io = io;
    }

    public void Periodic() {
        io.UpdateInputs(inputs);
    }

    public Command Drive(double forward, double right, double straif) {
        return run(io.RunVolts(
            forward + right + straif, 
            forward - right - straif,
            forward + right - straif,
            forward - right + straif
        ));

    }
}
