package com.xw.spring.framework.ioc.xmlparse;

import java.io.IOException;
import java.io.InputStream;

public abstract class XmlDocument {

    public abstract void parseXml(InputStream inputStream);

    public void parseXml(String fileName) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream inputStream = null;
        try {
            inputStream = classLoader.getResourceAsStream(fileName);
            parseXml(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
