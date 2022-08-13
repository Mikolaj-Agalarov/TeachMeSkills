package Lesson11;

public class LoginChecker {
    public static boolean checkLogin(String login) throws WrongLoginException
    {
        char[] loginAsCharacters = login.toCharArray();
        boolean containsNumber = false;
        for (int i = 0; i < loginAsCharacters.length; i++)
        {
            if (Character.isDigit(loginAsCharacters[i]))
            {
                containsNumber = true;
            }
        }
        if ((login.length() < 20) && !login.contains(" ") && containsNumber)
        {
            System.out.println("login is ok");
          return true;
        } else
        {
            throw new WrongLoginException();
        }
    }

    public static boolean passwordChecker(String password, String confirmPassword) throws WrongPasswordException
    {
        char[] passwordAsCharacters = password.toCharArray();
        boolean containsNumber = false;
        for (int i = 0; i < passwordAsCharacters.length; i++)
        {
            if (Character.isDigit(passwordAsCharacters[i]))
            {
                containsNumber = true;
            }
        }
        if ((password.length() < 20) && !password.contains(" ") && containsNumber && password.equals(confirmPassword))
        {
            System.out.println("password is ok");
            return true;
        } else
        {
            throw new WrongPasswordException();
        }
    }
}
