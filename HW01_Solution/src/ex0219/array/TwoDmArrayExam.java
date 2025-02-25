package ex0219.array;

class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	private String [][] twoDmArray = new String [10][]; //열이 미완성 상태

	//메소드 make2DmArray
	public void make2DmArray(){

		//twoDmArray 배열에  값을 할당
		int len = twoDmArray.length; //행의길이 = 10
		
		for (int i = 0; i < len ; i++){
			 twoDmArray[i] = new String [i+1]; //각행의 열을 개수를 생성한다.
			 for(int j=0; j < twoDmArray[i].length ;j++) {
				 //값변경
				 twoDmArray[i][j]= (i+1)+"동"+(j+1)+"호";
			  System.out.print(twoDmArray[i][j]+"\t");
			 }
			 System.out.println();
		}
	}

		
		
	//메소드 print2DmArray
	
	/*public void print2DmArray(){
		//기존 배열의 열(j)을 행 방향으로 잡고 행(i)을 열 방향으로 잡아서 for문 돌림.  
       int len = twoDmArray.length; //행의길이
		for(int j = 0; j < len  ; j++){	 //10행 j= 0 1 2 3 4...9 
			for(int k = 0; k < j ; k++){//k=0 ~ 
				System.out.print("\t");
			}
			
			for(int i = j ; i < len ; i++){ //i의 시작이 0 , 1 , 2 ,3  / i는 1~9 , i는 2~9
				System.out.print(twoDmArray[i][j] +"\t");//i가 변경, j고정
			}
			
			System.out.println();
			
		}//outerForEnd
	}*/
	

	public void print2DmArray(){
		//기존 배열의 열(j)을 행 방향으로 잡고 행(i)을 열 방향으로 잡아서 for문 돌림.  
       int len = twoDmArray.length; //행의길이
	   String space="";
	   
		for(int j = 0; j < len  ; j++){	 //10행 j= 0 1 2 3 4 
			System.out.print(space);
			
			for(int i = j ; i < len ; i++){ //i의 시작이 0 , 1 , 2 ,3 
				System.out.print(twoDmArray[i][j] +"\t");
			}
	
	        space+="\t"; 
			System.out.println();
		}
	}
		
}

public class TwoDmArrayExam{
	//main메소드에서
	public static void main(String [] args){
		TwoDmArray tdArray = new TwoDmArray();
		tdArray.make2DmArray();
		
		System.out.println("****출력하기 *************");
		 tdArray.print2DmArray();
	}
}
