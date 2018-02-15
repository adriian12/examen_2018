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
	byte[] address = null; //get private key
	byte[] sKey = null;
	public double total_input = 0;
	public double total_output = 0;
	public int balance = 0;
	

	public void setSK(PrivateKey private1) {
		address.hashCode();
	}

	public void setAddress(PublicKey public1) {
		sKey.hashCode();
	}

	public Object getAddress() {
		return null;
	}

	public void generateKeyPair() {
        KeyPair pair = GenSig.generateKeyPair();
        this.setSK(pair.getPrivate());
        this.setAddress(pair.getPublic());
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
	
		System.out.println(message);
	}

	public void sendCoins(Object address, Double pigcoins, String message, BlockChain bChain) {
		
		
	}


}
