package website_modules;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_Institution 
{

	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
//	String inst_name2="Cornell";
//	String inst_desc2="University is a private institution that was founded in 1865";
	String inst_slug2="198ndhd";
	
	String search_key="impact";
	
	String search_key_coll="Meet our Institutions";
	String institution_name="Cornell";
	
	@Test (enabled = false)
//	@Test (priority=1)
	public void Verify_CMS_Credentials()
	{
		
	 	
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://admin-portal.us-east-1.dev.mediflix.com");

	    LocalStorage local = ((WebStorage) driver).getLocalStorage();    

	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.LastAuthUser","saurav.anand@mediflix.com");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.deviceGroupKey","-9b0ne3AP");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.EO7h7v35j_YXQxj_fDlcYgkle76h120O-FAkj8qAkh0JVyK3V-3SVdYLIiP6hL3GfYuiFEn5i4iIuZKD3Wol9kDC-UNIHoHzWZWLiW6BIyvmmdFSN3ePcDNMYAddM-ziNCb9FZSwEzMaNwtQcnPv7St3exgah2DYzdnIZqQxX3Sc_Ir5HuSVYg1hnO8lNserIrHDCikIFW-kMEP_Wo2N8a2pp6m9chiMkCIMWsMtL6JcbJ0HIrxXMUKBulkJ8mxdsyoKJNyUwlKGEQrVXWMooIYAfM7FJoNP-5kZYjIKdaWFhouUrbBGM0LpRTW_ZqrNoXjLht17z-ckzoE2tzw5pA.Hlsv_3PRAXTCL_Ov.PWkDM8VaCYzl4nf1grFlTMnBLtk7Rr2ORPsSgVHIisFxDBWirfjzzAzvNVBfhTMXr95RFrNoMiJL90e0cX0lJlyIHPxU7SDPDoB9bUeHYIQrwzbyXB3jlnQsPyPQDQ1zdfYlus4ZY3JoBW1Nlr0mSlRti2Yqb68MjHq59JAmJWp9Q37v4SB5VPHn7guD3jofL-KxMLSdM5lBEeg-vUJzzg3SAye2uHeVZ0DSzFTTnahsuS4RAVw8YFW2j1bwMQUxk_qsSK-OUozw_P5FOTneUdS-c7eAJORj7kiM5e24IFY3hFoCa90t4IrHWEfomWOiXYsPHfYXcL6v5hyowFqnwIs_WLF_bRLefNCimldbNnDT-zO4uS07evrTTLIq8SZKy0jGSYywd1NA4qKQhCj4_S_1Qnr_xusGIqgfmjySdHWpU3b2jXK_cfMUhigEArdqI8FH9CrgAtR5qUTjqA5ZwPFmt1ySBEl461zGK0zwTyL55X_KAlYudiMx4oKZYR4xwvVrUsWcqpAYWmslEUf3FogGIuCT_EfvJN-t6XAMA_EFSjEIKE-A-SPQatlxyStIpX_786UMEBmGTkb5LcJVYBAKqGXFEEZMGjcliy58g7LxXlVTORgMvZ1GeK-VbHIHRZHw0bpnzqj2Cc3JQT9X6HqByW487jBMrjbU-Tb-kuj3JA0uK_IVuJBK6SplBSzEI_yn_m1uruEiMWsgE-kyXrTdacA-vXx4thbnW7edbZwGTB4dA14IJYfpTdmdNe6eyLEY-FDHp-j7zrDBzH4uNaJdTWLyYtPYzS7-u18fMC2U8ZNXzFKAaX8UrAitKrOL0n7R97nxNYvS6qwUKe1cDltQXon2yCvQFeRttPWznZx_R0R3ciDD7BvaSBIoviIFMVqJ8J6YLd_ZppSG-G6zSpOEif-9Irwkasv3e2_hZNz-1HDm8BlY-FB-S8jwBwkGS7lTygczeekKkZU7e4MKN123GVp8B7s609vPOWtGZ109Q31SVdu-npo8eFcyW8OB-aopls0fud49PdsUnTZj3_4jaghPYBPL9boBOFfsLzYSk4W74-1oDKbmDge7ns_c8VIPDyXRWH9fW585nmVbEQlnvMdgb5CQJ44MR1UKikDvxojZr8zK57S1kieaaYb1LB4AeAv3pLSJmqmnISQ6lEoec_32CK9_Z7y9ij5RvA15B2FrNjEePdyZTQptjyUioptWoHx_CrsJofZfL_ZJdJzYuMx-QO_bhiw3QK4FnTyeKb0qTQ9ZUFFjf-JVbtkb_5Qofhx3uMmQE2wQKbgrICd50yaei0OZ5IifbscqAxfV-2dXEoWn7Lc0VA.vbx5mbCfEKOq2_9RWXCHlw");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.clockDrift","-1");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.Hx7p23V3Iqqk4nSNbIK-zzqct84fZfNe2jbZxnqyBs6AqeG_2a4hp1QkyZ8t6wKHEDskLmElkyzi4W4gUht4AKQMMEjdOoccb_IGA6TUbYPBKambcY5zOxWizdEv_wig1Gj5wy5EHBpV3neNetWJnDPPLV_tIYZEvgTeEvNIq57EdFbdwCo-mo_FZXjHByvs9JJ92uEgzaN5tQQTWmeDKX4vmZT0Qtcs39RNh0nxXDbbbpiDW64VCHoAftd1gG-jAYrHWnIN_BhVSyL0aETHuDhu5d_LLp0xBCbBEJztextK6ihZwDwB6sCeTwqryrOWekcO7YnbkI4-R8_MVNWRpQ.vVdm-qtf3WimDqbt.bQbimb6IXOhMHyQBkgwTNTgxcHOZDskU-UBaHx7KkoNKqMYxNOxgu1YqOB8NCOs6oEwQQm4t3GvWa3r58fhSwi-SKaGB_vn97TK7DnxbIiMhwXUnFUssbZqg1JUYTlMccYZcl5u_gSmHYdm2D2LpIBCHNXpCEyCY8gZC388RI7IqhtO5vNITpeJ2MuGU5ZmtlKglhGpM-vUA8Q6OZtUQ0_nNKbwHLtpPiavE967KnoXmjXiJSzu-1HVSP5fMvsmoRQ5XIz_OIpqgVeLW8IYUNOJYBEXyImybo2IJDEBf-MLJTFo0LGbR2wFsK4_B-Ew3X8lnTdNBWamiMiEDk12OUAYLskBgCRCjb2hvpwYX2c8Kkf9E5sWE3oNQoeyjG0t-wAX01iH1PzzW2d03is39O0sD8sxYBRHSCjDpf35Tzw-8n0UpYOECMMm1vm72xySChbx1-mb8PFcZo4VXhIs_dNaPVNXMSS_e6OaC3nTbD5ZkFL_Nnun4q2IhPSzLANjOHvVQlmxomublZkmGW_fp30iE9LGx3kqkCbf14HYr_6StaC2n4tjOYnuj8rUKLJciy_yMl0dX331jYJAZarhzWpV4FbcS1ra3mQQrhEiUk0hPv9JolOB6tHDpysCHIy7p-8h5WgRoeESESCxPED2HdYztDbid540i-h-FTBNXFVfsaWaXAi0Ob2fpbsokjgmQI9mj4zGvxamLqujedoL-_mSmTXbwLadETvVsa5Jsv3q8nAwbz06WCY6Wbr8NeYdVH2iUR6CBWNrz5Eoywxzv8lxxeT-rb2oyIaBK_xHLMkQkVMxMzqLj8yuBgBeajylpbZLoZl8JBx6vlvzFrBeHgRsxmL6ncFTehmIRBEsl5qQxEvx88ZWBrzctxG6eBdtWUEY7OPB-1YyEoPB31mrT26DFFMyL2WBKZaT9Aio2-1N3UNq7Mzq6OKyegq3XX-ylzxznYgxx8Js-691M6t486Hk-Q4Nn5iVAaWuoYA53BuPB_FdqZYmjrrqUNqz6uD83MOYOkXL8zM2CZX9jCyxwGSwennUQvu_j-h6mm1O1iBDpBDDbZa9tbiNPXWftVViIs9TWi-AKtXQXlqgS1ROc6Im1G33Bt0EEaJ_raHqMx7bU8sw0c764r_zuiVhTkT-lvqpcpjckUe1EJVgJA75R6stclHCm0aJAW-BD2RHbKFtj5YaSUNn18lpL7xEMKkvGDwvmT8OOqDB9d7fB8lgImeTuXBi1hbgIWid57VXBaXF-wVNfkdNFbji-6tWORe7du00M7CsncDN-rJSRGueZAOFaBwkFBj-8tyAJMDw.NwuAlhQ-MxUlYnRFT7TgYA");
	    local.setItem("amplify-signin-with-hostedUI","false");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.LastAuthUser","38eaef6d-6a98-454c-b3df-861c17cd1fcd");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.idToken","eyJraWQiOiIrMDBqWVZCZVhOQVwvTkpVa1FEa0dkUHdzM1NJSjNkVVRYTUI4VGNGa3VGZz0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY29nbml0bzp1c2VybmFtZSI6IjM4ZWFlZjZkLTZhOTgtNDU0Yy1iM2RmLTg2MWMxN2NkMWZjZCIsIm9yaWdpbl9qdGkiOiIwMjViNzY4ZC01ODFlLTRhMzEtODUyOC1lZjgxMjYwMWM0MTAiLCJhdWQiOiIxNnZuMm5pNmQ0Mjl0ZmQzbWk4NnJlZmsycCIsImV2ZW50X2lkIjoiZjFlNjQ4ZDYtZTNlNy00ZjcwLTlkZTYtMGJhZTM3OGM1OWIyIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NzI2MzQzNDMsIm5hbWUiOiJzaGl2cmFqMiIsInBob25lX251bWJlciI6Iis5MTk4MzQzMzA5ODEiLCJleHAiOjE2NzI2NDQxNjksImlhdCI6MTY3MjY0MDU2OSwianRpIjoiMTA5NjVhNWUtYjQ1ZS00NTY0LWI2NTktNDY4NzhmNzliZTZkIiwiZW1haWwiOiJzaGl2cmFqdGVjaDM3QGdtYWlsLmNvbSJ9.rM3qAUW4iaiEXgZJ_yTG665GJ2gqcikfub_o0ox3Zh5UgCIgvX3zJm0ATouHo-qgl6VPrdJj64oKVs5Fo_RtGtQwKtP4a3TRlx4mUb0WYRDgfqv563HzL3WshphURyd5Kbqdny9uC6jctIaphBYZEmT2eWykkqwfrvA_iAdur_p2-GoXej7UMDplAxZysgfW7vB-8FC91ifKLsr5t_m5ptaGgdiUeo8_boJ9VDrRAPW9Wqh8Fn5tV_10-FVcNwNQDrpXgrVPFSrjvT1DJah2bMsyfbLdr2ISF7Hb1dYG9ynvFna29yYS-59IQkpzTNmfxhvsSaBx2OXVpy7NUmQeww");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.accessToken","eyJraWQiOiIwdlNjWTFmajFXVTQrQUsxYzN4dFdubWJ3T3hpZkpxRkthZ0pIcWwyYXJ3PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY2xpZW50X2lkIjoiMTZ2bjJuaTZkNDI5dGZkM21pODZyZWZrMnAiLCJvcmlnaW5fanRpIjoiMDI1Yjc2OGQtNTgxZS00YTMxLTg1MjgtZWY4MTI2MDFjNDEwIiwiZXZlbnRfaWQiOiJmMWU2NDhkNi1lM2U3LTRmNzAtOWRlNi0wYmFlMzc4YzU5YjIiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjcyNjM0MzQzLCJleHAiOjE2NzI2NDQxNjksImlhdCI6MTY3MjY0MDU2OSwianRpIjoiNjZjZDljOTYtYTg3MC00MzM4LWI2NzMtYzI3N2I5YTVmYzQxIiwidXNlcm5hbWUiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QifQ.XFf6QGhQesGn-p3tBHazqVcip6Ct6AtAaJgVs5mM1FIXZn_2XGsa_iZt5Vjd4QHIErOM7uNGP5Jd__BvXwIBpnCdjPg5-zic8PZy94zBaELsNzcKU4oT4ZQ7k6-Gz4LTKCVMQNWc0ZpnYZBy6ZU3tS1RDWcfVBNMwYxRc6DCluQiTCL5d_0N7-xFShIwZ3BSFZrrryY5VspreUAs9xzkhrVAWK6AXfYB7cwytM3OMAdqEI153tK4u6L2yEQsCWX7eR5WaPTq7Uhe94LMoN1ojTv55TfpOHmeZ9Qs_-FygjnpRs4x46RTMhiKYiK3ESzhKIvcP-h2FSAYL7Dd7C_VkA");
	    local.setItem("accessToken","eyJraWQiOiIwdlNjWTFmajFXVTQrQUsxYzN4dFdubWJ3T3hpZkpxRkthZ0pIcWwyYXJ3PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY2xpZW50X2lkIjoiMTZ2bjJuaTZkNDI5dGZkM21pODZyZWZrMnAiLCJvcmlnaW5fanRpIjoiMDI1Yjc2OGQtNTgxZS00YTMxLTg1MjgtZWY4MTI2MDFjNDEwIiwiZXZlbnRfaWQiOiJmMWU2NDhkNi1lM2U3LTRmNzAtOWRlNi0wYmFlMzc4YzU5YjIiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjcyNjM0MzQzLCJleHAiOjE2NzI2NDQxNjksImlhdCI6MTY3MjY0MDU2OSwianRpIjoiNjZjZDljOTYtYTg3MC00MzM4LWI2NzMtYzI3N2I5YTVmYzQxIiwidXNlcm5hbWUiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QifQ.XFf6QGhQesGn-p3tBHazqVcip6Ct6AtAaJgVs5mM1FIXZn_2XGsa_iZt5Vjd4QHIErOM7uNGP5Jd__BvXwIBpnCdjPg5-zic8PZy94zBaELsNzcKU4oT4ZQ7k6-Gz4LTKCVMQNWc0ZpnYZBy6ZU3tS1RDWcfVBNMwYxRc6DCluQiTCL5d_0N7-xFShIwZ3BSFZrrryY5VspreUAs9xzkhrVAWK6AXfYB7cwytM3OMAdqEI153tK4u6L2yEQsCWX7eR5WaPTq7Uhe94LMoN1ojTv55TfpOHmeZ9Qs_-FygjnpRs4x46RTMhiKYiK3ESzhKIvcP-h2FSAYL7Dd7C_VkA");
	    local.setItem("userRole","admin");
	    local.setItem("userPhoneNumber","+********0981");
	    local.setItem("bc-managed-release-choice-6.66.7_6.66.8","0.4310343780507446");
	    local.setItem("persist:root","{\"user\":\"{\\\"data\\\":{\\\"sub\\\":\\\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\\\",\\\"cognito:groups\\\":[\\\"admin\\\",\\\"patient\\\"],\\\"iss\\\":\\\"https://cognito-idp.us-east-1.amazonaws.com/us-east-1_Queq8DO0E\\\",\\\"cognito:username\\\":\\\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\\\",\\\"origin_jti\\\":\\\"025b768d-581e-4a31-8528-ef812601c410\\\",\\\"aud\\\":\\\"16vn2ni6d429tfd3mi86refk2p\\\",\\\"event_id\\\":\\\"f1e648d6-e3e7-4f70-9de6-0bae378c59b2\\\",\\\"token_use\\\":\\\"id\\\",\\\"auth_time\\\":1672634343,\\\"name\\\":\\\"shivraj2\\\",\\\"phone_number\\\":\\\"+919834330981\\\",\\\"exp\\\":1672644169,\\\"iat\\\":1672640569,\\\"jti\\\":\\\"29dbf3da-ee0d-4dc7-8a61-c36dbca67692\\\",\\\"email\\\":\\\"shivrajtech37@gmail.com\\\"},\\\"logged\\\":true,\\\"logging\\\":false,\\\"loginError\\\":null,\\\"validating\\\":false,\\\"getOtp\\\":false,\\\"retrievingAll\\\":false,\\\"retrievingAllError\\\":{\\\"message\\\":\\\"Response not JSON\\\",\\\"status\\\":401},\\\"updating\\\":false,\\\"updateError\\\":null,\\\"updated\\\":false,\\\"updatedPassword\\\":false,\\\"updatingPassword\\\":false,\\\"updatePasswordError\\\":null}\",\"_persist\":\"{\\\"version\\\":-1,\\\"rehydrated\\\":true}\"}");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.clockDrift","0");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.deviceKey","us-east-1_7c73b54d-fc32-4e8b-90c6-2edfd4623a0d");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.accessToken","eyJraWQiOiJEc28rS0YyK1Y5M0NSK0FtYTRzXC94Z0FuXC9VdTdBcjdhZ044SXh1SWF3cGc9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJjNGQ2ZjE4ZS1lNGU5LTQ1MGItOTllZC03MzNiOTJiYjAwNDUiLCJjb2duaXRvOmdyb3VwcyI6WyJBZG1pbiJdLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV9qMER5M3FYOE4iLCJjbGllbnRfaWQiOiIzMW5xNGNzcG5nanUycnRzdmVrZm84b2o3ZyIsIm9yaWdpbl9qdGkiOiJmZDJjNTYzOS03Yzc1LTRjNjItOWJlYS1mMWM4OGU0MzcyMDQiLCJldmVudF9pZCI6IjA0ODg1YzgwLWQ2OTUtNGRkYy1hN2QyLTcxMTI3ODQ0ZmVkMCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2NTI0NDQzNjYsImV4cCI6MTY1NDIzNDgyNSwiaWF0IjoxNjU0MjMxMjI1LCJqdGkiOiIzNzlkNGM5MS00NjE2LTRmNzQtOWU0ZC00ODIxZTg1Y2Y1MGQiLCJ1c2VybmFtZSI6InNhdXJhdi5hbmFuZEBtZWRpZmxpeC5jb20ifQ.OIyxA5gzWlUUaIXttHx7NyGj3GR17YcCRR_pJ4VXvovga-jGRnPsGKz6Fvv4yG0SrvCWNe12PltaxTRuo1192AAr_jm__GFjIczjhr3B4l__BMJ1eMahMqsVArAAvjjik9VvGZsX61frfBsTu11MmjceoGYscoJzBKqufE91zWEv0xMRqNNQGlg-q4DiUV3Cu52zgQ-7mBaCOwVa_J63MlcWfG7WSUgr47ix4LAmbi8H94J-9RnGOyw_22rgRX5TB54ix0INmpnOyh8bKMLJEskTJ6MtJObS8TYzsJrazBlrurqCdlWOqFDx2n24K8Obtv74Sg5Pwssm4icNk6SQ5w");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.randomPasswordKey","mlvQreD0BeNzhYmuIThPelqazmNg0Lx9ibk3OO+72Hremdj3FfPJdg==");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.userData","{\"PreferredMfaSetting\":\"SMS_MFA\",\"UserAttributes\":[{\"Name\":\"sub\",\"Value\":\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\"},{\"Name\":\"name\",\"Value\":\"shivraj2\"},{\"Name\":\"phone_number\",\"Value\":\"+919834330981\"},{\"Name\":\"email\",\"Value\":\"shivrajtech37@gmail.com\"}],\"UserMFASettingList\":[\"SMS_MFA\"],\"Username\":\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\"}");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.idToken","eyJraWQiOiIzNkZrcURhRWt1eU9WcVo3V2JMaE15UVZ2UFRNY1Z5QVJ3N2IzYUJIdXU4PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJjNGQ2ZjE4ZS1lNGU5LTQ1MGItOTllZC03MzNiOTJiYjAwNDUiLCJjb2duaXRvOmdyb3VwcyI6WyJBZG1pbiJdLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX2owRHkzcVg4TiIsImNvZ25pdG86dXNlcm5hbWUiOiJzYXVyYXYuYW5hbmRAbWVkaWZsaXguY29tIiwiZ2l2ZW5fbmFtZSI6IlNhdXJhdiIsIm9yaWdpbl9qdGkiOiJmZDJjNTYzOS03Yzc1LTRjNjItOWJlYS1mMWM4OGU0MzcyMDQiLCJhdWQiOiIzMW5xNGNzcG5nanUycnRzdmVrZm84b2o3ZyIsImV2ZW50X2lkIjoiMDQ4ODVjODAtZDY5NS00ZGRjLWE3ZDItNzExMjc4NDRmZWQwIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NTI0NDQzNjYsImV4cCI6MTY1NDIzNDgyNSwiaWF0IjoxNjU0MjMxMjI1LCJmYW1pbHlfbmFtZSI6IkFuYW5kIiwianRpIjoiNDk2YTZkYWEtYjU1NS00MTBmLWIwYzYtNTgwZjUxYmVjNzQwIiwiZW1haWwiOiJzYXVyYXYuYW5hbmRAbWVkaWZsaXguY29tIn0.h3BOXh2CIjvlBX0y7M-r4YTVOJBagj390V0EprKTER9xfVTB5coHFZ9Y84-2tqbn_3VYO5SJwLOe9sSx_CfdhxcnNNnmAnXvycAPq5NaylrebPxtS-BMprhqWwxHvThmjAPGbSRqvWf9OGKOMCnFtvuJVv6LhN_1KB2k_UR3qgjZ223BQvF0iKvetmS8gfJHwPebDrT3l1Wctlau3dt_PmTEF4yv_ccdC-g1pAtVUM64857RjNT1cG-W_dezzd0jabjZHzzYlQ5sQ6DbzgU91xWkQynlLfkrhWlxxvorzk1F8vaT3NvO2eeJg-6kDJjtSsRjF-thV4qEZjtANwVvEA");
	    
	    driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com");
	}
	
	@Test (enabled = false)
//	@Test (priority=2)
	public void Create_Institution() throws InterruptedException, IOException
	{
		 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/institutions");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		 
		 FileInputStream objfile = new FileInputStream("C:\\Users\\Prasad_aute\\git\\Website_automation2\\src\\test\\resources\\Properties\\Website.properties");
		 prop.load(objfile);	
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Institution -> Verifying Create New Institution With All Information");
		 Reporter.log("Institution -> Verifying Create New Institution With All Information");
		 
		 WebElement create_institute_button = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button"));
		 create_institute_button.click();
		 
		 Thread.sleep(3000);
		 				 
		//institute name
		WebElement name= driver.findElement(By.id("institution-name"));
		name.sendKeys(prop.getProperty("inst_name2"));
		 
		 // inst logo
		 															
		  WebDriverWait logo2_click = new WebDriverWait(driver, Duration.ofSeconds(30));
		  logo2_click.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[3]/button"))).click();
			   				 								
		  WebDriverWait wait_logo2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait_logo2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/img")));
			    		 
		  WebElement logo_select2=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/img"));
		  logo_select2.click();
		
		  WebElement select_button1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
		  select_button1.click();
		 
		  // inst image
		  
		  WebElement image2=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[4]/button"));
		  image2.click();
		 
		  WebDriverWait wait_img2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait_img2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img")));
			    		 
		  WebElement img_select2=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img"));
		  img_select2.click();
		
		  WebElement select_button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
		  select_button.click();
		  
		// desc and slug
		  WebElement desc= driver.findElement(By.id("description"));
		  desc.sendKeys(prop.getProperty("inst_desc2"));
			
		  WebElement slug =driver.findElement(By.id("slug"));
		  slug.sendKeys(inst_slug2);
			
			Thread.sleep(3000);
			// expert
			WebElement expert2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[7]/div/div/div"));
			expert2.click(); 
			
			Thread.sleep(3000);
			
			WebElement expert_select = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[16]"));
			expert_select.click();
			
			WebElement m1=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/h2/p"));
		    m1.click();
			
		    Thread.sleep(3000);
		    
			//collection 
		    WebElement collection2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[9]/div/div/input"));
			collection2.click();
			
			collection2.sendKeys(search_key);
			
			Thread.sleep(3000);
			
			WebElement coll_select = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li"));
			coll_select.click();
			
			Thread.sleep(3000);
			
			//click ramdom
			WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
			click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();		                           
			 
			Thread.sleep(3000);
			// videos
			WebElement videos2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[10]/div/div/div/input"));
			videos2.click();
			
			Thread.sleep(3000);
			
			WebElement videos_select = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]"));
			videos_select.click();
			
			Thread.sleep(3000);
			
			//zip
			WebElement zipcode2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[11]/div/div"));
			zipcode2.click();
			
			Thread.sleep(3000);
			
			WebElement zip_select = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"));
			zip_select.click();
			
			//tags
		     WebElement tab_button = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[8]/div/button"));
		     tab_button.click();
			    
		     Thread.sleep(1000);
		     													
		     WebElement tab_topic = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div[6]/div[1]/div[1]/label"));
			 tab_topic.click();
						  
			 Thread.sleep(1000);
			    
			 WebElement selectbutton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/button[2]"));
			 selectbutton.click();                                  
			    
			 Thread.sleep(5000);
			 
			 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();		                           
			 
			 Thread.sleep(10000);
	
			 //go to collection and add the institution in "meet our institution" collection
			 
	}
	
	
    @Test (enabled = false)
//  @Test (priority=3)
     public void Add_Institution_In_Collection() throws InterruptedException
     {
   	 	 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Search the 'meet our institution' and add the institution in same");
		 Reporter.log("Search the 'meet our institution' and add the institution in same");
		 
		 WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox.sendKeys(search_key_coll);
		 
		 Thread.sleep(5000);
		           
		 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
		 
		 // click institution   
		 
		 WebElement click_institution=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/input"));
		 click_institution.sendKeys(institution_name);
 		 
		 WebDriverWait select_institution = new WebDriverWait(driver, Duration.ofSeconds(30));
		 select_institution.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
		 
		 Thread.sleep(3000);
		
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
			    	
		 Thread.sleep(3000);
		 
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
		
		 Thread.sleep(10000);
		 driver.quit();
		 
     }
    
//	@Test (enabled = false)
	@Test (priority=4)
	public void Verify_WebSite_Login() throws InterruptedException
	{
		
		String Email="kashinath112@mailinator.com";
		String Password="Shivraj@12345";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/login");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(4000);
	    
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Log In']"))).click();
	    
	    WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
	    email.sendKeys(Email);
	    
	    Thread.sleep(2000);
	    
	    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    password.sendKeys(Password);
	    
	    Thread.sleep(2000);
	    
	    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	    submit.click();
	    
	    Thread.sleep(3000);
	    
	    WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    load2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='container max-w-[1200px] mx-auto wrapper']")));
	
	    // get data
	    String get_title = driver.findElement(By.xpath("//div[@class='container max-w-[1200px] mx-auto wrapper']")).getText();
	    System.out.println("the login title of user is_________________"+get_title);
	    
		
	}
	
//	@Test (enabled = false)
	@Test (priority=5)
	public void Verify_The_Created_Institution() throws InterruptedException
	{
			//driver.get("https://client-portal.us-east-1.dev.mediflix.com/advice");
			WebElement click_channels = driver.findElement(By.xpath("//a[normalize-space()='Channels']"));
			click_channels.click();	
		    
			driver.manage().window().maximize();

			System.out.println("Verify the created Institution and in website********************");
			Reporter.log("Verify the created Institution and in website");
				
			WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
			load1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/a")));
					
			//scroll down
		    JavascriptExecutor js = (JavascriptExecutor)driver; 
		    js.executeScript("window.scrollBy(0,400)");
			
		    //load
		    WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
			load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[5]/div/div")));
																			 
			Thread.sleep(4000);
			WebDriverWait click_channel = new WebDriverWait(driver, Duration.ofSeconds(30));
			click_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[6]/div/div/a"))).click();
			
			Thread.sleep(4000);
			    
			//load  
			    
			WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(60));
			load2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[1]/div/div/div[1]/button")));
					
			//scroll down
		    JavascriptExecutor js2 = (JavascriptExecutor)driver; 
		    js2.executeScript("window.scrollBy(0,300)");
			
		    Thread.sleep(4000);
		    
			//expert is  
			String expert_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]")).getText();
			System.out.println("expert name is ________________"+expert_name);
			
			//video is  
			String video_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[2]/div/p")).getText();
			System.out.println("expert name is ________________"+video_name);
			
			//coll name is 
			String coll_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[3]/div/div/a[2]/p")).getText();
			System.out.println("expert name is ________________"+coll_name);
			
			//audio name is 
			String audio_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[4]/div/div/div[2]/div/p")).getText();
			System.out.println("expert name is ________________"+audio_name);
			
			
			
			
	}
    
}
