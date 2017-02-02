package com.xw.spring.framework.ioc.xmlparse;

import java.io.InputStream;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jDemo extends XmlDocument {

//    @Override
//    public void parseXml(InputStream inputStream) {
//        SAXReader saxReader = new SAXReader();
//        try {
//            Document doc = saxReader.read(inputStream);
//            Element users = doc.getRootElement();
//            for (Iterator<?> userIter = users.elementIterator(); userIter.hasNext();) {
//                Element user = (Element) userIter.next();
//                for (Iterator<?> userMetaIter = user.elementIterator(); userMetaIter.hasNext();) {
//                    Element userMeta = (Element) userMetaIter.next();
//                    System.out.println(userMeta.getName() + ":" + userMeta.getText());
//                }
//            }
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//    }
    
    @Override
    public void parseXml(InputStream inputStream) {
        SAXReader saxReader = new SAXReader();
        try {
            Document doc = saxReader.read(inputStream);
            Element jobs = doc.getRootElement();
            for (Iterator<?> jobIter = jobs.elementIterator(); jobIter.hasNext();) {
                Element job = (Element) jobIter.next();
                for (Iterator<?> userMetaIter = job.elementIterator(); userMetaIter.hasNext();) {
                    Element userMeta = (Element) userMetaIter.next();
                    System.out.println(userMeta.getName() + ":" + userMeta.getText());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
