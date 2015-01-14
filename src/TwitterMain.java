import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;




public class TwitterMain {
	
	String replyMessage = BallResponse.getResponse();
	public static void main(String[] args) {
		TwitterAuth.getAccess(args);
		 Twitter twitter = new TwitterFactory().getInstance();
		 
		try{
		 Status status = twitter.updateStatus(BallResponse.getResponse());
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
        System.exit(0);
    } catch (TwitterException te) {
        te.printStackTrace();
        System.out.println("Failed to get timeline: " + te.getMessage());
        System.exit(-1);
    }
  }
	
}
