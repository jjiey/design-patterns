package com.design.pattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure类
 *
 * @author yj
 *
 */
public class ObjectStructure {
	private List<Element> elements = new ArrayList<>();
	
	public void attach(Element element) {
		elements.add(element);
	}
	
	public void detach(Element element) {
		elements.remove(element);
	}
	
	public void accept(Visitor vistor) {
		for (Element element : elements) {
			element.accept(vistor);
		}
	}
}
