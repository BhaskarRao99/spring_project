package com.stackfortech.urlShorteningService.utils;

import javax.servlet.http.HttpServletRequest;

public interface RequestService 
{
	String getClientIp(HttpServletRequest request);
}
