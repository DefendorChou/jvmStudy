package jvm.classloader;

/*
  对于静态字段来说，只有直接定义了改字段的类才会被初始化
  当一个类在初始化时，要求其弗雷全部都已经初始化完毕了。
 */
public class MyTest {

    //主动使用和被动使用的差别
    public static void main(String[] args){
        System.out.println(MyChlids.str2);

    }

}

class MyParent1{

    public static String str = "Hello World";

    static {
        System.out.println("MyParent1 is block");
    }
}

class MyChlids extends  MyParent1{

    public static String str2 = "Welcome";
    static {
        System.out.println("MyChilds is block");
    }
}