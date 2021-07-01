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
