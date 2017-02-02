package com.xw.spring.framework.ioc.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.StringUtils;

public class ResourceDetailTest {

    @Test
    public void ResourceTest1() throws IOException {
        String path = "E:/workspace/tooldev/cbt3/spring-framework/target/classes/com/xw/spring/framework/ioc/resource/beans1.xml";
        Resource fileResource = new FileSystemResource(path);
        String path2 = "com/xw/spring/framework/ioc/resource/beans1.xml";
        ClassPathResource classPathResource = new ClassPathResource(path2);
        // 1.exists
        System.out.println("exists===>");
        System.out.println(fileResource.exists());
        System.out.println(classPathResource.exists());
        // 2.是否可读
        System.out.println("isReadable===>");
        System.out.println(fileResource.isReadable());
        System.out.println(classPathResource.isReadable());
        // 3.是否打开，一直都是close
        System.out.println("isOpen===>");
        System.out.println(fileResource.isOpen());
        System.out.println(classPathResource.isOpen());
        
        // 4.getURI
        System.out.println("getURI===>");
        System.out.println(fileResource.getURI());
        System.out.println(classPathResource.getURI());
        
        // 5.getURL
        System.out.println("getURL===>");
        System.out.println(fileResource.getURL());
        System.out.println(classPathResource.getURL());
        
        // 6.getFile
        System.out.println("getFile===>");
        System.out.println(fileResource.getFile());
        System.out.println(classPathResource.getFile());
        
        
        // 6.getFile
        System.out.println("contentLength===>");
        System.out.println(fileResource.contentLength());
        System.out.println(classPathResource.contentLength());
        
        // 6.getDescription
        System.out.println(fileResource.getDescription());
        System.out.println(classPathResource.getDescription());

//        InputStream in = fileResource.getInputStream();
//        InputStreamReader isr = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(isr);
//        String tmp = null;
//
//        while ((tmp = br.readLine()) != null) {
//            System.out.println(tmp);
//        }
//
//        System.out.println(fileResource.isOpen());
    }

}
