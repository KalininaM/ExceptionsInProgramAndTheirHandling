package HomeWork2;

class DivisionByZeroException extends Exception{
    public DivisionByZeroException() {

        super("Деление на ноль недопустимо");
    }
}
