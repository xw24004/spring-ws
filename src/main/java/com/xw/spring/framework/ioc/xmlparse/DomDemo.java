package com.xw.spring.framework.ioc.xmlparse;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomDemo extends XmlDocument {

    @Override
    public void parseXml(InputStream inputStream) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(inputStream);
            NodeList rootNodeList = doc.getChildNodes();
            // <users>
            for (int i = 0; i < rootNodeList.getLength(); i++) {
                Node users = rootNodeList.item(i);
                NodeList userInfo = users.getChildNodes();
                for (int j = 0; j < userInfo.getLength(); j++) {
                    Node user = userInfo.item(j);
                    NodeList userMeta = user.getChildNodes();
                    for (int k = 0; k < userMeta.getLength(); k++) {
                        Node userDetail = userMeta.item(k);
                        if (!userDetail.getNodeName().equals("#text")) {
                            System.out
                                    .println(userMeta.item(k).getNodeName() + ":" + userMeta.item(k).getTextContent());
                        }
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
