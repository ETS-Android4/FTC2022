package org.firstinspires.ftc.teamcode.testingOpModes.tested.dec21;
/** TODO
 *
 *  Test this new way for controlling the robot
 *   if wrong, delete robotControl function from driveComponents
 *
 *
 *
 *     SUCCESFULY
 * */
/*
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robotComponents.driveComponents;
import org.firstinspires.ftc.teamcode.utilities.driveUtilities.encoderUsing;
import org.firstinspires.ftc.teamcode.utilities.driveUtilities.powerBehavior;
import org.firstinspires.ftc.teamcode.utilities.driveUtilities.robotDirection;


@TeleOp(name = "drivingTest", group = "testing")
public class test1 extends LinearOpMode {

    driveComponents drive = new driveComponents();
    @Override
    public void runOpMode() throws InterruptedException {

        drive.driveInitialization(hardwareMap, robotDirection.ROBOT_DIRECTIONS.FORWARD, powerBehavior.ROBOT_BREAKING.BRAKE, encoderUsing.ENCODER_RUNNING_MODE.RUN_WITHOUT);

        waitForStart();
        while(opModeIsActive() && !isStopRequested()){
            drive.robotControl(this.gamepad1.left_stick_x,this.gamepad1.left_stick_y, this.gamepad1.right_stick_x);
        }
    }
}
*/