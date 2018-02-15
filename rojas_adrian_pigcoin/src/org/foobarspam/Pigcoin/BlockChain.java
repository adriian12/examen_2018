package org.foobarspam.Pigcoin;

/**
 * @author Adrian
 *
 */

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.util.ArrayList;

public class BlockChain {
	//attributes
	private ArrayList<Transaction> blockChain = new ArrayList<Transaction>();
	
	//constructor
	public BlockChain() {
		
	}	
	
	//getters & setters
	public ArrayList<Transaction> getBlockChain(){
		return blockChain;
	}
	
	//creamos el añadir desde el origen (codigo ayudado por David)
	public void addOrigin(Transaction transaction) {
		getBlockChain().add(transaction);		
	}
	
	public void summarize() {		
		for (Transaction transaction : getBlockChain()) 
			System.out.println(transaction.toString());		
	}

	public void summarize(Integer index) {
	    try {
	    	System.out.println(getBlockChain().get(index));
        } catch (Exception e) {
            System.out.println("El pigcoin no es correcto");;
        }		
	}
}
