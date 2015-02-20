package co.edu.udea.mongodojo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class MongoDB {

	private DBCollection collection;
	private MongoClient mongoClient;
	

	public MongoDB(String hostName, int port, String dbName, String collectionName) {
		try {
			mongoClient = new MongoClient(hostName, port);
			DB db = mongoClient.getDB(dbName);
			this.collection = db.getCollection(collectionName);
			
			if(this.collection == null){
				this.collection = db.createCollection(collectionName, null);
			}
		} catch (UnknownHostException e) {
			System.err.println(e);
		}
	}

	public List<DBObject> findByName(String name) {
		List<DBObject> foundList = new ArrayList<>();

		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name", name);

		DBCursor cur2 = this.collection.find(basicDBObject);
		while (cur2.hasNext()) {
			foundList.add(cur2.next());
		}

		return (foundList);
	}

	public WriteResult updateAgeByName(String name, int age) {
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.append("$set", new BasicDBObject().append("age", age));

		BasicDBObject searchById = new BasicDBObject();
		searchById.append("name", name);

		WriteResult writeResult = this.collection.updateMulti(searchById, basicDBObject);

		return (writeResult);
	}

	public DBCursor createData() {
		this.removeAll();
		
		BasicDBObject basicDBObject = new BasicDBObject();

		basicDBObject.put("name", "Jose");
		basicDBObject.put("lastname", "Lopez Perez");
		basicDBObject.put("age", 45);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		basicDBObject.clear();
		basicDBObject.put("name", "Maria");
		basicDBObject.put("lastname", "Martinez Aguilar");
		basicDBObject.put("age", 35);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		basicDBObject.clear();
		basicDBObject.put("name", "Juan");
		basicDBObject.put("lastname", "Navarro Robles");
		basicDBObject.put("age", 25);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		basicDBObject.clear();
		basicDBObject.put("name", "Lucia");
		basicDBObject.put("lastname", "Casas Meca");
		basicDBObject.put("age", 66);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		basicDBObject.clear();
		basicDBObject.put("name", "Jose");
		basicDBObject.put("lastname", "Naranjo Moreno");
		basicDBObject.put("age", 33);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		basicDBObject.clear();
		basicDBObject.put("name", "Jose Luis");
		basicDBObject.put("lastname", "Romero Diaz");
		basicDBObject.put("age", 55);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		basicDBObject.clear();
		basicDBObject.put("name", "Ana");
		basicDBObject.put("lastname", "Canovas Perez");
		basicDBObject.put("age", 24);
		basicDBObject.put("date", new Date());
		this.collection.insert(basicDBObject);

		return (this.findAll());
	}

	public boolean save(BasicDBObject basicDBObject) {
		if (basicDBObject != null) {
			this.collection.insert(basicDBObject);
		}

		return (this.collection.findOne(basicDBObject) != null);
	}
	
	public DBCursor find(BasicDBObject basicDBObject){
		DBCursor dbCursor = this.collection.find(basicDBObject);
		
		return (dbCursor);
	}
	
	public void removeAll(){
		this.collection.drop();
	}
	
	public DBCursor findAll(){
		
		return (this.collection.find());
	}
}