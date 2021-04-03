public class Palindrome{
    public static boolean is_palindrome(String s)
    {
        // add your code here


      String rvr = ""; // Objects of String class  
      int length = s.length();   
      for ( int i = length - 1; i >= 1; i-- )  
          // I have a question : one letter is missing when I run is_palindrome function
          /*
          //  when I run test
           java Principal kelek 
          // I get this result
          rvr : kele
          ----------------------------------------------------
          Input : kelek >>> Output : false
          ----------------------------------------------------
          */

         rvr = rvr + s.charAt(i);  
         System.out.println ( "rvr : " + rvr ) ;
      if (s.equals(rvr))  
         return true;  
      else  
         return false;
      
    }
}
