package InterviewQuestions;

public class String_PasswordValidation
{
    //1. Write a return method that can verify if a password is valid or not
    // requirements:
    // 1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
    
    public static void main(String[] args)
    {
        System.out.println(passwordValidation("SERHaT.123"));
    }
    
    //My code
    public static boolean passwordValidation(String password)
    {
        String[] passwordarr = password.split("");
        if(password.length() >= 6 && !password.contains(" "))
        {
            int countup = 0;
            for(String each : passwordarr)
            {
                if(!each.equals(each.toUpperCase()))
                {
                    countup++;
                }
            }
            
            if(countup > 0)
            {
                int countlow = 0;
                for(String each : passwordarr)
                {
                    if(!each.equals(each.toLowerCase()))
                    {
                        countlow++;
                    }
                }
                
                if(countlow > 0)
                {
                    String spechar = "!\"#$%&'()*+,-./:;<=>?@[\\]^_{|}~";
                    String[] arrspec = spechar.split("");
                    int countspec = 0;
                    
                    for(String s : passwordarr)
                    {
                        for(String value : arrspec)
                        {
                            if(s.equals(value))
                            {
                                countspec++;
                            }
                        }
                    }
                    
                    if(countspec > 0)
                    {
                        int countdig = 0;
                        for(String each : passwordarr)
                        {
                            for(int i = 0; i < 10; i++)
                            {
                                if(each.equals(""+i))
                                {
                                    countdig++;
                                }
                            }
                        }
                        
                        if(countdig > 0)
                        {
                            return true;
                        }
                        else return false;
                    }
                    else return false;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }
    
    public static boolean PassWordvalidation(String password)
    {
        
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";
        
        
        boolean HasLower = password.matches(lowercase),
                
                HasUppere = password.matches(uppercase),
                
                HasDigits = password.matches(numbers),
                
                HasSpecial = password.matches(specialchars),
                
                Valid = false;
        
        
        if(password.length() >= 6 && !password.contains(" "))
            
            if(HasLower && HasUppere && HasDigits && HasSpecial)
                
                Valid = true;
        
        return Valid;
        
    }
}
