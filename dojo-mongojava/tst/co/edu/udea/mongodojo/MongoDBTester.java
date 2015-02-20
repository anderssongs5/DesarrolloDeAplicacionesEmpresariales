package co.edu.udea.mongodojo;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.mongodb.BasicDBObject;

public class MongoDBTester {
	
	private static String DB_NAME = "example-dojo";
	private static String COLLECTION_NAME = "workers";
	private static String HOST_NAME = "localhost";
	private static int PORT = 27017;
	private MongoDB mongoDB = new MongoDB(HOST_NAME, PORT, DB_NAME, COLLECTION_NAME);
	
	@Test
	public void createDataTest() {
		
		assertTrue(this.mongoDB.createData().count() == 7);
	}
	
	@Test
	public void testFindAll(){
		
		assertTrue(this.mongoDB.findAll().count() == 7);
	}

	@Test
	public void testFindByName() {
		String name = "Jose";
		assertTrue(this.mongoDB.findByName(name).size() == 2);
	}

	@Test
	public void testUpdateAgeByName() {
		String name = "Juan";
		int age = 30;
		
		assertTrue(this.mongoDB.updateAgeByName(name, age).getN() == 1);
	}

	@Test
	public void testSave() {
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name", "Pepe");
		basicDBObject.put("lastname", "Cespedes");
		basicDBObject.put("age", 87);
		basicDBObject.put("date", new Date());

		assertTrue(this.mongoDB.save(basicDBObject));
	}

	@Test
	public void testFind() {
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name", "Maria");
		basicDBObject.put("lastname", "Martinez Aguilar");
		basicDBObject.put("age", 35);
		
		assertTrue(this.mongoDB.find(basicDBObject).count() == 1);
	}
	
	@Test
	public void testRemoveAll(){
		this.mongoDB.removeAll();
		
		assertTrue(this.mongoDB.findAll().count() == 0);
	}
}
