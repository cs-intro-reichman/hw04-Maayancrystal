public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase("   Intro to coMPUter sCiEnce "));
        
        //String string = "hello   World";
        //System.out.println(camelCase(string)); // “hEllO wOrld”;
        //System.out.println(capVowlesLowRest(“One two tHRee world”)); // “OnE twO thrEE wOrld”;
        //System.out.println(capVowlesLowRest(“vowels are fun”)); // “vOwEls ArE fUn”;
        //System.out.println(capVowlesLowRest(“intro”)); // “IntrO”;
        //System.out.println(capVowelsLowRest(“yellow”)); // “yEllOw”;
          
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for (int i = 0 ; i < string.length() ; i++){
            char ch = string.charAt(i);
            if(isVowel(ch) == true ){
                ch = (char)(ch - 32);
            }
            else{
                if (ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch + 32);
                  }
                  else{
                    ch = (char)(ch + 0);
                  }
            }
            newString = newString + ch;
        }
        return newString;
    }

    public static String camelCase (String string) {
        int spaceindex = string.length() + 1;
        String newString = "";
          for(int i = 0 ; i < string.length() ; i++){ //deletes all the spaces at the start of the string
            if(string.charAt(i) == ' '){
                spaceindex = i;     
            }
            else{
                break;
            }
          } 

          string = string.substring(spaceindex + 1); 
          spaceindex = string.length();
          if(string.indexOf(' ') >= 0){
            spaceindex = string.indexOf(' ');
          }

          for(int i = 0 ; i < spaceindex ; i++){ //changing the first word to lower case
            char ch = string.charAt(i);
            if( ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            newString = newString + ch;
          }

          boolean needC = true;
          string = string.substring(spaceindex) ;

          for (int i = 0; i < string.length() ; i++){ 
          char ch = string.charAt(i);
            if (ch == ' '){
            needC = true;  
            }
                else{
                     if (needC == true && ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
                    }
                    else{
                         if (needC == false && ch >= 'A' && ch <= 'Z'){
                         ch = (char)(ch + 32);
                        }
                     }
                needC = false;
                newString = newString + ch;
                }
            
            
          }

        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == chr){
                counter++;
            }
        }

        int[] arr = new int[counter];
        int index = 0;
        for (int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == chr){
                arr[index] = i;
                index++;
                
            }
        }
        return arr;
    }

    public static boolean isVowel (char ch) {
        boolean isVowel = false;
        switch (ch) {
            case 'a': 
                isVowel = true;
                break;
            case 'e': 
                isVowel = true;
                break;   
            case 'i': 
                isVowel = true;
                break; 
            case 'o': 
                isVowel = true;
                break; 
            case 'u': 
                isVowel = true;
                break;
        
        }
        return isVowel;
    }


}
