package javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class ToLearnStream {
//@Test
public void regular() {
	ArrayList<String> a=new ArrayList();
	a.add("King");
	a.add("Allen");
	a.add("Adam");
	a.add("Miller");
	a.add("Alekeya");
	int count=0;
	for(int i=0;i<a.size();i++) {
		if(a.get(i).startsWith("A")) {
		count++;	
		}
	}
	System.out.println(count);
}
//@Test
public void streamfilter() {
	ArrayList<String> a=new ArrayList();
	a.add("King");
	a.add("Allen");
	a.add("Adam");
	a.add("Miller");
	a.add("Alekeya");
	//there is no life for immideate operation if there is no terminal operation
	//Terminal op will execute only if inter op(filter ) return true
	//We can create Stream
	
	long res = a.stream().filter(s->s.startsWith("A")).count();
	System.out.println(res);
	
	long d=Stream.of("King","Allen","Adam","Miller","Alekeya").filter(s->{
		
		s.startsWith("A");
		return true;
		}).count();
	System.out.println(d);
	
	a.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	a.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
}
//@Test
public void filtermap() {

	Stream.of("King","Allen","Adam","Miller","Alekeya")
	.filter(s->s.endsWith("r"))
	.map(s->s.toUpperCase())
	.forEach(s->System.out.println(s));
}
@Test
public void streamMap() {
	List<String> li = Arrays.asList("King","Allen","Adam","Miller","Alekeya");
	li.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
	
	}
}
