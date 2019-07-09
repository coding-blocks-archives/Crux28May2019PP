package L33_July9;

import java.util.HashMap;
import java.util.LinkedList;

import L16_June20.OOPS_Story2.P;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Jul-2019
 *
 */

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	private HashMap<String, Vertex> vtces = new HashMap<>();

	public int numVertex() {
		return vtces.size();
	}

	public boolean containsVertex(String vname) {
		return vtces.containsKey(vname);
	}

	public void addVertex(String vname) {

		Vertex vtx = new Vertex();
		vtces.put(vname, vtx);

	}

	public void removeVertex(String vname) {

		Vertex vtx = vtces.get(vname);

		for (String nbr : vtx.nbrs.keySet()) {

			Vertex nbrVtx = vtces.get(nbr);
			nbrVtx.nbrs.remove(vname);
		}

		vtces.remove(vname);
	}

	public int numEdges() {

		int sum = 0;

		for (String key : vtces.keySet()) {
			Vertex vtx = vtces.get(key);
			sum += vtx.nbrs.size();
		}

		return sum / 2;

	}

	public boolean containsEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void display() {

		System.out.println("---------------------------");
		for (String key : vtces.keySet()) {

			Vertex vtx = vtces.get(key);
			System.out.println(key + " -> " + vtx.nbrs);
		}
		System.out.println("---------------------------");
	}

	@Override
	public String toString() {

		String str = "";
		str += "---------------------------\n";
		for (String key : vtces.keySet()) {

			Vertex vtx = vtces.get(key);
			str += key + " -> " + vtx.nbrs;
			str += "\n";
		}
		str += "---------------------------\n";

		return str;
	}

	public boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {

		processed.put(src, true);

		if (containsEdge(src, dst)) {
			return true;
		}

		for (String nbr : vtces.get(src).nbrs.keySet()) {
			if (!processed.containsKey(nbr) && hasPath(nbr, dst, processed)) {
				return true;
			}
		}

		return false;
	}

	public void printAllPaths(String src, String dst, HashMap<String, Boolean> processed, String asf) {

		processed.put(src, true);

		if (src.equals(dst)) {
			System.out.println(asf);

			processed.remove(src);
			return;
		}

		for (String nbr : vtces.get(src).nbrs.keySet()) {
			if (!processed.containsKey(nbr)) {
				printAllPaths(nbr, dst, processed, asf + nbr);
			}
		}

		processed.remove(src);

	}

	private class Pair {
		String vname;
		String psf;
	}

	public boolean bfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		// make the pair of src and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;

		queue.addLast(sp);

		// work till queue is not empty
		while (!queue.isEmpty()) {

			// remove the pair from queue
			Pair rp = queue.removeFirst();

			// ignore the second C
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// processed
			processed.put(rp.vname, true);

			// nbrs
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// work only for unprocessed nbrs
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}
			}

		}

		return false;

	}

	public boolean dfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> stack = new LinkedList<>();

		// make the pair of src and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;

		stack.addFirst(sp);

		// work till queue is not empty
		while (!stack.isEmpty()) {

			// remove the pair from queue
			Pair rp = stack.removeFirst();

			// ignore the second C
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// processed
			processed.put(rp.vname, true);

			// nbrs
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// work only for unprocessed nbrs
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					stack.addFirst(np);
				}
			}

		}

		return false;

	}

	public void bft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			// make the pair of src and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			queue.addLast(sp);

			// work till queue is not empty
			while (!queue.isEmpty()) {

				// remove the pair from queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				System.out.println(rp.vname + " via " + rp.psf);

				// processed
				processed.put(rp.vname, true);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// work only for unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}

		}

	}

	public void dft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> stack = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			// make the pair of src and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			stack.addFirst(sp);

			// work till queue is not empty
			while (!stack.isEmpty()) {

				// remove the pair from queue
				Pair rp = stack.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				System.out.println(rp.vname + " via " + rp.psf);

				// processed
				processed.put(rp.vname, true);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// work only for unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						stack.addFirst(np);
					}
				}

			}

		}

	}

}
