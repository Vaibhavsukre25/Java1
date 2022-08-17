package runall;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Streams1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("rahim");
		list.add("ram");
		list.add("mahim");list.add("mahim");list.add("mahim");
		list.add("abdul");
		list.add("karim");
		
		Stream<String> stream=list.stream();		
		long noofobjects=stream.count();		
		System.out.println("No of objects..:"+noofobjects);
		
		stream=list.stream();
		Object arr[]=stream.toArray();
		for(Object o:arr) {
			System.out.println(o.toString());
		}
		System.out.println("......................");
		
		stream=list.stream();
		stream.distinct().forEach((x)->{
			System.out.print(Thread.currentThread().getName()+":");
			System.out.println(x);			
		});
		
		System.out.println("......................");
		
		stream=list.stream();
		stream.distinct().parallel().forEach((x)->{
			System.out.print(Thread.currentThread().getName()+":");
			System.out.println(x);			
		});
		
		System.out.println("......................");
		
		stream=list.stream();
		stream.distinct().parallel().filter((x)->{return x.contains("m");}).forEach(System.out::println);
		
		System.out.println("......................");
		
		stream=list.stream();
		long c=stream.parallel().filter((x)->{return x.equals("mahim");}).count();
		System.out.println("Count of mahim is..:"+c);
	}
}

