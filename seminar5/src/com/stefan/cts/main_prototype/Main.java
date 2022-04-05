package com.stefan.cts.main_prototype;

import com.stefan.cts.prototype.Autobuz;
import com.stefan.cts.prototype.MijlocTransport;

public class Main {
    public static void main(String[] args)  {
        MijlocTransport autobuz = new Autobuz("Dorian");
        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            System.out.println(autobuz);
            System.out.println(autobuz1);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
