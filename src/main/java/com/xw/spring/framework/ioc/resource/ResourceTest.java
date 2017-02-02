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

public class ResourceTest {
    
    @Test
    public void fileSystemResourceTest() throws IOException {
        String path = "E:/workspace/java_ee/spring-framework/src/main/java/com/xw/spring/framework/ioc/resource/beans1.xml";
        FileSystemResource fileSystemResource = new FileSystemResource(path);
        InputStream in = fileSystemResource.getInputStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String tmp = null;
        while ((tmp = br.readLine()) != null) {
            System.out.println(tmp);
        }
    }
    
    @Test
    public void classPathResourceTest() throws IOException {
        String path = "com/xw/spring/framework/ioc/resource/beans1.xml";
        ClassPathResource classPathResource = new ClassPathResource(path);
        InputStream in = classPathResource.getInputStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String tmp = null;
        while ((tmp = br.readLine()) != null) {
            System.out.println(tmp);
        }
    }
    
    @Test
    public void resourcePatternResolverTest() throws IOException {
        String locationPattern = "classpath*:com/xw/spring/framework/**/*.xml";
        ResourcePatternResolver fileSystemResource = new PathMatchingResourcePatternResolver();
        Resource[] resources = fileSystemResource.getResources(locationPattern);
        
        for(Resource res : resources){
            System.out.println(res.getFilename());
            InputStream in = res.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String tmp = null;
            while ((tmp = br.readLine()) != null) {
                System.out.println(tmp);
            }
        }
    }
    
    @Test
    public void encodeTest() throws IOException {
        String path = "com/xw/spring/framework/ioc/resource/beans1.xml";
        ClassPathResource classPathResource = new ClassPathResource(path);
        EncodedResource encode = new EncodedResource(classPathResource, "utf-8");
        
        BufferedReader br = new BufferedReader(encode.getReader());
        String tmp = null;
        while ((tmp = br.readLine()) != null) {
            System.out.println(tmp);
        }
    }
}
