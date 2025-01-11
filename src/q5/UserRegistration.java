package day3_4.q5;

public class UserRegistration {
    private String username;
    private String userCountry;
    UserRegistration(String username, String userCountry)
    {
        this.username = username;
        this.userCountry = userCountry;
    }

    public void print()
    {
        System.out.println("User registration done successfully");
    }

    public void registerUser()
    {
        try {
            if(userCountry.equalsIgnoreCase("india"))
            {
                print();
            }
            else throw new InvalidCountryException("User Outside India cannot be registered");
        }
        finally {
            System.out.println("Exiting from the portal");
        }
    }
}
