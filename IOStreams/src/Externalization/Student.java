package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
	String sid;
	String sname;
	String semail;
	String smobile;

	public Student() {
	}

	public Student(String sid, String sname, String semail, String smobile) {
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.smobile = smobile;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		try {
			String[] str = sid.split("-");
			int snum = Integer.parseInt(str[1]);

			str = semail.split("@");
			String email = str[0];

			str = smobile.split("-");
			long mobile = Long.parseLong(str[1]);

			out.writeInt(snum);
			out.writeUTF(sname);
			out.writeUTF(email);
			out.writeLong(mobile);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		sid = "DSS-" + in.readInt();
		sname = in.readUTF();
		semail = in.readUTF() + "@gmail.com";
		smobile = "+48-" + in.readLong();
	}

	public void getStdDetails() {
		System.out.println("--------------------");
		System.out.println("ID:     " + sid);
		System.out.println("Name:   " + sname);
		System.out.println("Email:  " + semail);
		System.out.println("Mobile: " + smobile);
		System.out.println("--------------------");
	}

}
