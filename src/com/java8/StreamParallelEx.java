package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamParallelEx 
{
     public static void main(String[] args)
     {
         Stream<Integer> stream = Stream.of( new Integer[]{1,2,3} );
         stream.forEach(p -> System.out.println(p));
         
         
         List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 4; i++){
             list.add(i);
         }
         Stream<Integer> streamwithlist = list.stream();
         streamwithlist.forEach(p -> System.out.println(p));
         
         
		/*
		 * Stream<Date> streamdate = Stream.generate(() -> { return new Date(); });
		 * //will run indefinitely. streamdate.forEach(p -> System.out.println(p));
		 */
         
         List<String> memberNames = new ArrayList<>();
         memberNames.add("Amitabh");
         memberNames.add("Shekhar");
         memberNames.add("Aman");
         memberNames.add("Rahul");
         memberNames.add("Shahrukh");
         memberNames.add("Salman");
         memberNames.add("Yana");
         memberNames.add("Lokesh");
         
         memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
         memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
         memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
         
         List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
         System.out.print(memNamesInUppercase);
         
                 
         
         System.out.print("\n");
         long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
         System.out.println(totalMatched);
         
         
         
         Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
         reduced.ifPresent(System.out::println);
         
         
         Stream.of("John", "Mike", "Ryan","Donald", "Matthew").parallel().forEach(System.out::println);
         Stream.of("John", "Mike", "Ryan","Donald", "Matthew").forEach(System.out::println);

         
         
     }
}