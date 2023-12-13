package org.college;

import org.client.Client;

public class College extends Client {
	public void collegeName () {
		System.out.println("College Name - D.G. Vaishnav COllege");
		}
		public void collegeCode () {
		System.out.println("College Code - 1236");
		}
		public void collegeRank () {
		System.out.println("College Rank 45");
		}

		public static void main (String[]args) {
			College exm = new College();
			exm.collegeCode();
			exm.collegeName();
			exm.collegeRank();
			exm.clientInfo();
		}
}
