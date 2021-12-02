public class RobotConnectionException extends RuntimeException {

    //любой метод RobotConnectionManager и RobotConnection может бросить
    // непроверяемое исключение RobotConnectionException

    public RobotConnectionException(String message) {
        super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
