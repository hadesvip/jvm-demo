package com.jvm.demo.classloader;

/**
 * 对静态字段来说,只有直接定义了该字段的类才会初始化 当一个类在初始化时,要求其父类去全部加载完毕
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印出来
 * -XX:<option> 表示关闭option选项
 * +XX:<option> 表示开始option选项
 * -XX:<option>=<value> 表示option选项值设置为value
 */
public class MyTest1 {

  public static void main(String[] args) {
//    System.out.println(MyChild1.str);
    System.out.println(MyChild1.str2);
  }
}

class MyParent1 {

  public static String str = "hello,world";

  static {
    System.out.println("myParent1 static block");
  }
}


class MyChild1 extends MyParent1 {

  public static String str2 = "welcome";

  static {
    System.out.println("myChild1 static block");
  }

}
