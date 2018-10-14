package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.stateMachine.StateBase;
import org.firstinspires.ftc.teamcode.stateMachine.StateMachine;

public class State2 extends StateBase {
    private final DcMotor leftDrive;
    private final DcMotor rightDrive;
    State2(StateMachine stateMachine) {
        super(stateMachine);
        leftDrive  = hardwareMap.get(DcMotor.class, "motor_2");
        rightDrive  = hardwareMap.get(DcMotor.class, "motor_1");
    }

    @Override
    public void timeUpdate(double sinceOpModePlay, double sinceStateStart) {
        if (sinceStateStart > 1.5) {
            stateMachine.updateState(State3.class);
        }
        addTelemetry("Time", "%f %f", sinceOpModePlay, sinceStateStart);
    }

    @Override
    public void postEventsCallback() {
        // test change.
        leftDrive.setPower(0.0);
        rightDrive.setPower(-0.5);
        addTelemetry("Motor", "Driving forward");
    }
}

