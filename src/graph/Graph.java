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
 * Removes the given vertex from the graph and all the edge attached to it.
 * @param vertex The vertex to emove from the graph.
 */
	public void removeVertex(Vertex vertex);

/**
 * Removes the vertices given in the array from the graph.
 * @param vertices The array containing the vertices to remove from the graph.
 */
	public void removeVertices(Vertex[] vertices);

/**
 * Adds a value into the graph by creating a new vertex which is returned by the method.
 * @param value Value to add into the graph.
 * @return Vertex containing the value passed in paramter after adding it to the graph.
 */
	public Vertex addValue(Object value);

/**
 * Connect two vertex that are already into the graph and returns the edge created between them.
 * @param beginning The beginning o the edge.
 * @param end The end of the edge.
 */
	public Edge connect(Vertex beginning, Vertex end);

/**
 * Disconnect all edges attached to the given vertex.
 */
	public void disconnect(Vertex vertex);

/**
 * Disconnect the two vertices given in parameter. Equivalent to remove all the edges between them.
 */
	public void disconnect(Vertex beginning, Vertex end);

/**
 * Remove the given edge from the graph.
 */
	public void disconnect(Edge edge);

/**
 * Returns an array containing all the neighbours of the given vertex.
 */
	public Vertex[] getNeighbours(Vertex vertex);

/**
 * Tells if the value is contained in at least one vertex in the graph.
 */
	public boolean contains(Object value);

/**
 * Tells if the given vertex is in the graph.
 */
	public boolean contains(Vertex vertex);
}
