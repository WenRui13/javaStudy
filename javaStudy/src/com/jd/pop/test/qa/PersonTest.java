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
	  writeMethod.invoke(p, "张三");
	  String name = (String) beanInfo.getBeanDescriptor().getValue("name");
	  System.out.println(name);
//	  System.out.println(p);
  }
  @Test
  public void test2() throws Exception {
	  BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
	  PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
	  for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
		  System.out.println(propertyDescriptor.getName()+","+propertyDescriptor.getPropertyType());
		
	}
	  
  }
  @Test
  public void test3() throws Exception {
	  
  }
}
