package com.xw.spring.framework.ioc.xmlparse;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxDemo extends XmlDocument {

    @Override
    public void parseXml(InputStream inputStream) {
        SAXParserFactory saxpf = SAXParserFactory.newInstance();
        try {
            SAXParser saxp = saxpf.newSAXParser();
            saxp.parse(inputStream, new mySaxHandler());
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class mySaxHandler extends DefaultHandler {
        boolean hasAttribute = false;
        Attributes attributes = null;
        String preTag = null;

        @Override
        public void startDocument() throws SAXException {
            System.out.println("开始打印文档");
            super.startDocument();
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("结束打印文档");
            super.endDocument();
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            if (qName.equals("users")) {
                System.out.println("users");
                return;
            } else if (qName.equals("user")) {
                System.out.println(qName + ":" + attributes.getValue(0));
            } else {
                preTag = qName;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String context = new String(ch, start, length);
            if ("name".equals(preTag) || "age".equals(preTag) || "sex".equals(preTag)) {
                System.out.println(preTag + ":" + context);
            } else {
                //System.out.println("text");
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            preTag = null;
        }

    }

}
