public class ObjectDemo {
    public static void main(String[] args)
    {
        Person p1=new Person();
        p1.name="崔崔";
        p1.age=25;
        p1.talk();
    }
}

class Person
{
    String name;
    int age;
    void talk()
    {
        System.out.println("我是："+name+",今年："+age+"岁");
    }
}
