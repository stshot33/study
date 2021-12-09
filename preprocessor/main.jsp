<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="greeting" value="웹 쇼핑몰에 오신 것을 환영합니다" />
<c:set var="tagline" value="Welcome to Web Market!" />

<%
	LocalDateTime ldt = LocalDateTime.now();
	String am_pm;
	int hour = ldt.getHour();
	int minute = ldt.getMinute();
	String s_minute = (minute < 10 ? "0" : "") + minute;
	
	int second = ldt.getSecond();
	String s_second = (second < 10 ? "0" : "") + second;
	
	if( (hour / 12) == 0) {
		am_pm = "AM";
	} else {
		am_pm = "PM";
		hour = hour - 12;
	}
	
	String CT = hour + ":" + s_minute + ":" + s_second + " " + am_pm;
%>
