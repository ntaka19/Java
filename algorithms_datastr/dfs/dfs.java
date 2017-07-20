class StackX //stackのメソッドを定義しているだけ。実質arrayである。
{
  private final int SIZE = 20;
  private int[] st;
  private int top;

  public StackX() //constructor
  {
    st = new int[SIZE]; //make array
    top = -1;
  }
  public void push(int j)
    {st[++top] = j; } //put item on stack

  public int pop()
    {return st[top--];}
  public int peek() //peek at top of stack
    {return st[top]; }

  public boolean isEmpty() //true if nothing on stack
    {return (top == -1);}
} //end class vertex

class Vertex
{
  public char label; //label (e.g. 'A')
  public boolean wasVisited;

  public Vertex(char lab) //constructor
  {
    label = lab;
    wasVisited = false;
  }
}

class Graph{
  private final int MAX_VERTS = 20;
  private Vertex vertexList[]; //list of vertices
  private int adjMat[][]; // adjacency matrix 中に入るものを最初定義しているかんじか。
  private int nVerts; //current number of vertices
  private StackX theStack;

  public Graph() //constructor
    {
      vertexList = new Vertex[MAX_VERTS];
      adjMat = new int[MAX_VERTS][MAX_VERTS];
      nVerts = 0;
      for(int j = 0; j<MAX_VERTS; j++)
        for(int k = 0; k<MAX_VERTS; k++)
          adjMat[j][k] = 0;
      theStack = new StackX();
    } //end constructor

  public void addVertex(char lab)
  {
    vertexList[nVerts++] = new Vertex(lab);
  }

  public void addEdge(int start, int end)
  {
    adjMat[start][end] = 1;
    adjMat[end][start] = 1;
  }
  public void displayVertex(int v)
  {
    System.out.print(vertexList[v].label);
  }

public void dfs(){
  vertexList[0].wasVisited =true; //begin at vertex 0. mark it
  displayVertex(0);  //display it.
  theStack.push(0);

  while(!theStack.isEmpty()) //until stack empty
  {
    int v = getAdjUnvisitedVertex( theStack.peek()); //get an unvisited vertex adjacent to stack top
    if(v== -1){ //if no such vertex
      theStack.pop(); //pop a new one
      }
    else //if it exists
    {
      vertexList[v].wasVisited = true;
      displayVertex(v);
      theStack.push(v);
    }
  }
  //the stack is empty so we are done.
  for(int j=0 ;j<nVerts; j++ )
    vertexList[j].wasVisited = false;
  } //end dfs

  public int getAdjUnvisitedVertex(int v)
  {
    for(int j = 0 ; j<nVerts; j++)
      if(adjMat[v][j]==1 && vertexList[j].wasVisited == false)
        return j;
    return -1;
  } //end getAdjUnvisitedVertex
} //end class Graph

class DFSApp
  {
  public static void main(String[] args)
    {
      Graph theGraph = new Graph();
      theGraph.addVertex('A'); //0 (start for dfs)
      theGraph.addVertex('B'); //1
      theGraph.addVertex('C'); //2
      theGraph.addVertex('D'); //3
      theGraph.addVertex('E'); //4

      theGraph.addEdge(0,1);
      theGraph.addEdge(1,2);
      theGraph.addEdge(0,3);
      theGraph.addEdge(3,4); //DE

      System.out.print("Visits: ");
      theGraph.dfs();
      System.out.println();
    }//end main
  }
//end class DFSApp
