package lol.koblizek.injectr;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class Injectr {
    private Injectr() {}

    public static InjectionManager getInjectionManager() {
        return (InjectionManager) Proxy.newProxyInstance(
                Injectr.class.getClassLoader(),
                new Class[] { InjectionManager.class },
                Injectr::handler
        );
    }

    private static Method currentlyExecutingMethod;

    private static Object handler(Object o, Method method, Object[] objects) {
        if (method.getName().equals("getExecutingMethod"))
            return currentlyExecutingMethod;
        else return null;
    }

    public interface InjectionManager {
        Method getExecutingMethod();
    }
}
