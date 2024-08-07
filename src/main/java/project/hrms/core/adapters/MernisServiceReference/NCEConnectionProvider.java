
package project.hrms.core.adapters.MernisServiceReference;
//------------------------------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 9.0.0.0
//
// Created by Quasar Development 
//
// This class has been generated for test purposes only and cannot be used in any commercial project.
// To use it in commercial project, you need to generate this class again with Premium account.
// Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
//
// Licence: D5BE7513681F1DD3A49F6F2224FF761614E01F75DF84A5237FFCB580C2100F2FD6B3D2E5CAA8F81376163A7C93B588EDFA6AFC9A122C3FE14A58F30C070592BD
//------------------------------------------------------------------------
import java.net.URL;
import java.io.*;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public interface NCEConnectionProvider
{
    NCEResponseData sendRequest(String url,String requestBody,HashMap< String,String> httpHeaders, NCERequestResultHandler handler) throws java.lang.Exception;
}

class NCEHttpConnectionProvider implements NCEConnectionProvider{

    public void prepareRequest(HttpURLConnection url,String requestBody, NCERequestResultHandler handler) throws java.lang.Exception {
        OutputStreamWriter wr = new OutputStreamWriter(url.getOutputStream());
        wr.write(requestBody);
        wr.flush();
    }

    @Override
    public NCEResponseData sendRequest(String url,String requestBody, HashMap< String, String> httpHeaders,NCERequestResultHandler handler ) throws java.lang.Exception
    {
        URL urlObject=new URL(url);
        HttpURLConnection connection=(HttpURLConnection)urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);  // Bu satırı ekledik


        for(Map.Entry<String, String> entry : httpHeaders.entrySet())
        {
            connection.setRequestProperty(entry.getKey(),entry.getValue());
        }

        prepareRequest(connection,requestBody,handler);


        NCEResponseData response=new NCEResponseData();
        for(Map.Entry<String, List<String>> entry : connection.getHeaderFields().entrySet())
        {
            if(entry.getKey()!=null)
            {
                String values = "";
                for (String value : entry.getValue()) {
                    values = values + value;
                }
                response.getHeaders().put(entry.getKey(),values);
            }
        }

        try(InputStream dataStream = getResponseStream(connection,response,handler))
        {
            response.setBody(NCEHelper.streamToString(dataStream));
        }

        return response;
    }

    protected InputStream getResponseStream(
        HttpURLConnection url,
        NCEResponseData response,
        NCERequestResultHandler handler
    ) throws java.lang.Exception
    {
        try{
            return url.getInputStream();
        }
        catch (IOException ex)
        {
            return url.getErrorStream();
        }
    }
}