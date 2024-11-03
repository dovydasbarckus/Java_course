
class A
{
    public void show()
    {
        System.out.println("in a show");
    }
}

class B extends A{

    @Override
    public void show()
    {
        System.out.println("in b show");
    }
}

abstract class C
{
    public abstract void show();
}

class D{

    public void show(){
        System.out.println("in D show");
    }

    class De{
        public void show(){
            System.out.println("in DE show");
        }
    }

    static class DEStatic{
        public void show(){
            System.out.println("in DEStatic class show");
        }
    }

}

public class TestingInterfaces
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        A obj1 = new B();
        obj1.show();

        A obj2 = new A(){
            @Override
            public void show()
            {
                System.out.println("in a line obj2 show");
            };
        };
        obj2.show();

        C obj3 = new C(){
            @Override
            public void show()
            {
                System.out.println("in a line obj3 show");
            };
        };
        obj3.show();

        D obj4 = new D();
        obj4.show();
        D.De obj5 = obj4.new De();
        obj5.show();

        D.DEStatic obj6 = new D.DEStatic();
        obj6.show();
    }
}
