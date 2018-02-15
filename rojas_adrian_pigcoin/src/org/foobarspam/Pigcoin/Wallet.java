package org.foobarspam.Pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Wallet {
	//attributes
	private PublicKey address = null;
	private PrivateKey sKey = null;
	private double total_input = 0d;
	private double total_output = 0d;
	private double balance = 0d;	
	private ArrayList<Transaction> inputTransactions = new ArrayList<Transaction>();
	private ArrayList<Transaction> outputTransactions = new ArrayList<Transaction>();
	
	//constructor
	public Wallet() {
		
	}

	//getters & setters generados
	public ArrayList<Transaction> getInputTransactions(){
		return this.inputTransactions;
	}
	public ArrayList<Transaction> getOutputTransactions() {
		return this.outputTransactions;
	}
	public void setSK(PrivateKey privateKey) {
		this.setsKey(privateKey);		
	}
	public void setAddress(PublicKey publicKey) {
		this.address = publicKey;
	}
	public PublicKey getAddress() {
		return this.address;
	}
	public double getTotalInput() {
		return this.total_input;
	}
	public double getTotalOutput() {
		return this.total_output;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setTotalInput(double input) {
		this.total_input += input;
	}
	public void setTotalOutput(double output) {
		this.total_output += output;
	}
	
	public PrivateKey getsKey() {
		return sKey;
	}

	public void setsKey(PrivateKey sKey) {
		this.sKey = sKey;
	}

	
	//methods
	public void generateKeyPair() {
		KeyPair pair = GenSig.generateKeyPair();
		setSK(pair.getPrivate());
		setAddress(pair.getPublic());
	}
	
	public String toString() {
		String message = " Wallet: " + getAddress().hashCode() + "\n Total input: "+ getTotalInput();
		message += "\n Total output: " + getTotalOutput() + "\n Balance: " + getBalance() + "\n";
		return message;
	}

	public void loadCoins(BlockChain bChain) {
		Wallet wallet = null;
		for (Transaction transaction : bChain.getBlockChain()) {
			
			wallet = this;
			if(wallet.getAddress() == transaction.getpKeyRecipient()) 
				wallet.setTotalInput(transaction.getPigcoins());
			
			
			if(wallet.getAddress() == transaction.getpKeySender()) 
				wallet.setTotalOutput(transaction.getPigcoins());			
		}
		
		setBalance(wallet);
	}
	
	public void sendCoins(PublicKey pKey_recipient, double coins, String message, BlockChain bChain) {
		
	}
	
	// Recorremos el array list para mostrar la transaction
	public ArrayList<Transaction> discardOutputTransactions(){
		ArrayList<Transaction> newInputTransactions = new ArrayList<Transaction>();
		
		for (Transaction inputTransaction : getInputTransactions()) {
			Boolean found = false;
			
			for (Transaction outputTransaction : getOutputTransactions()) {
				if(inputTransaction == outputTransaction)
					found = true;
			}			
			if(!found)
				newInputTransactions.add(inputTransaction);
		}
		return newInputTransactions;
	}

	public void setBalance(Wallet wallet) {
		this.balance = getTotalInput() - getTotalOutput(); // no me ha pasado el caso test
	}

	public void loadInputTransactions(BlockChain bChain) {
		for (Transaction transaction : bChain.getBlockChain()) {
			
			if(this.getAddress() == transaction.getpKeyRecipient())
				getInputTransactions().add(transaction);
		}
	}

	public void loadOutputTransactions(BlockChain bChain) {
		for (Transaction transaction : bChain.getBlockChain()) {
			
			if(this.getAddress() == transaction.getpKeySender())
				getOutputTransactions().add(transaction);
		}
	}




	

}