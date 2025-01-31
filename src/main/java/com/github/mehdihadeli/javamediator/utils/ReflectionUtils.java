package com.github.mehdihadeli.javamediator.utils;

import java.lang.reflect.*;
import java.util.HashSet;
import java.util.Set;

public class ReflectionUtils {
    /**
     * Retrieves the generic type parameter of a given object using raw reflection.
     *
     * @param object The object whose generic type is to be determined.
     * @param genericInterface The generic interface to inspect (e.g. ICommand.class).
     * @return The Class representing the actual generic type argument, or null if not found.
     */
    public static Class<?> getGenericTypeUsingReflection(Object object, Class<?> genericInterface) {
        // get all base level interfaces for the object
        Set<Type> interfaces = new HashSet<>();
        collectInterfaces(object.getClass(), interfaces);

        for (Type type : interfaces) {
            if (type instanceof ParameterizedType parameterizedType) {
                if (genericInterface.isAssignableFrom((Class<?>) parameterizedType.getRawType())) {
                    Type actualType = parameterizedType.getActualTypeArguments()[0];
                    if (actualType instanceof Class<?>) {
                        return (Class<?>) actualType;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Helper method to recursively collect interfaces from a class and its hierarchy.
     */
    private static void collectInterfaces(Class<?> clazz, Set<Type> interfaces) {
        if (clazz == null || clazz == Object.class) {
            return;
        }

        for (Type genericInterface : clazz.getGenericInterfaces()) {
            if (interfaces.add(genericInterface)) {
                if (genericInterface instanceof Class) {
                    collectInterfaces((Class<?>) genericInterface, interfaces);
                }
            }
        }

        collectInterfaces(clazz.getSuperclass(), interfaces);

        for (Class<?> iface : clazz.getInterfaces()) {
            collectInterfaces(iface, interfaces);
        }
    }
}
