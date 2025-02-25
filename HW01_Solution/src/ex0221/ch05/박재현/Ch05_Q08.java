package ex0221.ch05.박재현;

public class Ch05_Q08 {
  //총점, 평균 = 총점 /수 
	public static void main(String[] args) {
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
			};
		
		int arrLength = 0; //수 
		int total =0;//총점
		
		for(int i=0; i< array.length;i++){
			for(int j=0;j<array[i].length ; j++){
				total+=array[i][j];
			}
		
			arrLength += array[i].length;
		}
		
		System.out.println (total);
		System.out.println (total/arrLength);

	}

}
