package com.biierg.cocc.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.biierg.cocc.common.bean.Report;

public class XmlUtil {
	public static  List<Report> readXml(String fileDir) throws DocumentException{
		 List<Report> reportList = new ArrayList<Report>();
		  SAXReader reader = new SAXReader();
		  Document document = reader.read(new File(fileDir));
		  Element root = document.getRootElement();
		  Iterator it = root.elementIterator();
		  while (it.hasNext()) {
		   Element element = (Element) it.next();
		   //未知元素名情况下
		   Iterator eleIt = element.elementIterator();
		   while (eleIt.hasNext()) {
		    Element e = (Element) eleIt.next();
		    Report report = new Report();
		    report.setName(e.elementText("name"));
	    	report.setTempdir(e.elementText("tempdir"));
	    	report.setReportdir(e.elementText("reportdir"));
	    	reportList.add(report);
		   }
		  }
		  return reportList;
	}
	public static void main(String[] args) throws DocumentException {
//		System.out.println(System.getenv("catalina.home"));
		readXml(System.getenv("catalina.home")+"/etc/cocc-web/report-out.xml");
	}
}
