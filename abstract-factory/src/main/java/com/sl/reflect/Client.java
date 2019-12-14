package com.sl.reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/15 23:08
 */
public class Client {

    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("com.sl.reflect.Student");
        /*System.out.println(aClass);

        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();

        Class classes = Student.class.getClass();

        Class<?> aClass2 = ClassLoader.getSystemClassLoader().loadClass("com.sl.reflect.Student");
        System.out.println(aClass2);

        Class<? extends Class> aClass3 = SmallStudent.class.getClass();*/

       /* //1、获取系统类的加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //2. 获取系统类加载器的父类加载器（扩展类加载器，可以获取）.
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        //3. 获取扩展类加载器的父类加载器（引导类加载器，不可获取）.
        classLoader = classLoader.getParent();
        System.out.println(classLoader);*/

        //文件夹在src下
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("text1.txt");
        //文件夹在包名下
        InputStream resourceAsStream1 = ClassLoader.getSystemClassLoader().getResourceAsStream("com/sl/reflect/text2.txt");
        //testMethod();
        //testField();
        testAnnotation();
    }

    public static void testAnn() {
        Student student = new Student();
        student.setAge(30);
    }

    public static void testAnnotation() throws Exception{
        Class<?> aClass = Class.forName("com.sl.reflect.Student");
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("setAge", Integer.class);
        int val = 6;
        AgeValidator annotation = method.getAnnotation(AgeValidator.class);
        if (annotation != null) {
            if (annotation instanceof AgeValidator) {
               AgeValidator ageValidator =  annotation;
               if (val < ageValidator.min() || val > ageValidator.max()) {
                   throw new RuntimeException("年龄非法");
               }
            }
        }
        method.invoke(o,20);
        System.out.println(o);
    }

    public static void testMethod() throws Exception {
        Class<Student> aClass = (Class<Student>) Class.forName("com.sl.reflect.Student");
        //1.获取方法
        // 获取取clazz对应类中的所有方法--方法数组（一）
        // 不能获取private方法,并且获取从父类继承来的所有方法
        Method[] methods = aClass.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println("================================");
        //2.获取方法
        // 获取取clazz对应类中的所有方法--方法数组（一）
        // 不能获取private方法,不获取从父类继承来的所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method:declaredMethods) {
            System.out.println(method);
        }

        System.out.println("=================================");
        //  1.3.获取指定的方法
        //  需要参数名称和参数列表，无参则不需要写
        //  对于方法public void setName(String name) {  }
        Method method = aClass.getDeclaredMethod("setName", String.class);
        System.out.println(method);
        //  而对于方法public void setAge(int age) {  }
        method = aClass.getDeclaredMethod("setAge", Integer.class);
        System.out.println(method);
        //  这样写是获取不到的，如果方法的参数类型是int型
        //  如果方法用于反射，那么要么int类型写成Integer： public void setAge(Integer age) {  }
        //  要么获取方法的参数写成int.class

        //2.执行方法
        //  invoke第一个参数表示执行哪个对象的方法，剩下的参数是执行方法时需要传入的参数
        Object obje = aClass.newInstance();
        method.invoke(obje,2);

        //如果一个方法是私有方法，第三步是可以获取到的，但是这一步却不能执行
        //私有方法的执行，必须在调用invoke之前加上一句method.setAccessible（true）;
    }

    /**
     *  把类对象和类方法名作为参数，执行方法
     *
     *  把全类名和方法名作为参数，执行方法
     *  可变参数可以放数组
     * @param obj: 方法执行的那个对象.
     * @param methodName: 类的一个方法的方法名. 该方法也可能是私有方法.
     * @param args: 调用该方法需要传入的参数
     * @return: 调用方法后的返回值
     *
     */
    public Object invoke(Object obj, String methodName, Object ... args) throws Exception{
        //1. 获取 Method 对象
        //   因为getMethod的参数为Class列表类型，所以要把参数args转化为对应的Class类型。

        Class [] parameterTypes = new Class[args.length];
        for(int i = 0; i < args.length; i++){
            parameterTypes[i] = args[i].getClass();
            System.out.println(parameterTypes[i]);
        }

        Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
        //如果使用getDeclaredMethod，就不能获取父类方法，如果使用getMethod，就不能获取私有方法

        //
        //2. 执行 Method 方法
        //3. 返回方法的返回值
        return method.invoke(obj, args);
    }

    public static void testField() throws Exception {
        Class<Student> aClass = (Class<Student>) Class.forName("com.sl.reflect.Student");
        //1.获取字段
        //  1.1 获取所有字段 -- 字段数组
        //     可以获取公用和私有的所有字段，但不能获取父类字段
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field:declaredFields) {
            System.out.println(field);
        }
        System.out.println("=============================");
        //  1.2获取指定字段
        Field field = aClass.getDeclaredField("name");
        System.out.println(field.getName());

        System.out.println("==============================");

        Student student = new Student();
        //如果字段是私有的，不管是读值还是写值，都必须先调用setAccessible（true）方法
        field.setAccessible(true);
        student.setAge(1);
        student.setName("张三");
        //2.使用字段
        //  2.1获取指定对象的指定字段的值
        Object o = field.get(student);
        System.out.println(o);
        System.out.println("==========================");
        //  2.2设置指定对象的指定对象Field值
        field.set(student, "DEF");
        System.out.println(student.getName());
    }

    public static void testConstructor() throws Exception{
        Class<Student> aClass = (Class<Student>) Class.forName("com.sl.reflect.Student");
        //1. 获取 Constructor 对象
        //   1.1 获取全部
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor constructor:constructors) {
            System.out.println(constructor);
        }
        System.out.println("============================");
        //  1.2获取某一个，需要参数列表
        Constructor<Student> constructor = aClass.getConstructor(String.class, Integer.class);
        System.out.println(constructor);
        System.out.println("============================");
        //2. 调用构造器的 newInstance() 方法创建对象
        Object obj = constructor.newInstance("zhagn", 1);
    }
}
