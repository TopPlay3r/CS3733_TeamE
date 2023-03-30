import java.util.List;

public class IOC
{
    private String name;

    protected IOC(String n)
    {
        name = n;
    }

    protected String getName()
    {
        return name;
    }

    protected void setName(String name)
    {
        this.name = name;
    }


}
