package graph;

public interface Graph
{
	public boolean isDirected();
	public void addVertex(Vertex vertex);
	public void addVertices(Vertex[] vertices);
	public void removeVertex(Vertex vertex);
	public void removeVertices(Vertex[] vertices);
	public void connect(Vertex one, Vertex two);
	public void disconnect(Vertex vertex);
	public void disconnect(Vertex beginning, Vertex end);
	public Vertex[] getNeighbours(Vertex vertex);
	public boolean contains(Object value);
	public boolean contains(Vertex vertex);
	public void addEdge(Edge edge, Vertex first, Vertex second);
}
