package test1;

import java.util.Scanner;

public class Array {
	public static void main(String[] args){
	int [][]table= {
	{1,2,3,4},
	{5,6,7,8},
	{9,10,11,12},
	{13,14,15,16}
	};
	
	while(true){
	for(int i=0;i<table.length;i++){
		for(int j=0;j<table.length;j++){
			System.out.print(table[i][j]+" ");
		}
	System.out.println();
	}
	
	System.out.println("1: 좌 , 2: 우, 3: 위, 4:아래 ");
	System.out.println("입력 : ");
	Scanner s = new Scanner(System.in);
	int i=s.nextInt();
	
	
	}
	
	
	
	}
	public void shift(int index) {
        for(int i=index; i<count-1; i++)
            arr[i] = arr[i+1];
    }
}
