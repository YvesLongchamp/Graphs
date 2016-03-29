package graph;

/**
 * Class that represents an edge in a graph: directed or not.
 */

public class Edge
{
	private Graph parent;
	private boolean directed;
	private Vertex beginning;
	private Vertex end;

	public Edge()
	{
	}

/**
 * Creates an edge with a boolean that specifies whether the edge is oriented or not.
 * @param directed true if the edge is oriented, false otherwise
 */
	public Edge(boolean directed)
	{
		this.directed = directed;
	}

/**
 * Creates an edge with, oriented or not, with a beginning and an end.
 * @param beginning Vertex connected to the edge. It symbolizes the beginning of the edge if it's directed.
 * @param end Vertex conncted on the other side of the edge. It symbolizes the end of the edge if it's directed.
 * @param directed true if the edge is oriented, false otherwise
 */
	public Edge(Vertex beginning, Vertex end, boolean directed)
	{
		this(directed);
		this.beginning = beginning;
		this.end = end;
	}

/**
 * Connect two vertices.
 * @param beginning Vertex connected to the edge. It symbolizes the beginning of the edge if it's directed.
 * @param end Vertex conncted on the other side of the edge. It symbolizes the end of the edge if it's directed.
 */
	public void connect(Vertex beginning, Vertex end)
	{
		this.beginning = beginning;
		this.end = end;
	}

/**
 * Sets the graph that the edge belongs to to another value.
 * @param parent The gaph the edge belongs to.
 */
	public void setParent(Graph parent)
	{
		this.parent = parent;
	}

/**
 * Returns the graph the edge belongs to.
 * @return The graph that contains the edge (can be null).
 */
	public Graph getParent()
	{
		return parent;
	}

/**
 * Returns the graph the edge belongs to.
 * @return True if the edge is directed, false otherwise.
 */
	public boolean isDirected()
	{
		return directed;
	}

/**
 * Giving one vertex, it gives you the neighbour.
 * @param vertex If the given vertex correspond to one side of the edge, it gives you the vertex on the other side.
 * @return null if the given vertex is null or if the edge is directed and the given vertex is at the end of the edge. Else it will return 
 */
	public Vertex getNeighbour(Vertex vertex)
	{
		if(vertex == null)
			return null;

		if(vertex == beginning)
			return end;

		if(vertex == end)
			return (directed) ? null : beginning;

		else
			return null;
	}

}
