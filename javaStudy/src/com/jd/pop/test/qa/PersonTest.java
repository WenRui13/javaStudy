package com.jd.pop.test.qa;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class PersonTest {
  @Test
  public void test1() throws Exception {
	  Person p = new Person();
	  BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
	  PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name", Person.class);
	  Method writeMethod = propertyDescriptor.getWriteMethod();
	  writeMethod.invoke(p, "ÕÅÈý");
	  String name = (String) beanInfo.getBeanDescriptor().getValue("name");
	  System.out.println(name);
//	  System.out.println(p);
  }
}
