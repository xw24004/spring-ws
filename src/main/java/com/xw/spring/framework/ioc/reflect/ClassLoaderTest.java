package com.xw.spring.framework.ioc.reflect;

/**
 * classLoader就是寻找类的字节码文件，并构造出类在jvm内部表示的对象组件。主要分以下几步：
 * 1.装载：查找和导入class字节文件
 * 2.链接：执行校验、准备、解析步骤，其中解析步骤是可选的
 *   2.1 校验：检查装载的class文件的正确性；
 *   2.2 准备：给静态变量分配存储空间；
 *   2.3 解析：把符号引用转为直接引用。
 * 3.初始化：对类的静态变量、静态代码块的初始化工作。
 * <p>
 * 
 * 分类：
 * 1.根装载器：c++编写，用来装载核心lib包，位于$JAVA_HOME/jre/lib下，如：rt.jar等；
 * 2.ExtClassLoader装载器：用来装载ext包，位于$JAVA_HOME/jre/lib/ext下；
 * 3.AppClassLoader装载器：负责装载Classpath路径下的类包，用来装载应用。
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
