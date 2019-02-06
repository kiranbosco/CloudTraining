package com.serializable;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class User implements Externalizable {
	private String userName;
	private int age;



	public User(String userName,int age){
		this.userName= userName;
		this.age=age;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		userName =(String)in.readObject();
		age =(int)in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(userName);
		out.writeInt(age);
	}
	public static void main(String[] args) {

		User u = new User("Joseph", 10);
		try {
			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\text.txt11");
			ObjectOutputStream oos =new ObjectOutputStream(fis);
			oos.writeObject(u);
			
			System.out.println("success");
			
			oos.close();
			oos.flush();
			fis.close();
			fis.flush();

		}
		catch (Exception e) {
			System.out.println(e);		}
	}
}