package Tasks.Abstraction.Task03;

public class Main
{
    public static void main(String[] args)
    {
        ChromeBrowser chrome = new ChromeBrowser("Chrome Browser");
        chrome.get("www.google.com");
        chrome.maximize();
        chrome.close();

        FireFoxBrowser firefox = new FireFoxBrowser("Firefox Browser");
        firefox.get("www.cybertekschool.com");
        firefox.maximize();
        firefox.close();

        OperaBrowser opera = new OperaBrowser("Opera Browser");
        opera.get("www.youtube.com");
        opera.maximize();
        opera.close();
    }
}

abstract class Browser
{
    String browserName;

    public Browser(String browserName)
    {
        this.browserName = browserName;
    }

    public abstract void get(String url);

    public abstract void close();

    public abstract void maximize();
}

class ChromeBrowser extends Browser
{

    public ChromeBrowser(String browserName)
    {
        super(browserName);
    }

    @Override
    public void get(String url)
    {
        System.out.println(browserName+" is opening \""+url+"\".");
    }

    @Override
    public void close()
    {
        System.out.println(browserName+" is closed.");
    }

    @Override
    public void maximize()
    {
        System.out.println(browserName+" is maximized.");
    }
}

class FireFoxBrowser extends Browser
{
    public FireFoxBrowser(String browserName)
    {
        super(browserName);
    }

    @Override
    public void get(String url)
    {
        System.out.println(browserName+" is opening \""+url+"\".");
    }

    @Override
    public void close()
    {
        System.out.println(browserName+" is closed.");
    }

    @Override
    public void maximize()
    {
        System.out.println(browserName+" is maximized.");
    }
}

class OperaBrowser extends Browser
{
    public OperaBrowser(String browserName)
    {
        super(browserName);
    }

    @Override
    public void get(String url)
    {
        System.out.println(browserName+" is opening \""+url+"\".");
    }

    @Override
    public void close()
    {
        System.out.println(browserName+" is closed.");
    }

    @Override
    public void maximize()
    {
        System.out.println(browserName+" is maximized.");
    }
}
