package com.jvm.demo.classloader;

/**
 * 常量在编译阶段会存入到调用这个常量的方法所在类的常量池中
 * 本质上,调用类并没有直接引用定义常量的类,因此并不会出发定义常量类的初始化
 *
 javap -c out.production.classes.com.jvm.demo.classloader.MyTest2
 Warning: Binary file out.production.classes.com.jvm.demo.classloader.MyTest2 contains com.jvm.demo.classloader.MyTest2
 Compiled from "MyTest2.java"
 public class com.jvm.demo.classloader.MyTest2 {
 public com.jvm.demo.classloader.MyTest2();
 Code:
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return

 public static void main(java.lang.String[]);
 Code:
 0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 3: ldc           #4                  // String hello,world
 5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 8: return
 }

 *
 * 助记符:
 * ldc 表示将int,float,string类型的常量值从常量池中推送到栈顶;
 * bipush 将单字节(-128,127)的常量值推送到栈顶;
 * sipush 将一个短整型常量值(-32768-32767) 推送到栈顶
 * iconst_1 将int类型的1 推送到栈顶(iconst_1~iconst_5)
 * ldc2_w 将long或double型常量值从常量池中推送至栈顶
 *
 * @author wangyong
 */
public class MyTest2 {

  public static void main(String[] args) {
    System.out.println(MyParent2.str);
  }
}


class MyParent2 {

//  public static final String str = "hello,world";
  public static final long str  = 1324321432;

  static {

    System.out.println("MyParent2 static block");
  }
}
