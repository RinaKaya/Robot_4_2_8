public interface RobotConnectionManager {

    //отвечает за установку соединения

    //Метод getConnection() делает попытку соединиться с роботом и возвращает установленное соединение,
    // через которое можно отдавать роботу команды.
    RobotConnection getConnection();
}
