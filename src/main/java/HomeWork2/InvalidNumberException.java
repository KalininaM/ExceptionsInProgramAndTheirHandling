package HomeWork2;

class InvalidNumberException extends Exception{
    public InvalidNumberException(Integer numb) {
        super(numb + " - " + "некорректное число");
    }
}
