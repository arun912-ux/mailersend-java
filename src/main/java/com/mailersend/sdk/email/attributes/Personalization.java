/*************************************************
 * MailerSend Java SDK
 * https://github.com/mailersend/mailersend-java
 * 
 * @author MailerSend <support@mailersend.com>
 * https://mailersend.com
 **************************************************/
package com.mailersend.sdk.email.attributes;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;

public class Personalization {

    @SerializedName("email")
    public String email;

    @SerializedName("data")
    public HashMap<String, String> data = new HashMap<String, String>();
}
