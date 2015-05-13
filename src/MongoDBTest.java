import java.net.UnknownHostException;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


public class MongoDBTest {
	public static void main( String args[] ){
		try {
			// 链接mongo
	        MongoClient mongoClient = new MongoClient("localhost" , 27017);
	        // 数据库链接
	        DB db = mongoClient.getDB( "whitelist" );
	        Set<String> colls = db.getCollectionNames();
	        System.out.println("打印所有collectionis===");
	        System.out.println(colls);
	        
	        DBCollection coll = db.createCollection("test1", null);
	        BasicDBObject  ob =new BasicDBObject ("name","lichao").append("age", 25);
	        coll.insert(ob);
	        colls = db.getCollectionNames();
	        System.out.println(colls);
	        System.out.println("find 最新的一个元素=====");
	        BasicDBObject obTemp = (BasicDBObject) coll.findOne();
	        System.out.println(obTemp);
	        
	        BasicDBObject  ob1 =new BasicDBObject ("name","lily").append("age", 20);
	        coll.insert(ob1);
	        
	        System.out.println("遍历collection 所有元素=====");
	        DBCursor cursor = coll.find();
	        while(cursor.hasNext()){
	        	BasicDBObject bo = (BasicDBObject) cursor.next();
	        	
	        
	        	System.out.println(bo);
	        }
	        
	        
	        
	        
	        
        } catch (UnknownHostException e) {
	        
        }
		
	}

	
	
}
