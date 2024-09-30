package paquete_principal;
import static com.mongodb.client.model.Filters.eq;

import javax.swing.UIManager;
import javax.swing.SwingUtilities;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;



public class Play{

	 public static void main( String[] args ) {

	        try {
	            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	        
	        My_frame ventana = new My_frame();

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

