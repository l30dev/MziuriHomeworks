package Summary;

public class Implementer implements interface1,interface2 {
    @Override
    public void sayHello() {
        System.out.println("Hello from the class implementer");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye from the class implementer");
    }

    @Override
    public void Jump() {
        System.out.println("Jump from the class implementer");
    }

    @Override
    public void Run() {
        System.out.println("Run from the class implementer");
    }
}
