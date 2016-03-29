package graph;

/**
 * Basic interface for creating a graph, directed or not.
 */

public interface Graph
{
/**
 * Tells if the graph is directed or not.
 * @return True if the graph is directed, false otherwise.
 */
	public boolean isDirected();

/**
 * Adds the vertex given in parameter to the graph.
 * @param vertex The vertex to add into the graph.
 */
	public void addVertex(Vertex vertex);

/**
 * Adds vertices given in the array to the graph.
 * @param vertices The array containing the vertices to add.
 */
	public void addVertices(Vertex[] vertices);

/**
 * Removes the iven vertex from the graph
 * @param vertex The vertex to emove from the graph.
 */
	public void removeVertex(Vertex vertex);

/**
 * Removes the vertices iven in the array from the graph.
 * @param vertices The array containing the vertices to remove from the graph.
 */
	public void removeVertices(Vertex[] vertices);
	public Vertex addValue(Object value);
	public Edge connect(Vertex one, Vertex two);
	public void disconnect(Vertex vertex);
	public void disconnect(Vertex beginning, Vertex end);
	public Vertex[] getNeighbours(Vertex vertex);
	public boolean contains(Object value);
	public boolean contains(Vertex vertex);
	public void addEdge(Edge edge, Vertex first, Vertex second);
}
