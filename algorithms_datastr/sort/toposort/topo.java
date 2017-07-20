//topological sort
//directed graph
//course prerequisites などに使える。
//step1.find a vertex that has no succussors
//step2. delete this vertex from the graph, and insert its label at the beginning of a list.
//repeat the steps until all vertices are gone.
class Vertex{
  public char label; //ほとんと同じ内容。
}

class Graph{　//ほとんど同じ内容dfs, bfs
  //public int no successors などが重要かもしれない。
}

public void topo()
{
  int orig_nVerts = nVerts; //rememeber how many verts

  while(nVerts > 0) //while vertices remain
  {
    //get a vertex with no successors or -1
    int currentVertex = noSuccessors();
    if(currentVertex == -1) //must be a cycle
    {
      System.out.println("ERROR: Graph has cycles");
      return;
    }
    sortedArray[nVerts-1] = vertexList[currentVertex].label;
    //if the vertex is found, put the vertex label at the end of array.

    deleteVertex(currentVertex);
  }//end while
}//end topo

public int noSuccessors()
  {
    boolean isEdge; //edge from row to column in adjMat

    for(int row=0; row<nVerts; row++)
      {
        isEdge = false; //check edges
        for(in col = 0; col<nVerts; col++)
        {
          if(adjMat[row][col] > 0)
          {
            isEdge = true;
            break;
          }
        }
      if(!isEdge) //if no edges
        return row;
      }
      return -1
  } //end noSuccessors()

class TopoApp
{

pulic static void main(String[] args)
  {
    Graph theGraph = new Graph()
    theGraph.addVertex('A');
    theGraph.addVertex('B');
    theGraph.addVertex('C');
    theGraph.addVertex('D');
    theGraph.addVertex('E');
    theGraph.addVertex('F');
    theGraph.addVertex('G');
    theGraph.addVertex('H');

    theGraph.addEdge(0,3);
    theGraph.addEdge(0,4);
    theGraph.addEdge(1,4);
    theGraph.addEdge(2,5);
    theGraph.addEdge(3,6);
    theGraph.addEdge(4,6);
    theGraph.addEdge(5,7);
    theGraph.addEdge(6,7);

    theGraph.topo();
  }//end main()
}
