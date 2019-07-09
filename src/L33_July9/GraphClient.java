package L33_July9;

import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Jul-2019
 *
 */

public class GraphClient {

	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 6);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("F", "G", 1);
		graph.addEdge("E", "G", 7);

		System.out.println(graph);

		graph.removeEdge("D", "E");
		// boolean ans = graph.hasPath("A", "F", new HashMap<>());
		// System.out.println(ans);

		// graph.printAllPaths("A", "F", new HashMap<>(), "A");

		System.out.println(graph.bfs("A", "F"));
		System.out.println(graph.dfs("A", "F"));

		graph.bft();

	}
}
