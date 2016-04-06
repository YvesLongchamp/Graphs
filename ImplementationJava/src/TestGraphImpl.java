import graph.Edge;
import graph.Vertex;

/**
 * 
 * @author Yves Longchamp & Thibault Godard
 * 
 *         A test to the implementation of the graph.
 *
 */
public class TestGraphImpl {

	/**
	 * Main method. Here, we have a problem with the type itself, and we can't
	 * say why. Sorry.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GraphImpl graph = new GraphImpl();
		Vertex v1 = new Vertex();
		Vertex v2 = new Vertex();
		Vertex v3 = new Vertex();

		graph.addVertex(v1);
		System.out.println("Adding the v1 vertex.");
		graph.addVertex(v2);
		System.out.println("Adding the v2 vertex.");
		graph.addVertex(v3);
		System.out.println("Adding the v3 vertex.");

		Edge edge1 = graph.connect(v1, v2);
		System.out.println("Adding the Edge between v1 and v2.");
		Edge edge2 = graph.connect(v2, v3);
		System.out.println("Adding the Edge between v2 and v3.");
		Vertex[] vertices = new Vertex[graph.getSize()];
		vertices = graph.getVertices();
		System.out.println("The graph size is :  " + vertices.length);

		Vertex[] vertices2 = graph.getNeighbours(v1);
		int i = 0;
		while (i < vertices2.length) {
			if (v2.equals(vertices2[i])) {
				System.out.println("v2 is a neighbour of v1.");
			}
			if (v3.equals(vertices2[i])) {
				System.out.println("v3 is a neighbour of v1.");
			}
		i++;
		}

	}
}
