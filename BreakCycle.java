//ѭ�����жϣ������������ѭ����Ҳ�������ж�һ��
public class BreakCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] array = new String[]{"a","s","d","f","b","q",
//				"w","e","r","b","r","t","y","b"};
//		System.out.println("tell me before \"b\":");
//		for(String string:array){
//			if(string=="t"){
//				break;
//			}
//			System.out.print(string);
//		}
		
//break double cycle example
		
		int[][] array = new int[][]{
			{1,2,3,4,5,6},{7,8,9,0},{12,13,14}
		};
		System.out.println("С�ڶ��ٻ��ߴ��ڶ��ٶ����������");
		Nov1:for(int[] e:array){
			
			for(int e1:e){
				System.out.print(e1);
				if(e1==0){
					System.out.println("break");
					break Nov1;
				}
				
			}
			System.out.println();
		}
	}

}
