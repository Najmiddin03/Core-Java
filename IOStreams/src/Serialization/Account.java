package Serialization;

import java.io.Serializable;

public class Account implements Serializable {// contained objects should implement Serializable interface even if it's
												// not being serialized directly
	String accname = "account";
}
