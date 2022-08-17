package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread2 {
public static void main(String[] args) {
	
	ClassLockDemo obj=new ClassLockDemo();
	ClassLockDemo obj2=new ClassLockDemo();
	ExecutorService es=Executors.newFixedThreadPool(3);
	
	es.execute(new ThreadJob("somu",obj));
	es.execute(new ThreadJob("ramu",obj2));
	es.execute(new ThreadJob("jonu",obj));
	es.shutdown();
}
}
class ThreadJob implements Runnable{
String name;ClassLockDemo obj;
public ThreadJob(String name,ClassLockDemo obj) {
	this.name=name;this.obj=obj;
}
@Override
public void run() {
	Thread.currentThread().setName(name);
	//synchronized(ClassLockDemo.class) {
	//synchronized(obj) {
	if(name.equals("ramu"))
	{
		ClassLockDemo.met();
	}
	else if(name.equals("somu")){
		ClassLockDemo.met2();
	}
	else {
		obj.met3();		
	}
	//}
}
}
class ClassLockDemo{
synchronized public static void met() {
	String name=Thread.currentThread().getName();
	System.out.println("method callled....."+name);
	try {Thread.sleep(5);}catch(Exception e) {}
	System.out.println("job over....."+name);
}
synchronized public static void met2() {
	String name=Thread.currentThread().getName();
	System.out.println("method 2 callled....."+name);
	try {Thread.sleep(50);}catch(Exception e) {}
	System.out.println("job over.2...."+name);
}
synchronized public void met3() {
	String name=Thread.currentThread().getName();
	System.out.println("method 3 callled....."+name);
	try {Thread.sleep(500);}catch(Exception e) {}
	System.out.println("job over.3...."+name);

}
}
