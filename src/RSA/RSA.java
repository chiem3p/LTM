package RSA;

import java.io.File;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSA {
        public static final String PUBLIC_KEY_FILE = "rsa_keypair/public_key.der";
	public static final String PRIVATE_KEY_FILE = "rsa_keypair/private_key.der";
	public static PrivateKey getPrivateKey() throws Exception {
		byte[] keyBytes = Files.readAllBytes(new File(PRIVATE_KEY_FILE).toPath());
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(spec);
	}

	public static PublicKey getPublicKey(String keyBytes) throws Exception {
            byte[] byteKey = Base64.getDecoder().decode(keyBytes);
            X509EncodedKeySpec X509publicKey = new X509EncodedKeySpec(byteKey);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            return kf.generatePublic(X509publicKey);
	}
}
