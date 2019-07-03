package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

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

            // go !
        	
        	
        	Items i1 = new Items(1,"Casaco","adulto","masculino",(float)40.00, 0, 0);
        	Items i2 = new Items(2,"Sapatos","adulto","feminino",(float)50.00, 25, 6);
        	Items i3 = new Items(3,"Ténis","adulto","masculino",(float)60.00, 12, 7);
        	Items i4 = new Items(4,"Camisa","criança","ambos",(float)70.00, 3, 0);
        	Items i5 = new Items(5,"Camisola","adulto","masculino",(float)70.00, 14, 0);
        	Items i6 = new Items(6,"Meias de Vidro","adulto","feminino",(float)15.00, 35, 2);
        	Items i7 = new Items(7,"Meias","adulto","masculino",(float)10.00, 27, 3);
        	Items i8 = new Items(8,"Camisola Papa","criança","ambos",(float)15.00, 27, 0);
        	Items i9 = new Items(9,"Camisola Mamã","criança","ambos",(float)15.00, 27, 0);
        	Items i10 = new Items(10,"Casaco","adulto","feminino",(float)40.00, 15, 0);
        	kSession.insert(i1);
        	kSession.insert(i2);
        	kSession.insert(i3);
        	kSession.insert(i4);
        	kSession.insert(i5);
        	kSession.insert(i6);
        	kSession.insert(i7);
        	kSession.insert(i8);
        	kSession.insert(i9);
        	kSession.insert(i10);
        	
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
