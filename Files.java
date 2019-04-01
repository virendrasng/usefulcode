package demo.jpa.demojpa;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class E {

	public static void main(String[] args) throws Exception {
		final Set<String> lhs = new LinkedHashSet<String>();
		final List<String> l = new ArrayList<String>();
		
		Path path = Paths.get("input.txt");
		Stream<String> lines = Files.lines(path);
		lines.forEach(x -> {
			if (lhs.add(x.substring(0, x.indexOf("\t")).replace(" ", "").toUpperCase())) {
				l.add(x);
			} else {
				System.out.println(x);
			}
		});
		
		lines.close();
		
		System.out.println("***************** Shorter list **************************\n");
		l.stream().forEach(System.out::println);
	}

}
