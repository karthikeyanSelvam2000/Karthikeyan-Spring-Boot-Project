package com.example.alert.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CommonWebUtils {

	/**
	 * Method to return success response with param
	 * 
	 * @param message
	 * @param code
	 * @return Response Entity with SuccessResponseMessage with HTTPS Status OK
	 */


	/**
	 * Method to return success response with param
	 * 
	 * @param data
	 * @return Response Entity with SuccessResponseMessage with HTTPS Status OK
	 */
	public static ResponseEntity<?> successResponse(Object data) {
		SuccessResponseData response = new SuccessResponseData();
		response.setData(data);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}


	/**
	 * Method to return failure response with params
	 * 
	 * @param message
	 * @param code
	 * @return Response Entity with FailureResponseError with HTTPS Status
	 *         BAD_REQUEST
	 */
	public static ResponseEntity<?> failureResponse(String message, int code) {
		com.example.alert.model.FailureResponseMessage response = new com.example.alert.model.FailureResponseMessage();
		response.setCode(code);
		response.setMessage(message);

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
