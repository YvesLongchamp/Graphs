package graph;

public class Edge
{
	private Graph parent;
	private boolean directed;
	private Vertex beginning;
	private Vertex end;

	public Edge()
	{
	}

	public Edge(boolean directed)
	{
		this.directed = directed;
	}

	public Edge(Vertex beginning, Vertex end, boolean directed)
	{
		this(directed);
		this.beginning = beginning;
		this.end = end;
	}

	public void connect(Vertex beginning, Vertex end)
	{
		this.beginning = beginning;
		this.end = end;
	}
	
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

	public void setParent(Graph parent)
	{
		this.parent = parent;
	}

	public Graph getParent()
	{
		return parent;
	}

}
