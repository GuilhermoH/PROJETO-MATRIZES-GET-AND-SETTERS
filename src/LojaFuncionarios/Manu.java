package LojaFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manu {

	public static void main(String[] args) {
		int i=0;
		List<Logic>list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Bem vindo ao programa de logistica!");
		System.out.print("Qual o nome de sua loja?");
		String nomeLoja=sc.nextLine();
		System.out.println("REGISTRO ABAIXO!");
		System.out.print("Quantos funcionários essa empresa tem?");
	    int quantidadeFun=sc.nextInt();
		while(i<quantidadeFun) {
			System.out.print("Diga o ID de seu novo funcionário:");
			int idNew=sc.nextInt();
			sc.nextLine();
			System.out.print("Diga o nome do Funcionário:");
			String nome=sc.nextLine();
			System.out.print("Diga o salário do Funcionário:");
			int salario=sc.nextInt();
			Logic x= new Logic(idNew,nome,salario);
			list.add(x);
			i++;
		}
			System.out.println("Armazenado no sistema!");
			System.out.println("1=VISUALIZAR LISTA----- 2 = AUMENTAR SALARIO-----3=FINALIZAR");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				for(Logic y:list) {
					System.out.println("ID   "+ y.getId());
					System.out.println("NAME    "+y.getName());
					System.out.println("SALARY   "+y.getSalary());
					System.out.println("--------------------");
					i++;
					
				}
			case 2:
				System.out.println("Digite o ID do Funcionário:");
				int idSeach=sc.nextInt();
				Integer loc=hasId(list,idSeach);
				if(loc==null) {
					System.out.println("ID NÃO ENCONTRADO");
				}
				else {
					System.out.println("ID ENCONTRADO DIGA QUANTOS % VOCÊ QUER AUMENTAR DO SALÁRIO");
					int porcent=sc.nextInt();
					list.get(loc).increaseSalary(porcent);
					for(Logic y:list) {
						System.out.println("ID   "+ y.getId());
						System.out.println("NAME    "+y.getName());
						System.out.println("SALARY   "+y.getSalary());
						System.out.println("--------------------");
					
					
				}
				
				
				
				
			
			
			}}}
		
	


	public static Integer hasId(List<Logic>list,int id) {
	   for(int i=0;i<list.size();i++) {
		   if (list.get(i).getId()==id) {
			   return i;
		   } 
		   }
	   return null;
}}


	
	
