package oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error active: " + this.active);
        System.out.println("Error status: " + this.status);
        System.out.println("Error message: " + this.message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 10, "Output error");
        Error error3 = new Error(true, 20, "Input error");
        Error error4 = new Error(false, 30, "Undefined");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
        error4.printInfo();
    }
}
