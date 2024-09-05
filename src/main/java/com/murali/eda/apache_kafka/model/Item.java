package com.murali.eda.apache_kafka.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {

	private Long itemId;
	private String key;
	private String stream;
	private String customState;
}
