import java.util.ArrayList;

public class Player
{
    private String firstName;
    private String lastName;
    private ArrayList<NSF> NSFs;

    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        NSFs = new ArrayList<NSF>();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public ArrayList<NSF> getNSFs()
    {
        return NSFs;
    }

    public void setNSFs(ArrayList<NSF> NSFs)
    {
        this.NSFs = NSFs;
    }

    @Override
    public String toString()
    {
        String fullName;
        fullName = firstName + " " + lastName;

        return fullName;
    }

    public void listPlayerNSFs()
    {
        System.out.println();//use TBD toString method in
    }

    public void addNSF(NSF nsf)
    {
        NSFs.add(nsf);
    }
}
