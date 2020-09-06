package com.manipal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.Line;
import demo.Point;
import demo.Triangle;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		
    	Point p = (Point) context.getBean("point");
		Line l =  (Line) context.getBean("line");
		Triangle t = (Triangle) context.getBean("triangle");
		
		System.out.println(p.getX() + " " + p.getY());
		System.out.println(l.getP1().getX() + " "+ l.getP2().getY() + " " + l.getP2().getX() + " " + l.getP2().getY());
		System.out.println(t.getP1().getX() + " " + t.getP2().getX() + " " + t.getP3().getX());
		
    }
}
