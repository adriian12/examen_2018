package org.foobarspam.pigcoin;
import java.security.PublicKey;

public class Transaction {
	private int hash = 0;
	private int prev_hash = 0;
	private PublicKey[] pKey_sender; 
	private PublicKey[] pKey_recipient;
	private int pigcoins = 0;
	private String message = "";
//	private byte[] signature = new byte[(int) message.length()];
	
	
	public Transaction(int prev_hash, PublicKey[] pKey_sender, PublicKey[] pKey_recipient, int pigcoins, String message) {
		this.setHash(hash);
		this.prev_hash = prev_hash;
		this.pKey_sender = pKey_sender;
		this.pKey_recipient = pKey_recipient;
		this.pigcoins = pigcoins;
		this.message = message;
	}


	public int getPrev_hash() {
		return prev_hash;
	}

	public PublicKey[] getpKey_sender() {
		return pKey_sender;
	}

	public PublicKey[] getpKey_recipient() {
		return pKey_recipient;
	}

	public int getPigcoins() {
		return pigcoins;
	}

	public String getMessage() {
		return message;
	}

	public byte[] getSignature() {
		return signature;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}
	
}


























/*private int id = 0;
private String direccion = "";
private int numeroAnclajes = 0;
private Bicicleta[] anclajes;

//constructor
public Estacion(int id, String direccion, int numeroAnclaje) {
	this.id = id;
	this.direccion = direccion;
	this.numeroAnclajes = numeroAnclaje;
	this.anclajes =  new Bicicleta[numeroAnclajes];
}
*/


/*public PrivateKey getPrivateKey(String filename) throws Exception {

    File f = new File(filename);
    FileInputStream fis = new FileInputStream(f);
    DataInputStream dis = new DataInputStream(fis);
    byte[] keyBytes = new byte[(int) f.length()];
    dis.readFully(keyBytes);
    dis.close();
    PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
    KeyFactory kf =
            KeyFactory.getInstance("RSA");
    return kf.generatePrivate(spec);
}



public class PrivateKeyReader {

	  public static PrivateKey get(String filename)
	  throws Exception {

	    byte[] keyBytes = Files.readAllBytes(Paths.get(filename));

	    PKCS8EncodedKeySpec spec =
	      new PKCS8EncodedKeySpec(keyBytes);
	    KeyFactory kf = KeyFactory.getInstance("RSA");
	    return kf.generatePrivate(spec);
	  }
	}

import java.io.*;
import java.nio.*;
import java.security.*;
import java.security.spec.*;

public class PublicKeyReader {

  public static PublicKey get(String filename)
    throws Exception {

    byte[] keyBytes = Files.readAllBytes(Paths.get(filename));

    X509EncodedKeySpec spec =
      new X509EncodedKeySpec(keyBytes);
    KeyFactory kf = KeyFactory.getInstance("RSA");
    return kf.generatePublic(spec);
  }
}





*/