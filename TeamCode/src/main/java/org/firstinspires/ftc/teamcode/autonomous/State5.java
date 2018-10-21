package org.firstinspires.ftc.teamcode.autonomous;

import org.firstinspires.ftc.teamcode.stateMachine.DrivingState;
import org.firstinspires.ftc.teamcode.stateMachine.StateMachine;

class State5  extends DrivingState {
    State5(StateMachine stateMachine) {
        super(stateMachine,
                2.,
                State6.class,
                -0.5,
                0.5);
    }
}
