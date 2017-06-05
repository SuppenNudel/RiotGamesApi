package de.rohmio.lol.api.util;

public class RequestException extends RuntimeException {

	private Status status;

	public Status getStatus() {
		return status;
	}

}
