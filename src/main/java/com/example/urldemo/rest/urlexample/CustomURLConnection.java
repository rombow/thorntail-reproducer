package com.example.urldemo.rest.urlexample;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class CustomURLConnection extends URLConnection {

	protected CustomURLConnection(URL url) {
		super(url);
	}

	@Override
	public void connect() throws IOException {
		System.out.println("Connected!");
	}

}
