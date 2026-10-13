public class Drive extends Subsystem {
    private final DriveIO io;
    private final DriveIOInputsAutoLogged inputs = new DriveIOInputsAutoLogged();

    public Drive(DriveIO io) {
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

    public Command drive(double rotational, double forward, double horizontal){
        return run(()-> {
            double frontLeft = forward + rotational + horizontal;
            double frontRight = forward - rotational - horizontal;
            double backLeft = forward + rotational - horizontal;
            double backRight = forward - rotational + horizontal;

           
        });
    }

}