package junit.entity;

/**
 * Available types of products
 */
public enum ProductType {
	LOAN("LN"), KREDIT("KRD"), BANK_GUARANTEE("BG");

	private final String textValue;

	ProductType(final String textValue) {
		this.textValue = textValue;
	}

	@Override
	public String toString() {
		return textValue;
	}
}