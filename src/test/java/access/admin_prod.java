package access;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.testng.annotations.BeforeTest;

public class admin_prod 
{

	
	public static ChromeDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	 
	    
	@BeforeTest 
	public void Local_Storage() throws InterruptedException, IOException
	{
		FileInputStream objfile = new FileInputStream("C:\\Users\\Prasad_aute\\git\\Mediflix-Admin-Automation\\Mediflix_Adminportal\\src\\test\\resources\\Properties\\mediflix.properties");									
        prop.load(objfile);		
        
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://admin-portal.us-east-1.mediflix.com");

	    LocalStorage local = ((WebStorage) driver).getLocalStorage();    
	    
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b7aee635-e419-44be-bfc4-50bade5475d8.accessToken","eyJraWQiOiJlUzViOTZUWGxWVWpNK3RyelhwcGxPY1VhRnBjbzdOWGtpMFRoaWVsVkRrPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJiN2FlZTYzNS1lNDE5LTQ0YmUtYmZjNC01MGJhZGU1NDc1ZDgiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfd1FBeGw0b1hzIiwiY2xpZW50X2lkIjoiMzI1NjN2c2FiZWZqYzlobTRldWk5ZTlsY2siLCJvcmlnaW5fanRpIjoiY2Q5NDA3NTUtMTYwNi00MjFhLWE5MGMtYzkzZTcwMGM4NjAxIiwiZXZlbnRfaWQiOiI4ODAxZGM3OC04OGNmLTQ4MWYtYmQ0MS05MzJmYWRhZTUwZjgiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjcyMzgyODIwLCJleHAiOjE2NzIzODY0MjAsImlhdCI6MTY3MjM4MjgyMCwianRpIjoiYTIzMzQ3NTItMWRmYS00N2VlLWI0NjctZDYwYWYxZDcwZGMwIiwidXNlcm5hbWUiOiJiN2FlZTYzNS1lNDE5LTQ0YmUtYmZjNC01MGJhZGU1NDc1ZDgifQ.FNhwj7DnjA7pm02bzDM8HXMOtXJJLgN3gpFAj7InWaOoDCcNwep5FVkr7JxntJjN--ySwhBAVtC9rEHWX2qYoqYLWKK3GIfaZLMivAjjCVHwEN4tsAt9p2sOfw5FMVJYt4i-gqfd7EIPb2y2Ph6rv_wnkm8KFFS2Vs-Ro9WSVprvcyR-89GgB5Sc-GWP2qLuNlgQ9SiVSNoaC52NGv33WgGhCX-I5ZAw0Ie2k1zXbpQXto1eL3IyHKfJo8ke3sB_2AuoPtyHUif3NTRjNHdrN9CPhrOh-rZnDd9ay5IGBf7hfglELTzrxiQ2o3hFSiqB7FufCclNpzuX86XZKSl6-w");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.0c668cdc-ae35-471a-9461-be88c6800de5.deviceGroupKey","-4cPINj2d");
	    local.setItem("amplify-signin-with-hostedUI","false");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.0c668cdc-ae35-471a-9461-be88c6800de5.deviceKey","us-east-1_de1171b8-11fe-4a41-a941-52df4adb27fe");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b123e64e-b0a9-43b7-abf7-356ac5d542b2.deviceGroupKey","-4cPINj2d");
	    local.setItem("accessToken","eyJraWQiOiJlUzViOTZUWGxWVWpNK3RyelhwcGxPY1VhRnBjbzdOWGtpMFRoaWVsVkRrPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJiN2FlZTYzNS1lNDE5LTQ0YmUtYmZjNC01MGJhZGU1NDc1ZDgiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfd1FBeGw0b1hzIiwiY2xpZW50X2lkIjoiMzI1NjN2c2FiZWZqYzlobTRldWk5ZTlsY2siLCJvcmlnaW5fanRpIjoiY2Q5NDA3NTUtMTYwNi00MjFhLWE5MGMtYzkzZTcwMGM4NjAxIiwiZXZlbnRfaWQiOiI4ODAxZGM3OC04OGNmLTQ4MWYtYmQ0MS05MzJmYWRhZTUwZjgiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjcyMzgyODIwLCJleHAiOjE2NzIzODY0MjAsImlhdCI6MTY3MjM4MjgyMCwianRpIjoiYTIzMzQ3NTItMWRmYS00N2VlLWI0NjctZDYwYWYxZDcwZGMwIiwidXNlcm5hbWUiOiJiN2FlZTYzNS1lNDE5LTQ0YmUtYmZjNC01MGJhZGU1NDc1ZDgifQ.FNhwj7DnjA7pm02bzDM8HXMOtXJJLgN3gpFAj7InWaOoDCcNwep5FVkr7JxntJjN--ySwhBAVtC9rEHWX2qYoqYLWKK3GIfaZLMivAjjCVHwEN4tsAt9p2sOfw5FMVJYt4i-gqfd7EIPb2y2Ph6rv_wnkm8KFFS2Vs-Ro9WSVprvcyR-89GgB5Sc-GWP2qLuNlgQ9SiVSNoaC52NGv33WgGhCX-I5ZAw0Ie2k1zXbpQXto1eL3IyHKfJo8ke3sB_2AuoPtyHUif3NTRjNHdrN9CPhrOh-rZnDd9ay5IGBf7hfglELTzrxiQ2o3hFSiqB7FufCclNpzuX86XZKSl6-w");
	    local.setItem("userRole","admin");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.0c668cdc-ae35-471a-9461-be88c6800de5.randomPasswordKey","oakfs117QnrJ+Bt96geB6EIQZPkcynipfDBEL2bMi+laTeC5MZ6/jA==");
	    local.setItem("userPhoneNumber","+********3523");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b123e64e-b0a9-43b7-abf7-356ac5d542b2.randomPasswordKey","hRul83/LM2w43OS/HZAI0qEjUvXjAN8MuDHGBoGQUw24XyXmfTgYTw==");
	    local.setItem("persist:root","{\"user\":\"{\\\"data\\\":{\\\"sub\\\":\\\"b7aee635-e419-44be-bfc4-50bade5475d8\\\",\\\"cognito:groups\\\":[\\\"admin\\\",\\\"patient\\\"],\\\"iss\\\":\\\"https://cognito-idp.us-east-1.amazonaws.com/us-east-1_wQAxl4oXs\\\",\\\"cognito:username\\\":\\\"b7aee635-e419-44be-bfc4-50bade5475d8\\\",\\\"origin_jti\\\":\\\"cd940755-1606-421a-a90c-c93e700c8601\\\",\\\"aud\\\":\\\"32563vsabefjc9hm4eui9e9lck\\\",\\\"event_id\\\":\\\"8801dc78-88cf-481f-bd41-932fadae50f8\\\",\\\"token_use\\\":\\\"id\\\",\\\"auth_time\\\":1672382820,\\\"name\\\":\\\"Sandhya\\\",\\\"phone_number\\\":\\\"+918788093523\\\",\\\"exp\\\":1672386420,\\\"iat\\\":1672382820,\\\"jti\\\":\\\"fc69c529-7c7a-4276-842f-4b52fe82d74e\\\",\\\"email\\\":\\\"sandhya.karande@techifysolutions.com\\\"},\\\"user\\\":{},\\\"users\\\":[{\\\"id\\\":\\\"01f19e02-dc25-418c-98aa-bff7891cc924\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Jesus Guerra\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+526621055576\\\",\\\"email\\\":\\\"jesus.guerra@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-16T14:27:51.213Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-16T14:28:43.609Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"01f19e02-dc25-418c-98aa-bff7891cc924\\\"},{\\\"id\\\":\\\"0a13802d-3b72-44af-83f0-969b31b66ffe\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Augusto Claro\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+5511966292066\\\",\\\"email\\\":\\\"augusto.claro@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-09T01:07:51.799Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-09T01:08:25.401Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"0a13802d-3b72-44af-83f0-969b31b66ffe\\\"},{\\\"id\\\":\\\"0c668cdc-ae35-471a-9461-be88c6800de5\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Dipak Bhoot\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+918866332643\\\",\\\"email\\\":\\\"dipak.bhoot@techifysolutions.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-09T05:19:53.286Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-02T10:52:49.780Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"0c668cdc-ae35-471a-9461-be88c6800de5\\\"},{\\\"id\\\":\\\"181b89f5-a575-4739-ae9f-c3dae384b9f4\\\",\\\"emailVerified\\\":\\\"false\\\",\\\"name\\\":\\\"   sa\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+910000000000\\\",\\\"email\\\":\\\"fsggg@gsh.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-10T05:09:06.608Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-10T05:09:06.608Z\\\",\\\"userStatus\\\":\\\"UNCONFIRMED\\\",\\\"username\\\":\\\"181b89f5-a575-4739-ae9f-c3dae384b9f4\\\"},{\\\"id\\\":\\\"1bc0cca4-0005-464d-834c-d1f57d3f4da7\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"d\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+385917340847\\\",\\\"email\\\":\\\"mestrovic.davor+1@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-03T09:21:06.146Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-03T09:21:19.592Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"1bc0cca4-0005-464d-834c-d1f57d3f4da7\\\"},{\\\"id\\\":\\\"2411c45c-f40f-4cf5-8cc8-cd5d081342a5\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Martin Cardona\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+59894407206\\\",\\\"email\\\":\\\"martin.cardona@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-08T20:02:19.234Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-11T13:03:00.102Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"2411c45c-f40f-4cf5-8cc8-cd5d081342a5\\\"},{\\\"id\\\":\\\"249c1adb-f07f-4f15-bf53-b52ea4a7557c\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Karthy Chandra\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+19713444899\\\",\\\"email\\\":\\\"2karthy+test@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-22T20:00:21.081Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-22T20:01:24.457Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"249c1adb-f07f-4f15-bf53-b52ea4a7557c\\\"},{\\\"id\\\":\\\"275faef7-472a-437e-90b5-1cb1700e4411\\\",\\\"emailVerified\\\":\\\"false\\\",\\\"name\\\":\\\"       \\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+18788093523\\\",\\\"email\\\":\\\"sandhya.karnde@techifysolutions.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-18T04:14:18.085Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-18T04:14:18.085Z\\\",\\\"userStatus\\\":\\\"UNCONFIRMED\\\",\\\"username\\\":\\\"275faef7-472a-437e-90b5-1cb1700e4411\\\"},{\\\"id\\\":\\\"3716ce67-735d-4214-81d3-6f7af93a64c9\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"SandhyaNonadmin\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+18788093523\\\",\\\"email\\\":\\\"sandhyakarande09@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-20T09:34:30.325Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-20T09:35:14.198Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"3716ce67-735d-4214-81d3-6f7af93a64c9\\\"},{\\\"id\\\":\\\"5aab395b-db61-4e77-b96d-acaeddb76673\\\",\\\"emailVerified\\\":\\\"false\\\",\\\"name\\\":\\\"lexie\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+12489893844\\\",\\\"email\\\":\\\"lexie.sdjfdf@aol.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-09T16:32:25.962Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-09T16:32:25.962Z\\\",\\\"userStatus\\\":\\\"UNCONFIRMED\\\",\\\"username\\\":\\\"5aab395b-db61-4e77-b96d-acaeddb76673\\\"},{\\\"id\\\":\\\"5ec100bd-dbbc-4e74-835d-862039d2f050\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Adam\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+18183841188\\\",\\\"email\\\":\\\"adam@adamblazer.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-12T15:50:34.441Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-12T15:51:02.066Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"5ec100bd-dbbc-4e74-835d-862039d2f050\\\"},{\\\"id\\\":\\\"602bb361-b325-478a-a09c-6818645216cd\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"SandhyaNonAdminAcc\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+918788093523\\\",\\\"email\\\":\\\"sandhya.650@rediffmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-20T09:40:57.222Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-22T09:21:57.571Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"602bb361-b325-478a-a09c-6818645216cd\\\"},{\\\"id\\\":\\\"63d1bb2e-ccce-4c99-b868-327b832d5b67\\\",\\\"emailVerified\\\":\\\"false\\\",\\\"name\\\":\\\"123456789012345678901234567890\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+11234567890\\\",\\\"email\\\":\\\"dacf@hotmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-09T07:51:16.436Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-09T07:51:16.436Z\\\",\\\"userStatus\\\":\\\"UNCONFIRMED\\\",\\\"username\\\":\\\"63d1bb2e-ccce-4c99-b868-327b832d5b67\\\"},{\\\"id\\\":\\\"6dc5d87d-5dc3-467f-b538-6168009bbd7d\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Rita Kamdar\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+19736534382\\\",\\\"email\\\":\\\"rkamdar@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-22T14:01:09.650Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-22T14:04:02.914Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"6dc5d87d-5dc3-467f-b538-6168009bbd7d\\\"},{\\\"id\\\":\\\"6ff14c1e-cf09-458d-82a8-742665fdcf22\\\",\\\"emailVerified\\\":\\\"false\\\",\\\"name\\\":\\\"1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+11234567890\\\",\\\"email\\\":\\\"caccc@hotmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-09T07:52:06.337Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-09T07:52:06.337Z\\\",\\\"userStatus\\\":\\\"UNCONFIRMED\\\",\\\"username\\\":\\\"6ff14c1e-cf09-458d-82a8-742665fdcf22\\\"},{\\\"id\\\":\\\"79fef3f4-24e2-43bb-b9c6-496654b9f91d\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Sanjay Patel\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+16175016600\\\",\\\"email\\\":\\\"sanjay@sanjaypatel.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-26T13:53:16.808Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-26T13:54:41.820Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"79fef3f4-24e2-43bb-b9c6-496654b9f91d\\\"},{\\\"id\\\":\\\"86f86cee-1981-4715-b293-dcbce4c1912c\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Spencer Falk\\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+19143091511\\\",\\\"email\\\":\\\"spencer.falk@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-18T17:35:05.952Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-18T17:35:19.449Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"86f86cee-1981-4715-b293-dcbce4c1912c\\\"},{\\\"id\\\":\\\"9e77d133-5359-4276-90e0-e749298ba3a7\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Lara Noel\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+12032496299\\\",\\\"email\\\":\\\"lara.noel@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-27T19:30:44.276Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-28T17:52:39.576Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"9e77d133-5359-4276-90e0-e749298ba3a7\\\"},{\\\"id\\\":\\\"a496a797-fcb9-4211-a689-2de359a1f316\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Kamya Chandra\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+19712954386\\\",\\\"email\\\":\\\"kamya.chandra@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-08T15:46:22.523Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-08T17:00:21.434Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"a496a797-fcb9-4211-a689-2de359a1f316\\\"},{\\\"id\\\":\\\"b123e64e-b0a9-43b7-abf7-356ac5d542b2\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Saurav Anand\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+918340328513\\\",\\\"email\\\":\\\"anandsaurav6@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-10T14:08:46.279Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-16T10:10:36.127Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"b123e64e-b0a9-43b7-abf7-356ac5d542b2\\\"},{\\\"id\\\":\\\"b2ef4be6-268a-4f21-9bf9-05192fcfcfed\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Sharon Cammisa\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+19177411475\\\",\\\"email\\\":\\\"scammisa@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-11T15:12:49.664Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-11T19:11:42.905Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"b2ef4be6-268a-4f21-9bf9-05192fcfcfed\\\"},{\\\"id\\\":\\\"b7aee635-e419-44be-bfc4-50bade5475d8\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Sandhya00\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+918788093523\\\",\\\"email\\\":\\\"sandhya.karande@techifysolutions.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-11T05:32:30.565Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-23T12:03:02.846Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"b7aee635-e419-44be-bfc4-50bade5475d8\\\"},{\\\"id\\\":\\\"b8600338-92f4-4931-b0ed-08782f73d970\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Davor\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+385917340847\\\",\\\"email\\\":\\\"davor.mestrovic@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-11T10:00:17.721Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-11T10:01:01.080Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"b8600338-92f4-4931-b0ed-08782f73d970\\\"},{\\\"id\\\":\\\"c20cd937-1bab-4e5b-818a-05105a67fc44\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Larry Walton\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+19713444899\\\",\\\"email\\\":\\\"2karthy@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-27T02:22:16.471Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-16T13:48:21.246Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"c20cd937-1bab-4e5b-818a-05105a67fc44\\\"},{\\\"id\\\":\\\"c72474f4-3909-4c7f-8828-e8d63fdd2b1d\\\",\\\"emailVerified\\\":\\\"false\\\",\\\"name\\\":\\\"     \\\",\\\"phoneNumberVerified\\\":\\\"false\\\",\\\"phoneNumber\\\":\\\"+18788094823\\\",\\\"email\\\":\\\"sabjj@hotmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-04T10:28:15.643Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-04T10:28:15.643Z\\\",\\\"userStatus\\\":\\\"UNCONFIRMED\\\",\\\"username\\\":\\\"c72474f4-3909-4c7f-8828-e8d63fdd2b1d\\\"},{\\\"id\\\":\\\"d32ddfb3-40fe-4a6d-8ac7-0c8e0da20e7e\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Uluc Sengil\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+905412554381\\\",\\\"email\\\":\\\"uluc.sengil@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-11T17:13:22.011Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-16T16:44:54.046Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"d32ddfb3-40fe-4a6d-8ac7-0c8e0da20e7e\\\"},{\\\"id\\\":\\\"d9591f71-4cc9-4ccf-89ca-137deb570513\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"shivraj\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+917588609750\\\",\\\"email\\\":\\\"shivrajtech37@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-11T05:38:27.818Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-11T05:42:50.658Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"d9591f71-4cc9-4ccf-89ca-137deb570513\\\"},{\\\"id\\\":\\\"df1d2935-ff47-485b-8c7a-6e0e496ac300\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Karthy Chandra\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+19713444899\\\",\\\"email\\\":\\\"karthy.chandra@mediflix.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-14T19:37:11.155Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-05T14:02:55.213Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"df1d2935-ff47-485b-8c7a-6e0e496ac300\\\"},{\\\"id\\\":\\\"f2b2d3a9-d48b-457f-8a3c-db5e68081fd3\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"L\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+12489303933\\\",\\\"email\\\":\\\"lexie.ernst+1@gmail.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-08-19T02:15:22.671Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-08-19T02:16:03.747Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"f2b2d3a9-d48b-457f-8a3c-db5e68081fd3\\\"},{\\\"id\\\":\\\"f42d74a4-69f6-44c2-831c-2349766fb532\\\",\\\"emailVerified\\\":\\\"true\\\",\\\"name\\\":\\\"Lauren McAuliffe\\\",\\\"phoneNumberVerified\\\":\\\"true\\\",\\\"phoneNumber\\\":\\\"+16174179232\\\",\\\"email\\\":\\\"lauren@7magnolia.com\\\",\\\"enabled\\\":true,\\\"userCreateDate\\\":\\\"2022-07-09T23:33:40.945Z\\\",\\\"userLastModifiedDate\\\":\\\"2022-07-09T23:35:45.392Z\\\",\\\"userStatus\\\":\\\"CONFIRMED\\\",\\\"username\\\":\\\"f42d74a4-69f6-44c2-831c-2349766fb532\\\"}],\\\"getOtp\\\":false,\\\"logged\\\":true,\\\"logging\\\":false,\\\"loginError\\\":null,\\\"validating\\\":false,\\\"updated\\\":false,\\\"updating\\\":false,\\\"updatedPassword\\\":false,\\\"updatingPassword\\\":false,\\\"retrievingAll\\\":false,\\\"retrievingAllError\\\":null}\",\"_persist\":\"{\\\"version\\\":-1,\\\"rehydrated\\\":true}\"}");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b7aee635-e419-44be-bfc4-50bade5475d8.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.jNscY22cyCOHIn84xQnC2ZC3DglOcHrVRIB4K2IA3n5-IJku0z9fkvSSsISQF9Ckvbv1_PPHfFZsw9A9k7ZdxsfCoCB8Bh-ii_vHYNDBlHYHVNAtvGlWH98RtKsC0BYvCefsLieFirhn_maO8bE6RANZKp9V9aOo1HsjV4smJySG6q6sP6asFMqJ7s6rCzOUXJtKAwmgOm9dRDyFfhqRz9dZTeQTCVy5Gi4rZJt8ldWobTdKkpqTprPD8_ZkY4qMxp4-WCN7qyPns3TTIabk3Kh7YMHigKiteGHKQEG8_6EEYJp14sg7OpyNm001J1decU6ggkiH7bqmZK4S2aQh5g.jym75ZB3lI5ks2iv.WcLpE79awUN8e4x78x0KpaZiB-lngD4uSiYMacIJtMdZCv09bAkFA6lQlgCuZBftGdqwRPAZY8rtGkDN2MuBo7sr9zBwMQtCcXU88XwIvt6skHvGf9cheD_D3_i2CAQyBtx9Vds7w46dV41WnFMzhN2-rNdDzYhH-CMptbFybV72lpP3SnZcd-qhTNHFOkVhwn_gUcRMS84nTfXsiYqma4B9Uo0oEqvsO1o6SNbhCTgk9ZtO9MjPtLbyYTSmu1_6Pqde6ZK7epPwt6tCJ9907eqZRKl-_XqtgJWrAArpt05x4j5O1TJaAc8jahxHfADdY05ieMLnGFPTEuvsIdlHQS4VyTM07oFWzedvAGP2GhhuazBJv00UrGSJ_RiRSxIct80C0vWku0Q4FC9qIED_7raBNBMSscy8T0o7E2A1s5D1itd1sy3mWbtIasCimBQi4Dh4ieHSkjH8hulORvtTr7JGqhfcQux8cFgN91QX9XtyGFMHHIpj7pB6dMhrWwaoNLy66Tv8Gi6k6ENmoP7bTb0djOqFeGnimnGZf-SQDTakRiUWVYOZizA6AJyDwg9JBBfrmpxyv3KJ7Gg-0Y_Kq7RrCxz-hCPmmCjACsSYjhQinoWqn5K7H0f8_Z3XHUhlMFTOl0BNCIN7SxxUDb71Jk2nY1P8OCZO-cTn9N2IXSO7Nn-aSn_68pbf5uxyauyz3ztsSrEDKDot7WBPgGlp4oIdGkv0pgetVcJhzfNml2wgpOW9gdSXlxp48brRW6Z9wjfmwi75NopndNtwoVBVqtZQJ8mj_PBk2p6JMa1GBWWoDTMFaIGZYNiP-_AQBkyvzlsDslQHsbAaD4pjqXPu6nF8m7ZA4o4fO2LLenI8-JNQq26Q3q4tIrxpdBp9xOtNf2EOjIhYO9jiJ8-Dmiu2RSij3pxHtU9WdGymiNcjiin2juDF5y78IJC72oyOPeYlRUJv8VHiCn4weIYRVaibYyGjVxTYeLzGF2GLx6-xeiHwf39sT0yaNd1IKfH-n7w4NZMc5uXsPfspm6hnWTmmHmqhfG6Fb2c3xDzeRml-HtqTYqDn_taMq8_fO4eioS_ONtzhymeFWp14gKa_kflCkTumxOurEmnajt1SmcLTvg1buyTwHYQ0h3QB6Y0d7jr4uNZpI8QMEwzFxtdw6pnuobI2eM6mhO3EV0XM129XFK6rCUPlmGznp7YKLV5DJJHscilEELHQySMbA2dI85DY4tieZ-QD1sh2fPISrxk8fdro6dYnnn4GZpk0SmfZwdUZ4tSVEULefYLqwDkSTamO9bebiN-uaq5nBbyw2Cp5RDqCxSwAHP1OfOpJCQ.XAhsGfJErF5xs17Ekv4B2Q");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b7aee635-e419-44be-bfc4-50bade5475d8.userData","{\"PreferredMfaSetting\":\"SMS_MFA\",\"UserAttributes\":[{\"Name\":\"sub\",\"Value\":\"b7aee635-e419-44be-bfc4-50bade5475d8\"},{\"Name\":\"name\",\"Value\":\"Sandhya\"},{\"Name\":\"phone_number\",\"Value\":\"+918788093523\"},{\"Name\":\"email\",\"Value\":\"sandhya.karande@techifysolutions.com\"}],\"UserMFASettingList\":[\"SMS_MFA\"],\"Username\":\"b7aee635-e419-44be-bfc4-50bade5475d8\"}");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b7aee635-e419-44be-bfc4-50bade5475d8.idToken","eyJraWQiOiJpam1qYnRMcyt4VzgwOHRBNlZsWlJpTkRyWlVcL1BVWHh4eTJmS1BOc05UOD0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJiN2FlZTYzNS1lNDE5LTQ0YmUtYmZjNC01MGJhZGU1NDc1ZDgiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfd1FBeGw0b1hzIiwiY29nbml0bzp1c2VybmFtZSI6ImI3YWVlNjM1LWU0MTktNDRiZS1iZmM0LTUwYmFkZTU0NzVkOCIsIm9yaWdpbl9qdGkiOiJjZDk0MDc1NS0xNjA2LTQyMWEtYTkwYy1jOTNlNzAwYzg2MDEiLCJhdWQiOiIzMjU2M3ZzYWJlZmpjOWhtNGV1aTllOWxjayIsImV2ZW50X2lkIjoiODgwMWRjNzgtODhjZi00ODFmLWJkNDEtOTMyZmFkYWU1MGY4IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NzIzODI4MjAsIm5hbWUiOiJTYW5kaHlhIiwicGhvbmVfbnVtYmVyIjoiKzkxODc4ODA5MzUyMyIsImV4cCI6MTY3MjM4NjQyMCwiaWF0IjoxNjcyMzgyODIwLCJqdGkiOiJmYzY5YzUyOS03YzdhLTQyNzYtODQyZi00YjUyZmU4MmQ3NGUiLCJlbWFpbCI6InNhbmRoeWEua2FyYW5kZUB0ZWNoaWZ5c29sdXRpb25zLmNvbSJ9.flklpi6xyq-qvc1fMiUl_qo2HRWWvckdMtAgR-ubyXOzXrTnLz78JFESO50wjndXPeSMKrLONQaFrJ3XLOIVQ7c2rNrBi_5fSzV7YpGIu6zBhrmqX_7wy2xltkpxP1FxUTjjC0yaG9ZE-nhT5yb_cwkj4H6IfXkRnEivyWaiK3dGzL0HkD0R3d8gGIR3f1smPMvQPVom37nLMJa7PMcI5TSWGX1R-2KY1S6OWM-5Qo6AT3TLOqhuw-0kxukq3NS2rwE9SxG579uy7lVXvn_5nu-qMq9Icd9whtyDsxN24sY1-S4hcfgXMkeIDMbE0ERIZzX1oHucHGzrxNNHPSG8bA");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b123e64e-b0a9-43b7-abf7-356ac5d542b2.deviceKey","us-east-1_14ba7a70-d0e0-4dca-bdc5-987646a09ac4");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.LastAuthUser","b7aee635-e419-44be-bfc4-50bade5475d8");
	    local.setItem("CognitoIdentityServiceProvider.32563vsabefjc9hm4eui9e9lck.b7aee635-e419-44be-bfc4-50bade5475d8.clockDrift","-1");
	    
	    
	    driver.navigate().to("https://admin-portal.us-east-1.mediflix.com");
	       	    
	 }
}
