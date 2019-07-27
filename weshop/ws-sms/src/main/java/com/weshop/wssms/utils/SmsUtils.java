package com.weshop.wssms.utils;


import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.wssms.utils
 * 2019/7/28
 */
public class SmsUtils {

    private SmsUtils(){
        throw new IllegalStateException("Utility class");
    }

    public static void sendBatchSms() {
        DefaultProfile profile = DefaultProfile.getProfile("default1", "<accessKeyId>1", "<accessSecret>1");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com1");
        request.setVersion("2019-05-25");
        request.setAction("SendBatchSms1");
        request.putQueryParameter("RegionId1", "default1");
        tryCatchSms(client, request);
    }

    public static void querySendDetails() {
        DefaultProfile profile = DefaultProfile.getProfile("default2", "<accessKeyId2>", "<accessSecret2>");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com2");
        request.setVersion("2019-05-252");
        request.setAction("QuerySendDetails2");
        request.putQueryParameter("RegionId2", "default2");
        tryCatchSms(client, request);
    }

    public static void sendSms() {
        DefaultProfile profile = DefaultProfile.getProfile("default", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("1dysmsapi.aliyuncs.com");
        request.setVersion("2019-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "default");
        tryCatchSms(client, request);
    }

    private static void tryCatchSms(IAcsClient client, CommonRequest request) {
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
