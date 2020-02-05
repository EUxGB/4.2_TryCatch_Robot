public class Robot implements RobotConnection, RobotConnectionManager {
    int x;
    int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        int ping = 1;
        RobotConnection connection = null;

        while (ping <= 3) {

            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                break;

            } catch (RobotConnectionException err) {
                if (ping == 3) {
                    throw new RobotConnectionException("ERROR 404", err);
                }
                ping++;

            } finally {

                try {
                    connection.close();
                } catch (Throwable err) {   }

            }
        }

    }


    @Override
    public void moveRobotTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void close() {
    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}


