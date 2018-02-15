package org.foobarspam.Pigcoin;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Map;

/**
 * @author Adrian
 *
 */

public class Wallet {
	byte[] address = generateKeyPair(); //get private key
	byte[] sKey = generateKeyPair();
	public int total_input = 0;
	public int total_output = 0;
	public int balance = 0;
	

	public void setSK(PrivateKey private1) {
		
		
	}

	public void setAddress(PublicKey public1) {
		
		
	}

	public Object getAddress() {
		
		return null;
	}

	public byte[] generateKeyPair() {
		try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyGen.initialize(1024, random);
            KeyPair pair = keyGen.generateKeyPair();
            return pair;
        
        } catch (Exception e) {
            return null;
        }

	}

	public void loadCoins(BlockChain bChain) {
		
		
	}

	public void loadInputTransactions(BlockChain bChain) {
		
		
	}

	public Object getInputTransactions() {
		
		return null;
	}

	public void loadOutputTransactions(BlockChain bChain) {
		
		
	}

	public Object getOutputTransactions() {
		
		return null;
	}

	public Map<String, Double> collectCoins(Double pigcoins) {
		
		return null;
	}

	public byte[] signTransaction(String message) {
		
		return null;
	}

	public void sendCoins(Object address, Double pigcoins, String message, BlockChain bChain) {
		
		
	}


}
