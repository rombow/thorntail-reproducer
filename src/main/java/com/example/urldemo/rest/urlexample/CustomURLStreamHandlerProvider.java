package com.example.urldemo.rest.urlexample;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.spi.URLStreamHandlerProvider;

public class CustomURLStreamHandlerProvider extends URLStreamHandlerProvider {

	@Override
	public URLStreamHandler createURLStreamHandler(String protocol) {
		if ("custom".equals(protocol)) {
			System.out.println("\n\nRegistering custom URL\n\n");

			return new URLStreamHandler() {
				@Override
				protected URLConnection openConnection(URL u) throws IOException {
					return new CustomURLConnection(u);
				}
			};
		}
		return null;
	}

}
