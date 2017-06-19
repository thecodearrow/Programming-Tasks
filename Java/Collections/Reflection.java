/*

@author Prashanth
TITLE: Annotations & Reflection API


*/
package week10;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
int val();
String str();
}

//Applying annotation
class Hello{
@MyAnnotation(str="abc",val=10)
 public void sayHello(){System.out.println("hello annotation");}
}

//Accessing annotation
class TestCustomAnnotation1{
public static void main(String args[])throws Exception{

Hello h=new Hello();
Method m=h.getClass().getMethod("sayHello");
MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
System.out.println("The values are: "+manno.val()+" "+manno.str());
}}
