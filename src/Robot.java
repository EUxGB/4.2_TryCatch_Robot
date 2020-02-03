public class Robot implements RobotConnection, RobotConnectionManager  {
    int x;
    int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRobotTo(int x, int y) {
    }

    @Override
    public void close() {
    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        this.toX;
        try {


                RobotConnection.moveRobotTo(toX, toY);
                RobotConnection.close();


            }

        } catch (RobotConnectionException e1) {
        RobotConnection.moveRobotTo(this.toX, x);
        RobotConnection.close();

            // your implementation here
        }
        catch (RobotConnectionException e2) {
        RobotConnection.moveRobotTo(this.toX, x);
        RobotConnection.close();

        throw new RobotConnectionException("No connected");
        // your implementation here
    }

        catch (Exception e3){
            throw new RobotConnectionException("ERROR 404",e3);

        }


        finally {
            RobotConnection.close();
        }

    }


}
