package apaw.ecp2.votingMain;

import web.http.HttpRequest;
import web.http.HttpResponse;

public class Client {

	public HttpResponse send(HttpRequest request) {
		return new Server().send(request);
	}

}
