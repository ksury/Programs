package com.java.programs;

public class PascalTriangle {
	
	public static void main(String[] args){
		System.out.println("Pascal Triangle");
		int size=6;
		
		printPascal(size);
	}

	private static void printPascal(int size) {
		// TODO Auto-generated method stub
		int j=0,k=0;
		int[] arr= new int[size*2];
		int[] tempArr = new int[size*2];
		arr[0]=1;
		for(int i=0;i<=size;i++){
			for(int x=1;x<=size-i;x++){
				System.out.print("\t");
			}
			if(i==0){
/*				for(int x=1;x<=size;x++){
					System.out.print("\t");
				}*/
				System.out.print(arr[i]);
			}
			else if(i==1)
			{
/*				for(int x=1;x<=size-1;x++){
					System.out.print("\t");
				}*/
				tempArr[0]=arr[0];
				tempArr[1]=arr[0];
				System.out.print(arr[0]+"\t\t");
				System.out.print(arr[0]);
			}	
			else{
				tempArr[0]=arr[0];
				System.out.print(arr[0]+"\t\t");
				for(j=0;j<=arr.length;j++){
					if(arr[j+1]==0){
						break;
					}
					tempArr[j+1]=arr[j]+arr[j+1];
					System.out.print(tempArr[j+1]+"\t\t");
				}
				tempArr[j+1]=arr[0];
				System.out.print(arr[0]);
			}
			System.out.println("");
			arr=new int[size*2];
			arr=tempArr;
			tempArr = new int[size*2];
			arr[0]=1;
		}
		
	}

}
