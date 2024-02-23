import java.util.date;
import java.security.MessageDigest;
   
public class Block{
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;

	//blockk constructor
	public block(String data,String previousHash){
		this.data=data;
		this.previousHash=previousHash;
		this.timeStamp= new Date().getTime();

	}
}


 

public class StringUtil{
	public static String applySha256(String input){
		try{
			MessageDigest digest = MessageDigest.getInstance("Sha-");
			byte[] hash= digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			for(int i=;i<has.length;i++){
				String hex=Integer.toHexString(xff &hash[i]);
				if(hex.length()==1) hexString.append('0');
				hexString.append(hex);

			}
			return hexString.toString();
		}
		catch(Exception e){
			throw new RunTimeException(e);
		}
	}
}



public String calculateHash(){
	StringUtil.applySha256(
	previousHash+long.toString(timeStamp)+
	data
	);
	return calculatedhash;

}
  

public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = calculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
	
