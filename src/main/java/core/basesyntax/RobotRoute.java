package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceToXway = toX - robot.getX();
        int distanceToYway = toY - robot.getY();

        if (distanceToXway > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < distanceToXway; i++) {
                robot.stepForward();
            }
        } else if (distanceToXway < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = 0; i < -distanceToXway; i++) {
                robot.stepForward();
            }
        }

        if (distanceToYway > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = 0; i < distanceToYway; i++) {
                robot.stepForward();
            }
        } else if (distanceToYway < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = 0; i < - distanceToYway; i++) {
                robot.stepForward();
            }
        }
    }
}
