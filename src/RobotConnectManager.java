import java.util.Random;

public class RobotConnectManager implements RobotConnectionManager {
    Random random = new Random();
    @Override
    public RobotConnect getConnection() {
        RobotConnect robotConnect = null;
        boolean isConnect = random.nextBoolean();
        if (!isConnect) {
            System.out.println("Нет соединения"); // for debug
            throw new RobotConnectionException("Нельзя подключиться");
        } else {
            System.out.println("Связь установлена"); // for debug
            robotConnect = new RobotConnect();
        }
        return robotConnect;
    }
}