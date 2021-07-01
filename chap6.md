#Chanpter6

## 类的定义使用 

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

### 类的组成使用
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

### 类的属性组使用
```{java}
//类的属性组使用
public class usingAttribute {
   static String str1="string-1";
   static String str2;

   String str3="string-3";
   String str4;

   //static 语句块用于初始化static成员变量，是最先运行的语句块
   static 
   {
       printStatic("before static");
       str2="string-2";
       printStatic("after static");

   }
   //输出静态成员变量
   public static void printStatic(String title)
   {
       System.out.println("--------"+title+"-------");
       System.out.println("str1=\""+str1+"\"");
       System.out.println("str2=\""+str2+"\"");
   }
   //打印一次属性，然后改变d属性，最后再打印一次
   public usingAttribute()
   {
       print("before constructor");
       str4="string-4";
       print("after constructor");
   }

   //打印所有属性，包括静态成员
   public void print(String title)
   {
    System.out.println("--------"+title+"-------");
    System.out.println("str1=\""+str1+"\"");
    System.out.println("str2=\""+str2+"\"");
    System.out.println("str3=\""+str3+"\"");
    System.out.println("str4=\""+str4+"\"");
   }

   public static void main(String[] args)
   {
       System.out.println();
       System.out.println("--------创建usingAttribute对象-------");
       System.out.println();
       new usingAttribute();

   }
    
}

```

### 使用Person类的对象调用类中的属性和方法的过程
```{java}
//下面这个范例说明了使用Person类的对象调用类中的属性和方法的过程
public class objectDemo 
{
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
```

### 创建匿名对象
```{java}
public class NoNameObject {
    public void say()
    {
        System.out.println("我不想学java");
    }
    
    public static void main(String[] args)
    {
        //这是匿名对象，没有被其他对象所引用
        new NoNameObject().say();
    }
}

```


