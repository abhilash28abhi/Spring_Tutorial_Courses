package com.spring.aop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotation to indicate the method execution time
@Target(ElementType.METHOD) //to be used only on methods
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
