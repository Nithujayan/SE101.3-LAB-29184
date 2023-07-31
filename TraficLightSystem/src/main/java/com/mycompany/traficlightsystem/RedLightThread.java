
package com.mycompany.traficlightsystem;
public class RedLightThread extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
        try
        {
                System.out.println("Red Light");
                Thread.sleep(5000);
            
        }
        catch(InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
        }
    }
}
