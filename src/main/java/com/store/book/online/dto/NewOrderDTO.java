package com.store.book.online.dto;

import java.util.List;

import lombok.Data;

@Data
public class NewOrderDTO {
	private long orderNo;
    private String email;
    private List<String> bookNames;
}
