package com.guoyang.proxy.rei;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by L'Accordeur on 2017/1/21.
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
