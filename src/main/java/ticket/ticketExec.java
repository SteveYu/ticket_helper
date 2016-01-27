package ticket;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import common.JacksonUtils;
import common.SslUtils;

public class ticketExec {

	public static void main(String[] args) {
		String urlString = "https://kyfw.12306.cn/otn/lcxxcx/query?purpose_codes=ADULT&queryDate=2016-02-01&from_station=SHH&to_station=NCG";
		try {
			URL url = new URL(urlString);
			if("https".equalsIgnoreCase(url.getProtocol())){
				SslUtils.ignoreSsl();
			}
			
			long internalTime = 10000;
			int tryTime = 0;
			do {
				HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
				urlConn.setRequestProperty("Content-type","application/json;charset=UTF-8");
				urlConn.setRequestMethod("GET");
				urlConn.setDoInput(true);
				urlConn.setConnectTimeout(3000);
				urlConn.setReadTimeout(3000);
		        int resCode = urlConn.getResponseCode();
				System.out.println("Result code : " + resCode);
				String result = IOUtils.toString(urlConn.getInputStream(), "UTF-8");
				Map root = JacksonUtils.json2map(result);
				Tickets tickets = JacksonUtils.map2pojo((Map)root.get("data"), Tickets.class);
				tickets.outputAvailableTickets();
				System.out.println("Wait " + internalTime/1000 + "s for next query.");
				Thread.sleep(internalTime);
			} while (tryTime < 50);
			
	        
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
