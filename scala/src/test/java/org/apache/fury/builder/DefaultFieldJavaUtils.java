package org.apache.fury.builder;

import scala.Array;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// only support scala case class
public class DefaultFieldJavaUtils {

    public static void serializeTest(Class<?>  clz) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InvocationTargetException {
        getClassInfo(clz);
    }

    // case class SomeClassB(x: String, y:Int=10000,z: Boolean = true)
    public static void getClassInfo(Class<?>  clz) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Field[] fields = clz.getDeclaredFields();
        Method[] methods2 = clz.getDeclaredMethods();
        for (int i = 1; i <= fields.length; i++) {
            for (Method method : methods2) {
                if(method.getName().endsWith("apply$default$" + i)) {
                    Class<?> objectClz = Class.forName(clz.getName() + "$");
                    Field instance = objectClz.getDeclaredField("MODULE$");
                    Object instanceObj = instance.get(null);
                    Method[] declaredMethods = objectClz.getDeclaredMethods();
                    for (Method declaredMethod : declaredMethods) {
                        if(declaredMethod.getName().endsWith("apply$default$" + i)) {
                            //调用 单例对象
                            Object theFieldDefaultValue = declaredMethod.invoke(instanceObj);

                            // OUTPUT:
                            // class field name: y, parsed default value: 10000
                            // class field name: z, parsed default value: true
                            System.out.println("class field name: " + fields[i-1].getName() + ", parsed default value: " + theFieldDefaultValue);
                        }
                    }
                }
            }
        }

    }
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        serializeTest(SomeClassD.class);
    }
}
