package com.xw.spring.framework.ioc.reflect;

/**
 * classLoader����Ѱ������ֽ����ļ��������������jvm�ڲ���ʾ�Ķ����������Ҫ�����¼�����
 * 1.װ�أ����Һ͵���class�ֽ��ļ�
 * 2.���ӣ�ִ��У�顢׼�����������裬���н��������ǿ�ѡ��
 *   2.1 У�飺���װ�ص�class�ļ�����ȷ�ԣ�
 *   2.2 ׼��������̬��������洢�ռ䣻
 *   2.3 �������ѷ�������תΪֱ�����á�
 * 3.��ʼ��������ľ�̬��������̬�����ĳ�ʼ��������
 * <p>
 * 
 * ���ࣺ
 * 1.��װ������c++��д������װ�غ���lib����λ��$JAVA_HOME/jre/lib�£��磺rt.jar�ȣ�
 * 2.ExtClassLoaderװ����������װ��ext����λ��$JAVA_HOME/jre/lib/ext�£�
 * 3.AppClassLoaderװ����������װ��Classpath·���µ����������װ��Ӧ�á�
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
