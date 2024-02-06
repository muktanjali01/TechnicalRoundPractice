package practice;/*
Have the function LongestWord(sen) take the sen parameter being passed and return the
 longest word in the string. If there are two or more words that are the same length,
  return the first word from the string with that length. Ignore punctuation and assume 
  sen will not be empty. Words may also contain numbers, for example "Hello world123 567"*/
/*Have the function LongestWord(sen) take the sen parameter being passed 
 * and return the longest word in the string. If there are two or more words
 *  that are the same length, return the first word from the string 
 *  with that length. Ignore punctuation and assume sen will not be empty.
 *   Words may also contain numbers, for example "Hello world123 567"*/

public class LongestWord {

	public static String LongestWord(String sen)
	{
		String words[]=new String[10];
		String str="";
		int j=0;
		for(int i=0;i<sen.length();i++) 
		{
			char ch=sen.charAt(i);
			if(ch ==' ') {
				words[j]=str;
				str="";
				j++;
			}
			else {
				str+=sen.charAt(i);

			}
			words[j]=str;
			
		}
		String largest=words[0];
		for(int k=1;k<=j;k++) 
		{
			if(largest.length()<words[k].length()) {
				largest=words[k];
			}
		}
		return largest;
		
	}
	public static void main(String[] args) {
	
		String larg=LongestWord("hi i am rina");
		System.out.println(larg);
	}

}