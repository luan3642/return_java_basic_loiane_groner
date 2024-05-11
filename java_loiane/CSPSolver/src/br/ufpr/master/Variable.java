package br.ufpr.master;
import java.util.List;


public class Variable {
	private String name;
	private List<Integer> domain;
	
	public Variable(String name, List<Integer> domain) {
		this.name = name;
		this.domain = domain;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Integer> getDomain(){
		return domain;
	}
	
	public void setDomain(List<Integer> domain) {
		this.domain = domain;
	}
}
