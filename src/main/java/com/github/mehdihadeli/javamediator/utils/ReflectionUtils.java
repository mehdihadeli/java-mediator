package com.github.mehdihadeli.javamediator.utils;

import java.lang.reflect.*;

public class ReflectionUtils {
    /**
     * Retrieves the generic type parameter of a given object using raw reflection.
     *
     * @param object The object whose generic type is to be determined.
     * @param genericInterface The generic interface to inspect (e.g. ICommand.class).
     * @return The Class representing the actual generic type argument, or null if not found.
     */
    public static Class<?> getGenericTypeUsingReflection(Object object, Class<?> genericInterface) {
        for (Type type : object.getClass().getGenericInterfaces()) {
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
}
