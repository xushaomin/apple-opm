package com.appleframework.opm.open.manager;

import java.util.HashMap;
import java.util.Map;

import com.appleframework.rop.security.AppSecretManager;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @version 1.0
 */
public class SampleAppSecretManager implements AppSecretManager {

	private static Map<String, String> appKeySecretMap = new HashMap<String, String>();

	static {
		appKeySecretMap.put("jz-yaya", "jiuzhi");
	}

	public String getSecret(String appKey) {
		return appKeySecretMap.get(appKey);
	}

	public boolean isValidAppKey(String appKey) {
		return getSecret(appKey) != null;
	}
}
