interface One{
    public void print_geek();
}
interface  Two{
    public void print_for();
}
interface  Three extends One,Two{
    public void  print_geek();
}
class Child implements Three{
    @Override
    public void print_geek() {
        System.out.println("geek");
    }

    @Override
    public void print_for() {
        System.out.println("for");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
       Child c = new Child();
       c.print_geek();
       c.print_for();
       c.print_geek();
    }
}
