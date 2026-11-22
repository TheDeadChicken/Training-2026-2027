public class Hood extends SubsystemBase {
    private final HoodIO io;
    private final HoodIOInputsAutoLogged inputs = new HoodIOInputsAutoLogged();
    double targetHoodPosition = startHoodPosition;
    
    public Hood(HoodIO io){
        this.io = io;
    }

    public void Periodic(){
        io.UpdateInputs(inputs);
    }

    public Command SetHoodPosition(double position){
        return run(() -> io.SetHoodPosition(position));
        targetHoodPosition = position;

    }


    public Command HoldHoodPosition(){
        return run(() -> io.SetHoodPosition(targetHoodPosition));
    }
}
