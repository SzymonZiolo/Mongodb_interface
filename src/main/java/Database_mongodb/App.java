package Database_mongodb;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

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

    names.forEach((name)->{
        System.out.println(name);
    });

    System.out.println();

    MongoDatabase testdb = mongoClient.getDatabase("testdb");
    MongoIterable<String> collectionNames = testdb.listCollectionNames();

    collectionNames.forEach((Block<? super String>) (name)->{
        System.out.println(name);
    });

    System.out.println();

    MongoCollection<Document> p = testdb.getCollection("articles");

    p.find().forEach((Block<? super Document>) document -> {
        System.out.println(document);
    });

}
}
