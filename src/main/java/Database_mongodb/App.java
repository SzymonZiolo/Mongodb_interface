package Database_mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

public static void main(String args[]){
    MongoClient mongoClient = new MongoClient();
    System.out.println("Connected!");

    List<String> names = mongoClient.getDatabaseNames();

    names.forEach((name)-> System.out.println(name));

    System.out.println();

    MongoDatabase testdb = mongoClient.getDatabase("db");
    MongoIterable<String> collectionNames = testdb.listCollectionNames();

    collectionNames.forEach((Block<? super String>) (name)-> System.out.println(name));

    System.out.println();

    MongoCollection<Document> p = testdb.getCollection("cars");

    //Document d = new Document().append("ID_Sprzedawcy", 22).append("Kwota",642.23);

   // p.insertOne(d);

  //  FindIterable<Document> d = p.find(new BasicDBObject().append("_id","596cfd75822cbefabbbe1b6c"));
  //  d.forEach((Block<? super Document>) (Document document)->{
  //      document.replace("ID_Sprzedawcy","33");
  //      p.replaceOne(new BasicDBObject("_id", new ObjectId("596cfd75822cbefabbbe1b6c")), document);
   // });



    p.find().forEach((Block<? super Document>) (Document document) -> {
        System.out.println("Document:");
        document.entrySet().forEach((entry)-> System.out.println(entry.getKey() + ":" + entry.getValue().toString()));
    });




}
}
