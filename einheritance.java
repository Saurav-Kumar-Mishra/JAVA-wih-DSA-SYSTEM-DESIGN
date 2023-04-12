
class a{
    void callme()
    {
        System.out.print("Inside A class");
    }
}
    class b extends a
    {
        void callme()
        {
            System.out.println("Inside B class");
        }
    }
    class c extends b
    {
        void callme()
        {
            System.out.println("Inside C class");

        }
    }
        public class einheritance 
        {
            public static void main(String[] args)
            {
                a p=new a();
               p=new b();
               p=new c();
              p.callme();
            //   q.callme();
            }
        }
