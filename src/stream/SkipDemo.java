package stream;

import java.util.stream.Stream;

public class SkipDemo {

	public static void main(String[] args) {
		//designing stream of integer data
		Stream<Integer>streams=Stream.iterate(0,(s)->s+2);//0,2,4,6,8.....infifnity//0 refers to infinity
		streams=streams.skip(4);
		streams=streams.limit(200);//limit is intermediate operation
		streams.forEach(System.out::println);

	}

}
