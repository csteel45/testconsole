package com.tibco.naming;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TibcoCFLookup implements javax.naming.spi.InitialContextFactory {

    @SuppressWarnings("unchecked")
	public Context getInitialContext(Hashtable environment) {

        try {

            environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.tibco.tibjms.naming.TibjmsInitialContextFactory");

            Context ctx = new InitialContext(environment);

            return new TibcoContext(ctx);

        } catch (NamingException ne) {
            ne.printStackTrace();
            return null;
        }
    }
}
