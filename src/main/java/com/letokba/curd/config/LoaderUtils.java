package com.letokba.curd.config;

import com.letokba.curd.annotation.CurdService;
import com.letokba.curd.core.SimpleService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yong
 * @date 2021/2/9
 */
public class LoaderUtils {
    private static final String RESOURCE_PATTERN = "/**/*.class";
    private static final Class<?> BASE_CLASS = SimpleService.class;


    public static List<Class<?>> getResources(String basePackage) throws Exception {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String pattern = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
                + ClassUtils.convertClassNameToResourcePath(basePackage) + RESOURCE_PATTERN;

        Resource[] resources = resolver.getResources(pattern);
        MetadataReaderFactory readerFactory = new CachingMetadataReaderFactory();

        List<Class<?>> classList = new ArrayList<>();

        for (Resource resource : resources) {
            MetadataReader metadataReader = readerFactory.getMetadataReader(resource);
            String className = metadataReader.getClassMetadata().getClassName();
            Class<?> clazz = Class.forName(className);
            if (clazz.isInterface() && clazz.isAnnotationPresent(CurdService.class)) {
                classList.add(clazz);
            }
        }
        return classList;
    }




}
