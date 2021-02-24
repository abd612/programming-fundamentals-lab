class Base {
public void Print() {
System.out.println("Base");
}
}
class Derived extends Base {
public void Print() {
System.out.println("Derived");
}
}
class Main{
public static void main(String[] args) {
Base x = new Base();
Base y = new Derived();
Derived z = new Derived();
x.Print();
y.Print();
z.Print();
}
}