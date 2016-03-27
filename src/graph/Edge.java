package graph;

public class Edge
{
	protected Graph parent;
	protected Vertex beginning;
	protected Vertex end;
	
	public Edge(Graph parent)
	{
		this.parent = parent;
	}
	
	
	public Graph getParent()
	{
		return parent;
	}
}
