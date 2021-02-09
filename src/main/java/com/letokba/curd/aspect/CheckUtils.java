package com.letokba.curd.aspect;


import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ReflectionUtils;

import java.beans.PropertyDescriptor;

/**
 * @author Yong
 * @date 2021/2/9
 */
public class CheckUtils {

    private static final String ARG_NULL = "argument is null, index = %d";
    private static final String BEAN_EMPTY = "bean is empty, name = %s";
    private static final String ARG_EMPTY = "argument is empty, index = %d";

    /**
     * the argument is not allowed null
     * if the argument is bean, it is not allowed empty that its all properties is null.
     * @param args the method's arguments
     */
    public static void checkArgs(Object... args) {
        for (int i = 0; i < args.length; i++) {
            if(args[i] == null) {
                throw new IllegalArgumentException(String.format(ARG_NULL, i));
            }else {
                checkBean(args[i]);
            }
        }
    }

    /**
     * if its all properties is null, the bean is empty
     * if the bean is empty, throw IllegalArgumentException
     * @param bean a javaBean
     *
     */
    public static void checkBean(Object bean) {
        Class<?> clazz = bean.getClass();
        if(BeanUtils.isSimpleProperty(clazz)) {
            return;
        }
        PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(clazz);
        for (PropertyDescriptor pd : pds) {
            Object obj = ReflectionUtils.invokeMethod(pd.getReadMethod(), bean);
            if(obj != null && !(obj instanceof Class)) {
                return;
            }
        }
        // getClass() always exists
        if(pds.length > 1) {
            throw new IllegalArgumentException(String.format(BEAN_EMPTY, clazz.getName()));
        }
    }

    /**
     * when argument is null or its size is 0 or its length is 0, it's empty.
     * @param args the method's arguments
     */
    public static void checkIsEmpty(Object... args) {
        for (int i = 0; i < args.length; i++) {
            if (ObjectUtils.isEmpty(args[i])) {
                throw new IllegalArgumentException(String.format(ARG_EMPTY, i));
            }
        }
    }
}
