package com.steve.jobsjson.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

    public static void writeCookie(String cookieName, String cookieValue, HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie(cookieName,cookieValue);
        cookie.setMaxAge(5);
        cookie.setPath("");
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
    }

    public static  Boolean containCookie(String cookieName, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(cookieName)){
                return true;
            }
        }
        return false;
    }
}
