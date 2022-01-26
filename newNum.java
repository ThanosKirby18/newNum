
public class newNum {

    public static String answer(String input) {
        String changedNum = "";
        boolean isTeen = false;
        if(input.length() == 3)
        {
            changedNum += firstDigit(input.charAt(0), false) + " hundred, ";
        }
        if(input.length() >= 2 && input.charAt(input.length()-2) == '1')
        {
               changedNum += teen(input.charAt(input.length()-1));
               isTeen = true;
         }
        else
        {
        for (int i = 0; i <= input.length()-1; i++) {
 
            if (input.length() >= 2 && i == input.length()-2)
            {
                changedNum += secDigit(input.charAt(i));
            }
           
            if (input.length() == 1){
               changedNum = "";
            }// end if 
            if (i == input.length()-1){
            changedNum += firstDigit(input.charAt(i), isTeen);
            }
        }//end of for loop
        }
        return changedNum;
     
      
    }// end of public string
  public static String teen(char c)
        {
            if (c == '9')
            {
                 return "nineteen";
            }
             else if (c == '1')
            {
                return "eleven";
            }
            else if (c == '2')
            {
                return "twelve";
            }
            
            else if (c == '3')
            {
                return "thirteen";
            }
            
            else if (c == '4')
            {
                return "fourteen";
            }
            else if (c == '5')
            {
                return "fifteen";
            }
            else if (c == '6')
            {
                return "sixteen";
            }
            else if (c == '7')
            {
                return "seventeen";
            }
            else if (c == '8')
            {
                return "eighteen";
            }// end of else if 
            else if (c == '0')
            {
                return "ten";
            }// end of else if 
      return "";
        }
            public static String secDigit(char c)
        {
            if(c=='9')
            {   
            return "ninty, ";
            }
            else if(c == '8')
            {
                return "eighty, ";
            }
            else if(c == '7')
            {
                return "seventy, ";
            }
            else if(c == '6')
            {
                return "sixty, ";
            }
            else if(c == '5')
            {
                return "fifty, ";
            }
            else if(c == '4')
            {
                return "forty, ";
            }
            else if(c == '3')
            {
                return "thirty, ";
            }
            else if(c == '2')
            {
                return "twenty, ";
            }
            else if(c == '1')
            {
                return "";
            }
                return "";
        }
            public static String firstDigit(char c, boolean isTeen)
        {
        if (isTeen == false){
            if (c == '9')
            {
                 return "nine";
            }
             else if (c == '1')
            {
                return "one";
            }
            else if (c == '2')
            {
                return "two";
            }
            
            else if (c == '3')
            {
                return "three";
            }
            
            else if (c == '4')
            {
                return "four";
            }
            else if (c == '5')
            {
                return "five";
            }
            else if (c == '6')
            {
                return "six";
            }
            else if (c == '7')
            {
                return "seven";
            }
            else if (c == '8')
            {
                return "eight";
            }// end of else if
        }
          return "";
          }
} // end of new num.
