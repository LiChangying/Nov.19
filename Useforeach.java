import java.util.*;
public class Useforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();//����List����
		list.add("abc");
		list.add("del");
		list.add("qwe");
		list.add("zxc");
		list.add("nop");
		list.add("no");
		System.out.println("foreach��������");
		for(String string:list){
			System.out.print(string);
		}
		System.out.println();
		String[] str = new String[list.size()];//��������
		//for(int i=0;i<str.length;i++){
		//	System.out.print(str[i]+"\t");
		//}����toArray������
		list.toArray(str);
		System.out.println("foreach��������");
		for(String string:str){
			System.out.print(string);
		}
	}

}
