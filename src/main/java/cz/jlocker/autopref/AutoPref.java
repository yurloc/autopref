package cz.jlocker.autopref;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author jlocker
 */
public class AutoPref {
    public static <K, V> K manage(K obj, final V def) {
        Proxy.newProxyInstance(AutoPref.class.getClassLoader(), new Class[]{obj.getClass()}, new InvocationHandler() {

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("setValue".equals(method.getName())) {
                    if (args.length == 1) {
                        Class<?>[] pars = method.getParameterTypes();
                        if (pars[0].isAssignableFrom(def.getClass())) {
                            // TODO store the prefs
                            System.out.printf("storing preference of value [%s]%n", args[0]);
                        }
                    }
                }
                return null;
            }
        });
        return null;
    }
}
