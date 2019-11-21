import java.util.Arrays;

public class Exercitii {
	
	//ex1
	public static void freq (String string) {
		String str = string.toLowerCase();
		 
		  int freqM = 0;
		  for (int i=0; i<str.length(); i++) {
		    if (Character.isWhitespace(str.charAt(i))) {
		      continue;
		    }		 
		    int chrF = 1;
		    for (int j=i+1; j<str.length(); j++) {
		      if (str.charAt(i) == str.charAt(j)) {
		        chrF++;
		      }
		    }
		    freqM = chrF > freqM ? chrF : freqM;
		  }
		 
		  for (int i=0; i<str.length(); i++) {
		    if (Character.isWhitespace(str.charAt(i))) {
		      continue;
		    }
		 
		    int charFreq = 1;
		    for (int j=i+1; j<str.length(); j++) {
		      if (str.charAt(i) == str.charAt(j)) {
		        charFreq++;
		      }
		    }
		    if (charFreq == freqM) {
		      System.out.println("Character '" + str.charAt(i) + 
		                          "' appears " + freqM + " times.");
		    }
		  }		
	}
	
	
	//ex2
	public static String filterLetters(String str) {
		  StringBuilder sB = new StringBuilder(str);
		  for(int i=0; i<sB.length(); i++) {
		    if(!Character.isLetter(sB.charAt(i))) {
		      sB.deleteCharAt(i);
		      i--;
		    }
		  }
		  return sB.toString();
	}
	
	public static boolean anagramSolver(String str1, String str2) {
		  
		  String str1F = filterLetters(str1);
		  String str2F = filterLetters(str2);
		 
		  
		  str1F = str1F.toLowerCase();
		  str2F = str2F.toLowerCase();		 
		  char[] str1Arr = str1F.toCharArray();
		  char[] str2Arr = str2F.toCharArray();		 
		  Arrays.sort(str1Arr);
		  Arrays.sort(str2Arr);		 
		  
		  return Arrays.equals(str1Arr, str2Arr);
		}
	
	
	
	//ex3
	
	public static int stringToNumber(String nr) {
		  char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		  int nrVal = 0;
		 
		  for (int i=0; i<nr.length(); i++) {
		    for (int j=0; j<digits.length; j++) {
		      if (nr.charAt(i) == digits[j]) {		        
		    	  nrVal = nrVal * 10 + j;
		      }
		    }
		  }
		 
		  return nrVal;
		}
	
	//ex 4
	
	public static String[] selectiveFilter(String[] words, String key, int mKey) {
		  String[] filteredWords = new String[words.length];
		  int size = 0;
		  key = key.toLowerCase();
		 
		  for (int i=0; i<words.length; i++) {
		    String crtWord = words[i].toLowerCase();
		    int minLength = Math.min(crtWord.length(), key.length());
		    int countMatches = 0;
		    for (int j=0; j<minLength; j++) {
		      if (crtWord.charAt(j) == key.charAt(j)) {
		        countMatches++;
		      }
		    }
		    if (countMatches >= mKey) {
		      filteredWords[size] = words[i]; 
		      size++;
		    }
		  }		 
		  
		  return Arrays.copyOf(filteredWords, size);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
