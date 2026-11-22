public class IntakePivot extends SubsystemBase{
    private final IntakePivotIO io;
    private final IntakePivotIOInputsAutoLogged inputs = new IntakePivotIOInputsAutoLogged();
    double targetPosition = highPivotPosition;
    
    public IntakePivot(IntakePivotIO io){
        this.io = io;
    }

    public void Periodic(){
        io.UpdateInputs(inputs);
    }

    public Command SetPivotPositionHigh(){
        return run(() -> io.SetPivotPosition(highPosition));
        targetPosition = highPosition;

    }
    public Command SetPivotPositionLow(){
        return run(() -> io.SetPivotPosition(lowPosition));
        targetPosition = lowPosition;
    }

    public Command HoldIntakePivotPosition(){
        return run(() -> io.SetPivotPosition(targetPosition));
    }
}
