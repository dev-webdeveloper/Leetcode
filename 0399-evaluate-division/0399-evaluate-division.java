class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
         // Build a graph representation of the equations and values.
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);

        // Initialize an array to store the results for each query.
        double[] results = new double[queries.size()];

        // Iterate through each query and perform depth-first search (DFS) to find the result.
        for (int i = 0; i < queries.size(); i++) {
            
            List<String> query = queries.get(i);
            
            String start = query.get(0);
            
            String end = query.get(1);
            
            results[i] = dfs(graph, start, end, new HashMap<>());
        }

        // Return the array of results for all queries.
        return results;
    }

    // Helper method to build a graph from the given equations and values.
    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        
        // Initialize a map to represent the graph.
        Map<String, Map<String, Double>> graph = new HashMap<>();

        // Iterate through each equation and populate the graph.
        for (int i = 0; i < equations.size(); i++) {
            
            List<String> equation = equations.get(i);
            
            String from = equation.get(0);
            
            String to = equation.get(1);
            
            double value = values[i];

            // Create nodes if not present in the graph.
            graph.putIfAbsent(from, new HashMap<>());
            graph.putIfAbsent(to, new HashMap<>());
            

            // Add directed edges with corresponding values.
            graph.get(from).put(to, value);
            
            graph.get(to).put(from, 1.0 / value); // Add reciprocal edge.
        }

        // Return the built graph.
        return graph;
        
    }

    // Helper method to perform depth-first search (DFS) to find the result for a query.
    private double dfs(Map<String, Map<String, Double>> graph, String start, String end, Map<String, Boolean> visited) {
        
        // Check if the graph does not contain start or end nodes.
        if (!graph.containsKey(start) || !graph.containsKey(end))
            
            return -1.0;

        // Check if the start and end nodes are the same.
        if (start.equals(end))
            
            return 1.0;

        // Mark the current node as visited.
        visited.put(start, true);
        
        double result = -1.0;

        // Explore neighbors using DFS.
        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
            
            if (!visited.getOrDefault(neighbor.getKey(), false)) {
                
                double subResult = dfs(graph, neighbor.getKey(), end, visited);
                
                // If a valid result is found, calculate the overall result.
                if (subResult != -1.0) {
                    
                    result = neighbor.getValue() * subResult;
                    
                    break;
                }
            }
        }

        // Mark the current node as not visited to backtrack.
        visited.put(start, false);
        
        // Return the final result for the query.
        return result;
    }
}