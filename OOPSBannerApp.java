/**
*@author Developer
*@version 7.0
*/
public class OOPSBannerApp{
	public static class CharacterPatternMap{
		public char ch;
		public String[] pattern;
		public CharacterPatternMap( char ch,String[] pattern){
			this.ch=ch;
			this.pattern=pattern;
		}
		public Character getCharacter(){
			return ch;
		}
		public String[] getPattern(){
			return pattern;
		}
	
	public static CharacterPatternMap[] createCharacterPatternMaps(){
		CharacterPatternMap[] cpm=new CharacterPatternMap[3];
		cpm[0]=new CharacterPatternMap('O', new String[]{
			"  ***   ",
			" **  ** ",
			"**    **",
			"**    **",
			"**    **",
			"**    **",
			" **  ** ",
			"  ***   "
		});
		cpm[1]=new CharacterPatternMap('P',new String[]{
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"**   **  ",
			"******   ",
			"**       ",
			"**       ",
		});
		cpm[2]=new CharacterPatternMap('S',new String[]{
			"    ****",
			"   **",
			"  **",
			"    **",
			"      **",
			"    **",
			"   **",
			"****"
		});
		return cpm;
		//CharacterPatternMap[3]=[' ',{}]
	}
	public static String[] getCharacterPattern(char ch,CharacterPatternMap[] cm){
		for(CharacterPatternMap m:cm){
		if(m.getCharacter()==ch){
			return m.getPattern();
		}
		}
		return null;
		
	}
	public static void printMsg(String msg,CharacterPatternMap[] cm){
		for(int i=0;i<8;i++){
		for(int j=0;j<msg.length();j++){
			String[] s=getCharacterPattern(msg.charAt(j),cm);
			System.out.print(s[i]+" ");
		}
		System.out.println();
		}
		
	}
	}

public static void main(String[] args)

	{
	
	CharacterPatternMap[] charMaps=CharacterPatternMap.createCharacterPatternMaps();
	String msg="OOPS";
	CharacterPatternMap.printMsg(msg,charMaps);
	}
}