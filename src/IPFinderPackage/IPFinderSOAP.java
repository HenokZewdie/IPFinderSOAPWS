package IPFinderPackage;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPFinderSOAP {

	public static void main(String[] args) throws Exception { 
		
			//String ip="213.55.96.150";
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap= geoIPService.getGeoIPServiceSoap();
			GeoIP geoip = geoIPServiceSoap.getGeoIP("213.55.96.150");
			System.out.println(geoip.getCountryName());
			
		}
	

}
