package com.estafet.demo.commons.lib.wallet;

import static org.junit.Assert.*;

import org.junit.Test;

public class WalletUtilsTest {

	@Test
	public void testGenerateWalletAddressNotNull() {
		String address1 = WalletUtils.generateWalletAddress();
		assertNotNull(address1);
	}
	
	@Test
	public void testGenerateWalletAddressUnique() {
		String address1 = WalletUtils.generateWalletAddress();
		String address2 = WalletUtils.generateWalletAddress();
		assertNotEquals(address1, address2);
	}
}
