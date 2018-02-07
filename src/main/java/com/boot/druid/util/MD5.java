package com.boot.druid.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String md5s(String plainText) {
		String str = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuilder buf = new StringBuilder("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			str = buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static void main(String agrs[]) {
		System.out.println(MD5.md5s("1"));// 加密4
	}
}
