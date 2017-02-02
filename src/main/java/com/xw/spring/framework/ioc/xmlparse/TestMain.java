package com.xw.spring.framework.ioc.xmlparse;

import org.junit.Test;

public class TestMain {

    //private String fileName = "com/xw/spring/framework/ioc/xmlparse/33.txt";
	private String fileName = "com/xw/spring/framework/ioc/xmlparse/jobs.xml";
    @Test
    public void testDom() {
        XmlDocument doc = new DomDemo();
        doc.parseXml(fileName);
    }
    
    @Test
    public void testSax() {
        XmlDocument doc = new SaxDemo();
        doc.parseXml(fileName);
    }
    
    @Test
    public void testDom4j() {
        XmlDocument doc = new Dom4jDemo();
        doc.parseXml(fileName);
    }
}
