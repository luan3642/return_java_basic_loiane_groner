package br.ufpr.master;

import java.io.IOException;
import java.util.*;
import br.ufpr.master.*;

public class CspSolverMain {
	private List<Constraint> constraints = new ArrayList<>();
	private List<Variable> variables = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Input input = new Input();
		input.lerArquivo();

		CspSolverMain cspSolverMain = new CspSolverMain();

	}

	
	public boolean backtrackValid(Map<Variable, Integer> assigment) {
			if (isComplete(assigment)) {
				return true;
			}
			Variable var = selectUnassignedVariable(assigment);
			
		}

	public boolean isComplete(Map<Variable, Integer> assigment) {
			return assigment.size() == variables.size();
	}

	private Variable selectUnassignedVariable(Map<Variable, Integer> assignment) {
		for(Variable var: variables) {
			if(!assigment.containsKey(var)) {
				return var
				}
			}
		}
}
