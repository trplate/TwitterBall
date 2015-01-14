public class BallResponse {

	
	public static String getResponse(){
		int random = (int)(Math.random() * 1000 + 1);
		String response;
		if(random % 5 == 0){
			if(random < 200){
				response = "I'm thinkin' yes!";
			}
			else if(random < 600){
				response = "Hmm, not sure...";
			}
			else{
				response = "You shouldn't listen to fortune tellers";
			}
		}
		else if(random % 4 == 0){
			if(random < 200){
				response = "Nope, Sorry.";
			}
			else if(random < 600){
				response = "Oh most certainly!";
			}
			else{
				response = "yyyyyyyeeeea.....no";
			}
		}
		else if(random % 3 == 0){
			if(random < 200){
				response = "Probably?";
			}
			else if(random < 600){
				response = "Unfortunately, no :(";
			}
			else{
				response = "What do I know, I'm a program!";
			}
		}
		else if(random % 2 == 0){
			if(random < 200){
				response = "No, no, no.";
			}
			else if(random < 600){
				response = "I don't think so buddy.";
			}
			else{
				response = "Yes, definitely yes!";
			}
		}
		else{
			if(random < 200){
				response = "I really can't tell you.";
			}
			else if(random < 600){
				response = "You're just gonna have to wait and see ;)";
			}
			else{
				response = "Oh you know the answer is yes!";
			}
		}
		return response;
	}

}