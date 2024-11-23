package javaFeatures;

public sealed interface Bank permits HSBCBank, ICICIBank, HDFCBank{
	public String getName();
}
