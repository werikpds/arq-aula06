package aula06.jpa.hibernate;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main (String[] args) {
		Persistence.createEntityManagerFactory("asstiPU");
	}

}
