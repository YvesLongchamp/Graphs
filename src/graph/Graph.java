package graph;

public interface Graph
{
	public boolean isDirected();
	public void addVertex(Vertex vertex);
	public void addVertices(Vertex[] vertices);
	public void connect(Vertex one, Vertex two);
	public boolean contains(Object value);
	public boolean contains(Vertex vertex);
	public void addEdge(Edge edge, Vertex first, Vertex second);
}
