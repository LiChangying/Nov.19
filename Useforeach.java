import java.util.*;
public class Useforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();//创建List集合
		list.add("abc");
		list.add("del");
		list.add("qwe");
		list.add("zxc");
		list.add("nop");
		list.add("no");
		System.out.println("foreach遍历集合");
		for(String string:list){
			System.out.print(string);
		}
		System.out.println();
		String[] str = new String[list.size()];//创建数组
		//for(int i=0;i<str.length;i++){
		//	System.out.print(str[i]+"\t");
		//}看看toArray的作用
		list.toArray(str);
		System.out.println("foreach遍历数组");
		for(String string:str){
			System.out.print(string);
		}
	}

}
