class Robot {
    public static void main(String[] args) {
        new Robot().test();
    }

    void test() {
        RobotConnectManager robotConnectManager = new RobotConnectManager();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " попытка");
            moveRobot(robotConnectManager, i, 3);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        RobotConnection robotConnection = null;
        boolean isError = false;
        for (int i = 0; i < 3; i++) {
            try {
                isError = false;
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
            } catch (RobotConnectionException ignored) {
                isError = true;
            } catch (Exception e) {
                isError = true;
                throw e;
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException ignored) {

                    }
                    if (!isError) {
                        break;
                    }
                }
            }
        }
        if (isError) {
            throw new RobotConnectionException("ошибка при подключении");
        }

    }
}