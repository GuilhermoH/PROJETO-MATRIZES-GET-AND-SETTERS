package Matrizes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Diga o numero de linhas:");
		int l=sc.nextInt();
		System.out.print("Diga o numero de colunas:");
		int c=sc.nextInt();
		
		int[][]mat=new int[l][c];
		for(int w=0;w<l;w++) {
			for(int k=0;k<c;k++) {
				mat[w][k]=sc.nextInt();
			}
		}
		System.out.println("Diga a posição começando pela linha depois as colunas");
		System.out.print("Linha:");
		int linha=sc.nextInt();
		System.out.print("Coluna");
		int coluna=sc.nextInt();
		System.out.println("ESQUERDA=  "+mat[linha][coluna-1]);
		System.out.println("DIREITA=   "+mat[linha][coluna+1]);
		System.out.println(" ABAIXO=   "+ mat[linha+1][coluna]);
		
		
		
			}

	}

