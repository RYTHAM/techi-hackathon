 public static boolean isPalinDromePossible(Map<Character, Integer> freqMap) {
	        int countUneven = (int) freqMap.values().stream().filter(i -> i % 2 == 1).count();
	        return countUneven < 1;
	    }
	  
public static int lengthofPalindrome(String input1)
    {
	
	int maxLength = 0;

    
    for (int i = 0; i < input1.length() - 1; i++) {
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        
        for (int j = i ; j < input1.length(); j++) {

            
            char ch = input1.charAt(j);

           
            freqMap.compute(ch, (k, v) -> v == null ? 1 : v + 1);

           
            if (isPalinDromePossible(freqMap)) {
                int size = freqMap.values().stream().mapToInt(k -> k).sum();
                if (size > maxLength) {
                	maxLength = size;
                }

              
            }
        }

    }
	
	return maxLength; // return length of LPS
}
    