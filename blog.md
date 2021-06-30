## script 

```{java}
class ColorDefine {
    String color="黑色";
    void getMes() 
    {
        System.out.println("定义类");
    }

    public static void main(String args[])
    {
        ColorDefine b=new ColorDefine();
        System.out.println(b.color);
        b.getMes();
    } 
}
``` 

```{java}
class Person
{
    String name;
    int age;
    void talk()
    {
        System.out.println("我是："+name+",今年："+age+"岁");
    }
}
```