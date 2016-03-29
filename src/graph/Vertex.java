package graph;

/**
 * Class that represents a vertex in a graph.
 */
public class Vertex
{
	private Object value;
	private Graph parent;
	
	public Vertex()
	{
	}
	
/**
 * Creates a vertex with an initial value.
 * @param value Initial value contained in the vertex.
 */
	public Vertex(Object value)
	{
		this.value = value;
	}
	
/**
 * Sets the graph that the vertex belongs to to another value.
 * @param parent The gaph the edge belongs to.
 */
	public void setParent(Graph parent)
	{
		this.parent = parent;
	}
	
/**
 * Sets the value contained in the vertex to a new value.
 * @param value New value to put in the vertex.
 */
	public void setValue(Object value)
	{
		this.value = value;
	}

/**
 * Returns the graph the vertex belongs to.
 * @return The graph that contains the vertex (can be null).
 */
	public Graph getParent()
	{
		return parent;
	}
	
/**
 * Returns the value which is inside of the vertex
 * @return Value contained in the vertex
 */
	public Object getValue()
	{
		return value;
	}
}
