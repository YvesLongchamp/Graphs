package graph;

public class Vertex
{
	private Object value;
	private Graph parent;
	
	public Vertex()
	{
	}
	
	public Vertex(Object value)
	{
		this.value = value;
	}
	
	public void setParent(Graph parent)
	{
		this.parent = parent;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
	public Graph getParent()
	{
		return parent;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public boolean equals(Vertex vertex)
	{
		if(vertex == null)
			return false;
		
		return value.equals(vertex.value);
	}
}
