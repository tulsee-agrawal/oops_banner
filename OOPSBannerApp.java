/**
*@author Developer
*@version 8.0
*/
import java.util.*;
public class OOPSBannerApp{
	public static HashMap<Character,String[]> create(){
		HashMap<Character,String[]> cm=new HashMap<>();
		cm.put('O',new String[]{
			"  ***   ",
			" **  ** ",
			"**    **",
			"**    **",
			"**    **",
			"**    **",
			" **  ** ",
			"  ***   "
		});
		cm.put('P',new String[]{
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"**   **  ",
			"******   ",
			"**       ",
			"**       ",
		});
		cm.put('S',new String[]{
			"    ****",
			"   **",
			"  **",
			"    **",
			"      **",
			"    **",
			"   **",
			"****"
		});
		return cm;
	}
	public static void displayBanner(String msg,HashMap<Character,String[]> cm){
	int plen=cm.get('O').length;
	for(int i=0;i<plen;i++){
		StringBuilder sb=new StringBuilder();
		for(char ch :msg.toCharArray()){
			String[] pattern=cm.get(ch);
			sb.append(pattern[i]).append(" ");
		}
		System.out.println(sb.toString());
		
	}
	}
	

public static void main(String[] args)

	{
	HashMap<Character,String[]> cm=create();
	String msg="OOPS";
	displayBanner(msg,cm);
	}
}