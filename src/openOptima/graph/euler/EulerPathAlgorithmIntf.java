/**
 * openOptima: framework and implementations for commonly used algorithms in Graph Theory
 * and Network Optimization in Operations Research.  Copyright (C) 2008 Yaxiong Lin
 * 
 * This library is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU Lesser General Public License as published by the Free Software 
 * Foundation; either version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with 
 * this library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, 
 * Suite 330, Boston, MA 02111-1307 USA 
 * 
 * @author Yaxiong Lin
 * @version 1.0
 * 
 */
package openOptima.graph.euler;

import openOptima.NoSolutionException;
import openOptima.graph.Graph;

public interface EulerPathAlgorithmIntf {

	/**
	 * returns the euler path starting at fromNode_p
	 * @param startNode_p node id
	 * @return array of edges in sequence of the traverse of edges
	 * @throws NoSolutionException no solution
	 */
	public java.util.ArrayList getEulerPath (int startNode_p) throws NoSolutionException;

	/**
	 * Sets the graph for the algorithm.
	 * @param graphObj_p graph obj
	 */
	public void init (Graph graphObj_p);
	
	/**
	 * Returns true if this graph is an Eulerian graph.
	 * @return indicator
	 */
	public boolean isEulerian ();
}
