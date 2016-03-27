package graph;

public class Vertex
{
	private Object value;
	private Graph parent;
	
	public Vertex(Graph parent)
	{
		this.parent = parent;
	}
	
	public Graph getParent()
	{
		return parent;
	}
	
	public Object getValue()
	{
		return value;
	}
}
