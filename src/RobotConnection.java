public interface RobotConnection extends AutoCloseable {
    //Подключение к роботу представляется в программе интерфейсом RobotConnection

    //команда на перемещение в заданную точку
    //роботу больше не нужны пошаговые инструкции
    void moveRobotTo(int x, int y);


    //RobotConnection - это временно устанавливаемое соединение,
    // которое надо закрывать, когда оно больше не нужно.
    // Для закрытия соединения в интерфейсе есть метод close().
    @Override
    void close();
}
