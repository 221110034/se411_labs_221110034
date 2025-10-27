package edu.spu.se411.lab08_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.spu.se411.lab08_logging.exceptions.InsufficientFundsException;
import edu.spu.se411.lab08_logging.model.WalletAccount;

public class App {
	
	static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		
		logger.info("Application is starting...");
		
		WalletAccount account = new WalletAccount(1000);
		
		logger.info("Wallet account created...");
        try {
            account.withdraw(1500);
            
            logger.info("Withdrawing from account...");
            
        } catch (InsufficientFundsException e) {
        	
        	logger.info("InsufficientFundsException object created...");
        	
            System.out.println("Exception caught: " + e.getMessage());
            
            logger.info("Exception thrown...");
        }
        

        try {
            account.deposit(-100);
            
            logger.info("Depositing to account...");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
            
            logger.info("Exception thrown...");
        }
        
        logger.info("Application is Ending...");
        
	}

}
