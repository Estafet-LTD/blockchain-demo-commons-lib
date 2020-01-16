package com.estafet.demo.commons.lib.wallet;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.UUID;

import org.web3j.crypto.CipherException;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;
import org.web3j.crypto.Wallet;
import org.web3j.crypto.WalletFile;

public class WalletUtils {

	public static String generateWalletAddress() {
		try {
			String seed = UUID.randomUUID().toString();
			ECKeyPair ecKeyPair = Keys.createEcKeyPair();
			WalletFile aWallet = Wallet.createLight(seed, ecKeyPair);
			return "x0"+aWallet.getAddress();
		} catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException
				| CipherException e) {
			throw new RuntimeException(e);
		}
	}
	
}
