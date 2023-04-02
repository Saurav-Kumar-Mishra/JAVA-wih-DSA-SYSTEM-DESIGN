// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface a
{
    void show();
}
 abstract class b implements a
{
 public abstract void dis();
 public void show()
 {
    System.out.println("hello");
 }
  
}
class interface3 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        a o=new b();
        o.show();
    }
}