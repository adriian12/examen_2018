package org.foobarspam.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.Pigcoin.BlockChain;
import org.foobarspam.Pigcoin.Transaction;
import org.foobarspam.Pigcoin.Wallet;
import org.junit.Before;
import org.junit.Test;

public class BlockChainTest {
	private ArrayList<Transaction> blockChain = new ArrayList<Transaction>();	
	Transaction trx;
	BlockChain blockChainObject;
	
	@Before
	public void setUp() {
		Wallet wallet = new Wallet();   
		Wallet wallet2 = new Wallet();   
        wallet.generateKeyPair();
        wallet2.generateKeyPair();
        blockChainObject = new BlockChain();
        
        trx = new Transaction("hash_1", "0", wallet.getAddress(), wallet2.getAddress(), 20, "bacon eggs");
	}
	
	@Test // Conseguí que pasaran los casos test pero dejaron de funcionar
	public void addOriginTest() {
		blockChainObject.addOrigin(trx);
		
		assertNotEquals(0, blockChainObject.getBlockChain().size());
		assertEquals(1, blockChainObject.getBlockChain().size());
	}
	
	@Test
	public void summarize() {
		blockChainObject.addOrigin(trx);
		
		System.out.print("Datos de la imagen");
		blockChainObject.summarize(0);
	}
}
