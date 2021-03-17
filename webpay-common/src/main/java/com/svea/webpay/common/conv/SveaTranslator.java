package com.svea.webpay.common.conv;

import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class used to translate different terms and other labels / etc.
 * 
 * @author Daniel Tamm
 *
 */
public class SveaTranslator {
		
	private static Logger log = LoggerFactory.getLogger(SveaTranslator.class);
	
	public static final String SVEA_TRANSLATIONS_LABEL = "SveaTranslations";
	
	public static Locale[] supportedLocales = {
			Locale.ENGLISH,
			new Locale("sv")
	};

	private static Map<String, ResourceBundle> bundles;
	private static ResourceBundle defaultBundle;
	
	static {
		
		bundles = new TreeMap<String, ResourceBundle>();
		ResourceBundle b;
		for (Locale loc : supportedLocales) {
			
			try {
				b = ResourceBundle.getBundle(SVEA_TRANSLATIONS_LABEL, loc);
				if (b!=null && b.getLocale().getLanguage().equals(loc.getLanguage())) {
					bundles.put(loc.getISO3Language(), b);
				}
			} catch (MissingResourceException mre) {
				System.out.println(mre.getClassName());
			}
			
		}

		try {
			defaultBundle = ResourceBundle.getBundle(SVEA_TRANSLATIONS_LABEL);
		} catch (MissingResourceException mre) {
			System.out.println(mre.getClassName());
		}
		
	}


	/**
	 * Returns a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to
	 * @return			A translation. If no translation is available the label itself is returned.
	 */
	public static String getTranslation(String label, String lang) {

		return getTranslation(label, lang, false);
		
	}
	
	/**
	 * Returns a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to
	 * @param capitalizeFirstLetter	Capitalize first letter.
	 * 
	 * @return			A translation. If no translation is available the label itself is returned.
	 */
	public static String getTranslation(String label, String lang, boolean capitalizeFirstLetter) {
		
		// Locate the bundle
		ResourceBundle b = bundles.get(lang);
		if(b == null) {
			if(defaultBundle == null){
				return label;
			}else{
				b = defaultBundle;
			}
		}
		String translation = null;
		try {
			translation = b.getString(label);
		} catch (MissingResourceException me) {
			log.warn(String.format("Resource %s could not be found", label), me);
			translation = label;
		}
		if (capitalizeFirstLetter) {
			translation = capitalizeFirstLetter(translation);
		}
		
		return translation;
		
	}

	/**
	 * Capitalizes first letter of a text.
	 * 
	 * @param text		The text.
	 * @return			The text with the first letter as a capital letter.
	 */
	public static String capitalizeFirstLetter(String text) {
		if (text==null) return null;
		StringBuffer sb = new StringBuffer(text);
		sb.replace(0, 1, text.substring(0, 1).toUpperCase());
		return sb.toString();
	}
	
	
	
}
