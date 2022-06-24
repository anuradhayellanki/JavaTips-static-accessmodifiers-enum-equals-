package com.cashapona.javatips.jun24;
import java.util.Objects;
/**
 * @author Anuradha
 */
class Client{
	private int id;
	public Client(int id){
		this.id=id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}
}
public class EqualsRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client1=new Client(1);
		Client client2=new Client(1);
		Client client3=new Client(2);
		System.out.println(client1.equals(client2));
		System.out.println(client1.equals(client3));
	}
}
