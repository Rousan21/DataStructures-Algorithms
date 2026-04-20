class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
      "Liberal Arts", //vertix 0
      "Student Services", //vertix 1
      "Health Careers & Sciences", //vertix 2
      "Health Technologies Center", //vertix 3
      "Recreation Center", //vertix 4
      "Technology Learning Center", //vertix 5
      "Business & Technology", //vertix 6
      "Theatre", //vertix 7
    };

    // 2-Define Edges
    int[][] edges = {
      {0,7}, {0,1},
      {1,0}, {1, 2}, {1,5}, {1,6},
      {2,1}, {2,3}, {2,4},
      {3,2},
      {4,2}, {4,5},
      {5,1}, {5,6}, {5,4},
      {6,1}, {6,5}, {6,7},
      {7,0}, {7,6}
    };

    // 3. Create the graph (name "graph") using the vertices and edges
    Graph<String>graph = new UnweightedGraph<>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    
    System.out.println("The vertices are searched in this DFS order:");
    
    for (int i = 0; i < searchOrders.size(); i++)
    
    System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
      
    System.out.println();
  
    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    
    for (int i = 0; i < searchOrders.size(); i++)
    
    if (dfs.getParent(i) != -1)
    
    System.out.println("The parent of " + graph.getVertex(i) + " is " + graph.getVertex(dfs.getParent(i)));

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    dfs.printPath(3); // Health Technologies Center
    dfs.printPath(1); // Student Services
    dfs.printPath(4); // Recreation Center


    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    dfs.printTree();

  }
}