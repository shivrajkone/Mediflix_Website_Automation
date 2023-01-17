package Common;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Credentials 
{
	 
	public static ChromeDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	public void CMS_Login() throws IOException
	{
		FileInputStream objfile = new FileInputStream("C:\\Users\\Prasad_aute\\git\\Website_automation2\\src\\test\\resources\\Properties\\Website.properties");
		prop.load(objfile);		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://admin-portal.us-east-1.dev.mediflix.com");

	    LocalStorage local = ((WebStorage) driver).getLocalStorage();    

	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.LastAuthUser","saurav.anand@mediflix.com");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.deviceGroupKey","-9b0ne3AP");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.ty2BU1pA0FobeLMboPWMxST0KesUNeJQU3fTJKMya5y__cca2lcJsRxhE73fM2I8QlGQbuU596C6T1v4qh2g4_Brmat6YsTK7yVE2iROr0tTj1ebP0pvXza_VX9aXQG-Yog0x7gJHCbSutyeK_9Zf7zhRXuaSQcuXi29GJs78Jhfd87ytrWx_Jt7ROu-ylJbqNFGTSl2OSFOxx3xcIY-4qdXWvWSb3I5lRekrsWY576CjiLQ1p-AfKxPWVtQp1EKEArOf5sxD55qbbYIyIoXOhIQj7C6lN6S1Jl1PXQBlrmQkeSyjPzovsogXjzl_ajc5zuQk_CCWSwUoWAJ15jLvw.XoxbzYcrBd2ffydK.obR_6Nh28-HWoLD3v21Nnh3XCW-cd9YjnSziOzAL7GxAfZ9St6JtfTr4xVRLwXo_KptXWq5kIUhXkBmT-Lfe8fmViQjAsHCVmX8mUZNTgWXufC5kAHSLNeYvnT3GH9ssYGEXOFShpFa4Q3G7l_z20gCAHkz9oPM8HXjlLQc1XlGcu-7RWCHrnaiUSDjrb5MC0iC_5RA7mI3mlzHBsbXliR-IXzHJdsn7aASGlKz_b1_xLqd5TuyaKDUljOyFTNS3u8HxXXl4qnfnJrZtBRxdIviTBtkoaZaKOBGXXolCdVOy0eAh3NlajOr1GxeSvL8ju1jh36CScpFYViXNPQMHRhbuAVBXjDQynsWZKeNbcaElMIuN-ZBz7pkf_8wOv2W79BV-RsfDn4pDsLWmifOpVimyC66sadZec54S8c2DftojCNVh_QsYzQyiwNA6yWoFniPhnl9_XZC53XAgPNV3a5TTu4Q9dr5iOYQy5QqBq8yYc_jyJJngaovN1m_ap4bDPzhpEE882ogdGzBthISpMS9K-qchJ_PkZLZYWFAZZVc2KfjGNMG1uslcrFTCtN_W7eH1LOrBbcY-JOtq6K57fkx-01P-WctTIeAoEVRmgvInyHKB1hmPCYEEGz92jOedAJz1DjXQ-haXbA8g6h_TY6FjAMTnV-L-y9vLO6P2NGCq5ZwXuadVpQdCN00GcDErmuQuW7EJ9IdwKEFrCIErGr1S8tSa-QjBknW3Kba4NyPAa55Ec82jK_-xUnU68WU1-uniNPSb6G8RnKDvPvZAka4nVC8tXsRRhcRR4ypccy4rVtKLb_l0_-utK1QAJqmPd1cji0lpI7DeUUZ8ntDpeC5CQ_heVAwyJuFIrM_O549GnJMnKmbuIJ5BGc86RVwppkLn2jR_tTO2nfHq5PqWRo7l27MROzj8ekmAiIQjOAUpIRqh9NVc2WGpq0JYL_u88wPC6cQ8g-Nqysbd9WXtlk9qYxpl8a3WhAto-6z4WG0GUUBEBU_U7r5FsxnsdKdlkPt5195Qbq8V1x5AY9KkXtoZaHI4r1gleBwGiyf1u31-oR1B85kyvp-GConTM16o0_bWR96q8Oxh_O2xLA0vTLglyeWFG3aLYUt3EN5h-Bay4gaqihWZGbSnC2gZDkasrlhQubN-cI6c4mo4fZWbDR0sbxSJQfAcb30xCRKxTB3VcE6Hq-SV207gRUDWSvucNYEjSQ4omJJibasjKuAuduLk-4KMJOGK3kcJgOGo22SIP4NZ5XvIXFAhFz4wv2wsLB-TXQtf74WXpOMYdeeWa5GhZGNsTpICsbenXHSOqSPT0upNGiIlmg0kbQ.F0cqC-rvKXNeMAvhpU5nSw");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.clockDrift","-2");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.Hx7p23V3Iqqk4nSNbIK-zzqct84fZfNe2jbZxnqyBs6AqeG_2a4hp1QkyZ8t6wKHEDskLmElkyzi4W4gUht4AKQMMEjdOoccb_IGA6TUbYPBKambcY5zOxWizdEv_wig1Gj5wy5EHBpV3neNetWJnDPPLV_tIYZEvgTeEvNIq57EdFbdwCo-mo_FZXjHByvs9JJ92uEgzaN5tQQTWmeDKX4vmZT0Qtcs39RNh0nxXDbbbpiDW64VCHoAftd1gG-jAYrHWnIN_BhVSyL0aETHuDhu5d_LLp0xBCbBEJztextK6ihZwDwB6sCeTwqryrOWekcO7YnbkI4-R8_MVNWRpQ.vVdm-qtf3WimDqbt.bQbimb6IXOhMHyQBkgwTNTgxcHOZDskU-UBaHx7KkoNKqMYxNOxgu1YqOB8NCOs6oEwQQm4t3GvWa3r58fhSwi-SKaGB_vn97TK7DnxbIiMhwXUnFUssbZqg1JUYTlMccYZcl5u_gSmHYdm2D2LpIBCHNXpCEyCY8gZC388RI7IqhtO5vNITpeJ2MuGU5ZmtlKglhGpM-vUA8Q6OZtUQ0_nNKbwHLtpPiavE967KnoXmjXiJSzu-1HVSP5fMvsmoRQ5XIz_OIpqgVeLW8IYUNOJYBEXyImybo2IJDEBf-MLJTFo0LGbR2wFsK4_B-Ew3X8lnTdNBWamiMiEDk12OUAYLskBgCRCjb2hvpwYX2c8Kkf9E5sWE3oNQoeyjG0t-wAX01iH1PzzW2d03is39O0sD8sxYBRHSCjDpf35Tzw-8n0UpYOECMMm1vm72xySChbx1-mb8PFcZo4VXhIs_dNaPVNXMSS_e6OaC3nTbD5ZkFL_Nnun4q2IhPSzLANjOHvVQlmxomublZkmGW_fp30iE9LGx3kqkCbf14HYr_6StaC2n4tjOYnuj8rUKLJciy_yMl0dX331jYJAZarhzWpV4FbcS1ra3mQQrhEiUk0hPv9JolOB6tHDpysCHIy7p-8h5WgRoeESESCxPED2HdYztDbid540i-h-FTBNXFVfsaWaXAi0Ob2fpbsokjgmQI9mj4zGvxamLqujedoL-_mSmTXbwLadETvVsa5Jsv3q8nAwbz06WCY6Wbr8NeYdVH2iUR6CBWNrz5Eoywxzv8lxxeT-rb2oyIaBK_xHLMkQkVMxMzqLj8yuBgBeajylpbZLoZl8JBx6vlvzFrBeHgRsxmL6ncFTehmIRBEsl5qQxEvx88ZWBrzctxG6eBdtWUEY7OPB-1YyEoPB31mrT26DFFMyL2WBKZaT9Aio2-1N3UNq7Mzq6OKyegq3XX-ylzxznYgxx8Js-691M6t486Hk-Q4Nn5iVAaWuoYA53BuPB_FdqZYmjrrqUNqz6uD83MOYOkXL8zM2CZX9jCyxwGSwennUQvu_j-h6mm1O1iBDpBDDbZa9tbiNPXWftVViIs9TWi-AKtXQXlqgS1ROc6Im1G33Bt0EEaJ_raHqMx7bU8sw0c764r_zuiVhTkT-lvqpcpjckUe1EJVgJA75R6stclHCm0aJAW-BD2RHbKFtj5YaSUNn18lpL7xEMKkvGDwvmT8OOqDB9d7fB8lgImeTuXBi1hbgIWid57VXBaXF-wVNfkdNFbji-6tWORe7du00M7CsncDN-rJSRGueZAOFaBwkFBj-8tyAJMDw.NwuAlhQ-MxUlYnRFT7TgYA");
	    local.setItem("amplify-signin-with-hostedUI","false");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.LastAuthUser","38eaef6d-6a98-454c-b3df-861c17cd1fcd");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.idToken","eyJraWQiOiIrMDBqWVZCZVhOQVwvTkpVa1FEa0dkUHdzM1NJSjNkVVRYTUI4VGNGa3VGZz0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY29nbml0bzp1c2VybmFtZSI6IjM4ZWFlZjZkLTZhOTgtNDU0Yy1iM2RmLTg2MWMxN2NkMWZjZCIsIm9yaWdpbl9qdGkiOiJjMmMzNDU4OS1kNDE1LTRkODAtYjgxMi1jYzkwOWE2YmZkZWYiLCJhdWQiOiIxNnZuMm5pNmQ0Mjl0ZmQzbWk4NnJlZmsycCIsImV2ZW50X2lkIjoiNGMzNjdkNzYtMjc1YS00NjU3LTlmZTUtZmIwMTgwNDExYzA2IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NzM1MTk1NTAsIm5hbWUiOiJzaGl2cmFqMiIsInBob25lX251bWJlciI6Iis5MTk4MzQzMzA5ODEiLCJleHAiOjE2NzM1MjMxNTAsImlhdCI6MTY3MzUxOTU1MCwianRpIjoiZGZjNzVlNmUtMTUxNS00ODZlLWFjZWItZDZlMmNlZjJjZGE3IiwiZW1haWwiOiJzaGl2cmFqdGVjaDM3QGdtYWlsLmNvbSJ9.Ck2VJKpmVoxowIRlon1-5YK1u2htgcJswFIxUzHL7UsTNHaH-JCwOGkHVxq6vlyAVduvG_udegj7qItdM4hWhEUlTYE3d71plp_1HmFU3CndobA_mWion263z0il7I3MBBbwIWyYHfj0sRGdAO-ZGZkG8yZfxQz1OXqGsKizCkIwbiJIVnORGU1TjcQz1GZTZonUqvEH8Y5J18NHhqDaeOv1B4kbhFb_fkP1Tgx8lyVlP_Af0ibeyiLGebcQ6S7XROd2k59bHlce0riDQoEfKts9-JHd3qoxRIXQ1iW2Eo3ECYRQnXbJ22aWfvAcmr9ZDSwbAymyfpgW70zmql4ApA");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.accessToken","eyJraWQiOiIwdlNjWTFmajFXVTQrQUsxYzN4dFdubWJ3T3hpZkpxRkthZ0pIcWwyYXJ3PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY2xpZW50X2lkIjoiMTZ2bjJuaTZkNDI5dGZkM21pODZyZWZrMnAiLCJvcmlnaW5fanRpIjoiYzJjMzQ1ODktZDQxNS00ZDgwLWI4MTItY2M5MDlhNmJmZGVmIiwiZXZlbnRfaWQiOiI0YzM2N2Q3Ni0yNzVhLTQ2NTctOWZlNS1mYjAxODA0MTFjMDYiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjczNTE5NTUwLCJleHAiOjE2NzM1MjMxNTAsImlhdCI6MTY3MzUxOTU1MCwianRpIjoiZTQyNWNkMjktM2Y0Ni00OTIxLTk0M2ItZjM3MzdkMTMzZTEwIiwidXNlcm5hbWUiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QifQ.IIr6-_YqsvGK2SVTE3cHBNhF48a4eCU4WuYiMtVG93DSy4fiHiiMeXNxn7w5FIXCcY9r2rMuHGpnodujaX6m6qvGYlcyz29wFmLHfXDDqICjIF0vHBXlS3DG0YQk2xawRPE3nQH6p7Cc2PyRKbB5F5wQqOCoLtR_qzGPiHqYev3QyP6zui9NNBcnOMTjixB0DsXqmCXxxaLv8HARBt8vlY4FEQuQ7ooRQ_pcKXNvQ7UISHIgqQyhZeMZcU6eug-BpAn5va170ijegBh-LFz_dTG-uvxqQFBbDuz1K_QPs9YWlZLcjdunrI2QSSvFX95M1H7Wx28ow2gBNmXL3qx7Rg");
	    local.setItem("accessToken","eyJraWQiOiIwdlNjWTFmajFXVTQrQUsxYzN4dFdubWJ3T3hpZkpxRkthZ0pIcWwyYXJ3PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY2xpZW50X2lkIjoiMTZ2bjJuaTZkNDI5dGZkM21pODZyZWZrMnAiLCJvcmlnaW5fanRpIjoiYzJjMzQ1ODktZDQxNS00ZDgwLWI4MTItY2M5MDlhNmJmZGVmIiwiZXZlbnRfaWQiOiI0YzM2N2Q3Ni0yNzVhLTQ2NTctOWZlNS1mYjAxODA0MTFjMDYiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjczNTE5NTUwLCJleHAiOjE2NzM1MjMxNTAsImlhdCI6MTY3MzUxOTU1MCwianRpIjoiZTQyNWNkMjktM2Y0Ni00OTIxLTk0M2ItZjM3MzdkMTMzZTEwIiwidXNlcm5hbWUiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QifQ.IIr6-_YqsvGK2SVTE3cHBNhF48a4eCU4WuYiMtVG93DSy4fiHiiMeXNxn7w5FIXCcY9r2rMuHGpnodujaX6m6qvGYlcyz29wFmLHfXDDqICjIF0vHBXlS3DG0YQk2xawRPE3nQH6p7Cc2PyRKbB5F5wQqOCoLtR_qzGPiHqYev3QyP6zui9NNBcnOMTjixB0DsXqmCXxxaLv8HARBt8vlY4FEQuQ7ooRQ_pcKXNvQ7UISHIgqQyhZeMZcU6eug-BpAn5va170ijegBh-LFz_dTG-uvxqQFBbDuz1K_QPs9YWlZLcjdunrI2QSSvFX95M1H7Wx28ow2gBNmXL3qx7Rg");
	    local.setItem("userRole","admin");
	    local.setItem("userPhoneNumber","+********0981");
	    local.setItem("bc-managed-release-choice-6.66.7_6.66.8","0.4310343780507446");
	    local.setItem("persist:root","{\"user\":\"{\\\"data\\\":{\\\"sub\\\":\\\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\\\",\\\"cognito:groups\\\":[\\\"admin\\\",\\\"patient\\\"],\\\"iss\\\":\\\"https://cognito-idp.us-east-1.amazonaws.com/us-east-1_Queq8DO0E\\\",\\\"cognito:username\\\":\\\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\\\",\\\"origin_jti\\\":\\\"c2c34589-d415-4d80-b812-cc909a6bfdef\\\",\\\"aud\\\":\\\"16vn2ni6d429tfd3mi86refk2p\\\",\\\"event_id\\\":\\\"4c367d76-275a-4657-9fe5-fb0180411c06\\\",\\\"token_use\\\":\\\"id\\\",\\\"auth_time\\\":1673519550,\\\"name\\\":\\\"shivraj2\\\",\\\"phone_number\\\":\\\"+919834330981\\\",\\\"exp\\\":1673523150,\\\"iat\\\":1673519550,\\\"jti\\\":\\\"dfc75e6e-1515-486e-aceb-d6e2cef2cda7\\\",\\\"email\\\":\\\"shivrajtech37@gmail.com\\\"},\\\"logged\\\":true,\\\"logging\\\":false,\\\"loginError\\\":null,\\\"validating\\\":false,\\\"getOtp\\\":false,\\\"retrievingAll\\\":false,\\\"retrievingAllError\\\":{\\\"message\\\":\\\"Response not JSON\\\",\\\"status\\\":401},\\\"updating\\\":false,\\\"updateError\\\":null,\\\"updated\\\":false,\\\"updatedPassword\\\":false,\\\"updatingPassword\\\":false,\\\"updatePasswordError\\\":null}\",\"_persist\":\"{\\\"version\\\":-1,\\\"rehydrated\\\":true}\"}");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.clockDrift","0");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.deviceKey","us-east-1_7c73b54d-fc32-4e8b-90c6-2edfd4623a0d");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.accessToken","eyJraWQiOiJEc28rS0YyK1Y5M0NSK0FtYTRzXC94Z0FuXC9VdTdBcjdhZ044SXh1SWF3cGc9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJjNGQ2ZjE4ZS1lNGU5LTQ1MGItOTllZC03MzNiOTJiYjAwNDUiLCJjb2duaXRvOmdyb3VwcyI6WyJBZG1pbiJdLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV9qMER5M3FYOE4iLCJjbGllbnRfaWQiOiIzMW5xNGNzcG5nanUycnRzdmVrZm84b2o3ZyIsIm9yaWdpbl9qdGkiOiJmZDJjNTYzOS03Yzc1LTRjNjItOWJlYS1mMWM4OGU0MzcyMDQiLCJldmVudF9pZCI6IjA0ODg1YzgwLWQ2OTUtNGRkYy1hN2QyLTcxMTI3ODQ0ZmVkMCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2NTI0NDQzNjYsImV4cCI6MTY1NDIzNDgyNSwiaWF0IjoxNjU0MjMxMjI1LCJqdGkiOiIzNzlkNGM5MS00NjE2LTRmNzQtOWU0ZC00ODIxZTg1Y2Y1MGQiLCJ1c2VybmFtZSI6InNhdXJhdi5hbmFuZEBtZWRpZmxpeC5jb20ifQ.OIyxA5gzWlUUaIXttHx7NyGj3GR17YcCRR_pJ4VXvovga-jGRnPsGKz6Fvv4yG0SrvCWNe12PltaxTRuo1192AAr_jm__GFjIczjhr3B4l__BMJ1eMahMqsVArAAvjjik9VvGZsX61frfBsTu11MmjceoGYscoJzBKqufE91zWEv0xMRqNNQGlg-q4DiUV3Cu52zgQ-7mBaCOwVa_J63MlcWfG7WSUgr47ix4LAmbi8H94J-9RnGOyw_22rgRX5TB54ix0INmpnOyh8bKMLJEskTJ6MtJObS8TYzsJrazBlrurqCdlWOqFDx2n24K8Obtv74Sg5Pwssm4icNk6SQ5w");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.randomPasswordKey","mlvQreD0BeNzhYmuIThPelqazmNg0Lx9ibk3OO+72Hremdj3FfPJdg==");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.userData","{\"PreferredMfaSetting\":\"SMS_MFA\",\"UserAttributes\":[{\"Name\":\"sub\",\"Value\":\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\"},{\"Name\":\"name\",\"Value\":\"shivraj2\"},{\"Name\":\"phone_number\",\"Value\":\"+919834330981\"},{\"Name\":\"email\",\"Value\":\"shivrajtech37@gmail.com\"}],\"UserMFASettingList\":[\"SMS_MFA\"],\"Username\":\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\"}");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.idToken","eyJraWQiOiIzNkZrcURhRWt1eU9WcVo3V2JMaE15UVZ2UFRNY1Z5QVJ3N2IzYUJIdXU4PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJjNGQ2ZjE4ZS1lNGU5LTQ1MGItOTllZC03MzNiOTJiYjAwNDUiLCJjb2duaXRvOmdyb3VwcyI6WyJBZG1pbiJdLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX2owRHkzcVg4TiIsImNvZ25pdG86dXNlcm5hbWUiOiJzYXVyYXYuYW5hbmRAbWVkaWZsaXguY29tIiwiZ2l2ZW5fbmFtZSI6IlNhdXJhdiIsIm9yaWdpbl9qdGkiOiJmZDJjNTYzOS03Yzc1LTRjNjItOWJlYS1mMWM4OGU0MzcyMDQiLCJhdWQiOiIzMW5xNGNzcG5nanUycnRzdmVrZm84b2o3ZyIsImV2ZW50X2lkIjoiMDQ4ODVjODAtZDY5NS00ZGRjLWE3ZDItNzExMjc4NDRmZWQwIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NTI0NDQzNjYsImV4cCI6MTY1NDIzNDgyNSwiaWF0IjoxNjU0MjMxMjI1LCJmYW1pbHlfbmFtZSI6IkFuYW5kIiwianRpIjoiNDk2YTZkYWEtYjU1NS00MTBmLWIwYzYtNTgwZjUxYmVjNzQwIiwiZW1haWwiOiJzYXVyYXYuYW5hbmRAbWVkaWZsaXguY29tIn0.h3BOXh2CIjvlBX0y7M-r4YTVOJBagj390V0EprKTER9xfVTB5coHFZ9Y84-2tqbn_3VYO5SJwLOe9sSx_CfdhxcnNNnmAnXvycAPq5NaylrebPxtS-BMprhqWwxHvThmjAPGbSRqvWf9OGKOMCnFtvuJVv6LhN_1KB2k_UR3qgjZ223BQvF0iKvetmS8gfJHwPebDrT3l1Wctlau3dt_PmTEF4yv_ccdC-g1pAtVUM64857RjNT1cG-W_dezzd0jabjZHzzYlQ5sQ6DbzgU91xWkQynlLfkrhWlxxvorzk1F8vaT3NvO2eeJg-6kDJjtSsRjF-thV4qEZjtANwVvEA");
	   
	    driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com");
	}
	
	
	public void Website_Login() throws InterruptedException
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
 
}
