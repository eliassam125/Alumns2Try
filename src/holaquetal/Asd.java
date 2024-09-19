package holaquetal;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Asd {

	 public static void main( String[] args ) {
	        // Replace the placeholder with your MongoDB deployment's connection string
	        String uri = "mongodb://localhost:27017/";
	        try (MongoClient mongoClient = MongoClients.create(uri)) {
	            MongoDatabase database = mongoClient.getDatabase("alumns_records_with_MGDB");
	            MongoCollection<Document> collection = database.getCollection("collection1");
	            Document doc = collection.find(eq("id",1)).first();
	            if (doc != null) {
	                System.out.println(doc.toJson());
	            } else {
	                System.out.println("No matching documents found.");
	            }
	        }
	    }
	}

