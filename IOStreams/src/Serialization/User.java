package Serialization;

import java.io.Serializable;

public class User implements Serializable {
	int uid = 111;
	String uname = "neo";
	transient String psw = "neo03";// transient keyword prevents variable from being Serialized
	Account acc = new Account();
}
