package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.util.Scanner;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	String s;

            // go !
        	Clientes c1 = new Clientes("joao","masculino","solteiro",false);
        	kSession.insert(c1 );
        	
        	Items i1 = new Items(1,"casaco","adulto","masculino",(float)39.99, 15);
        	Items i2 = new Items(2,"sapatos","adulto","feminino",(float)50.00, 25);
        	Items i3 = new Items(3,"camisa","criança","-",(float)70.00, 3);
        	kSession.insert(i3);
        	kSession.insert(i2);
        	kSession.insert(i1);
        	
        	        	
        	
        	
        	//criar fatura nova
        	Fatura f = new Fatura(0,0);
        	kSession.insert(f);
        	
        	
        	
        	
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
