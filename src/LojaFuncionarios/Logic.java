package LojaFuncionarios;

public class Logic {
	private int id;
	private String name;
	private int salary;
	
	public Logic(int a,String b,int c) {
		id=a;
		name=b;
		salary=c;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void increaseSalary(int salario) {
		salary= salary+salary*salario/100;
	}

}
