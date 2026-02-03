package utils;

public class ReflectionUtils {
    public static void printInfo(Object obj) {
        Class<?> c = obj.getClass();
        System.out.println("Class: " + c.getName());
    }
}

