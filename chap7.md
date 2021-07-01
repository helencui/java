##chapter7

#### Person 类
```{java}
//Person 类
class Person
{
    String name;
    int age;
    void talk();
    {
        System.out.println("我是："+name+",今年："+age+"岁");
    }

    void setName(String name)
    {
        this.name=name;
    }

    void setAge(int age)
    {
        this.age=age;
    }
}

```
##### 本例的程序由于没有main() 所以无法运营