public class IntakePivot extends SubsystemBase{
    private final IntakePivotIO io;
    private final IntakePivotIOInputsAutoLogged inputs = new IntakePivotIOInputsAutoLogged();
    
    public IntakePivot(IntakePivotIO io){
        this.io = io;
    }

    public void Periodic(){
        io.UpdateInputs(inputs);
    }

    public Command SetPivotPositionHigh(){
        return run(() -> io.SetPivotPosition(0));
    }
    public Command SetPivotPositionLow(){
        return run(() -> io.SetPivotPosition(1));
    }

}
