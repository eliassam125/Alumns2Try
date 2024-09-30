package paquete_principal;

import static com.mongodb.client.model.Filters.eq;

import javax.swing.ImageIcon;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class AccionBotton {
	static int val = 1;
	public static void accion() {
        String uri = "mongodb://localhost:27017/";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("alumns_records_with_MGDB");
            MongoCollection<Document> collection = database.getCollection("collection1");
            if(val == 5) {val = 1;}
            Document doc = collection.find(eq("id",val)).first();
            String name =(String) doc.get("name");
            int stars = (Integer) doc.get("stars");
            String photo =(String) doc.get("photo");
            
            My_frame.paneltexto.get_label().setText(name);
            ImageIcon icon = new ImageIcon(photo); 
            My_frame.panelimagen.get_label().setIcon(icon);
            My_frame.panelboton.get_label().setText("Score : "+stars);
            val+=1;
            
        }

		
	}
}
