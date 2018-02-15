package org.foobarspam.pigcoin;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;

public class Transaction {
	private int hash = 0;
	private int prev_hash = 0;
	private PublicKey pKey_sender = ""; 
	private PublicKey pKey_recipient = "";
	private int pigcoins = 0;
	private String message = "";
	private byte[] signature = new byte[(int) message.length()];
}




































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