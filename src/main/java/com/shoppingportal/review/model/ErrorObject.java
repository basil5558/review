package com.shoppingportal.review.model;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorObject {

	private Integer statusCode;
	private String message;
	private Date timeStamp;
}
