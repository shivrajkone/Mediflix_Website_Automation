package website_modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_expert_cms_to_website 
{
	
	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	
	String expert_name2="Dr.Anderson";
	String expert_slug2="ABCC";
	String expert_bio2="Dr Anderson is also one of the best doctors in Pediatric Anesthesiology around the world.";
	String expert_tagcount2;
	WebElement searchbox4;
	
	String search_expert="Meet our Experts";
	
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void local_store()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://admin-portal.us-east-1.dev.mediflix.com");

	    LocalStorage local = ((WebStorage) driver).getLocalStorage();    

	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.LastAuthUser","saurav.anand@mediflix.com");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.deviceGroupKey","-9b0ne3AP");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.QNjDAfugcR1wT4HCi-cMMWLGlzB7cssd97zNIq2cUnDqzmFYr0VglG8y730pdeyDC67cpDhx9vxesHO_WvGRIcp-6BcxZqozjPAdWNFlZu6OqLxYkl7tcFZZLDX0Y6Dyl3uu0N91eY4nFtTY6tcTBAhAl0meQuCLZMzKeUspkCTIYYcXnlhFNOAGdo_bYIiQEitrJiXEmzrHD0wrMR-6v6qhaRpIgCtdvYg9prihOzbFDhViRDL4d6oiiHaSTkOJ2K86-8rOxDe_S4yEn4CSeNPMlPNL752TRV9gASQS-I34NAyd4EkB70M3it_YNfpmkK-z74H64F2JBnqkPSpfbw.3VyDXmYv4nocRwIt.2-RQV5SmsXFjsFRQp3ZyUoQwwJMU-GsEhEAepwZ2110eFXQWQWxnO6QKBYUAeNnCyq1Dl732glM0pZQHNq5ZqGzmHRFklX9Hy54MFUyOTal6Tw95MrxTsSKn7e4F5I6QeGHPWNryCS-pS7cI5mpcsnxLD-DLZjU0bBzX-aru1YUK3PYiLV3eBhq15JU0dls7G44CFbn5UB5l9qGghFqpm0DDj1rYEVHGBXgamkycljwEjLFgzDMUvn5YGofaLw7c9hECbKrMqlwBkAPYsW3kaz7cLNQopzhe-3RfKEgwVa9Cs4PeQS2iw3m1NvBMQln_UVPyM7kLeu_siHq2RfP_Ue_w5WbDOgtWhp8lL_Yl0d1WHByvBpREIJtxlRAdRE2hsZ6jwBQeG6fdHZHLbAQXS8ZvLQtfJNRuY-0qsX7ozBICMtcHTabxok8T7H3B3W727htFUD3scoLtdVjXJ0_p5FeITn6zOetlLf2hc0gzavUhHQMH0ndtWllOtv8IRbKzQUeOkpsbb1J54Qj-d8gsdH2RCYtFftIyODSlBoDLH3zpD__7BANQB7Wq8Bji5I5-WHkTUKoNUBZ7YsgU2qfZk5g3YFncvrJ-bjkIuUd7rUDKKQAW6uGpPA1sbwJSLxEivmP8fqWEo2wVR6-uB8siRP2bUCVJCROCpwH29LFBZAQFyo9MDh9YQoA_YbO8fXNguC8PgLFo6V06wpnQIfvuHWsmO8RSuobh4xvBkODEtZo8cA8ehJDjfWeDbkPy73pEHEnGRf6Q-8ACks7cdLSwojlJpaULTPZc04eOv0ebJFujhDh7yxyh-Pn2q_A50irdhe8deweaJaQ0RN5oR9_smPGXcOhZFmDeTTCdgds_MIatDtyZ6R95vxz0ZaS7og5X5FiRBd7hnuEMKw-yVfCfkI6GLCvLHk7GGAhhwBWym_8tfLnc8yGfn6DPe_qXSLxtEMEJFQds_pjtLgOy08A5hspPyzXZMuFpBjz2f9lNKj2gQXR-AoIXVUYpyQHIRfKqar04bD2ByqMnVSzntrkkdQj7HeBikFoqhJY9XakVpaqsw0aCR1rL_eGEjK2kcrmLv7mot64yhpHurDRiFBq3J0dE9qGhXX6FCzrW0HxS5-d8_nq03JIr7VOx1REZ1dOK8Sx6XY3o-ykuXQ2EvqEvHuxlNzK_5KF_VB9aVZ0Czym6Sxq78ZSc0v3V4dlWvH__mfSDW9cPwGFla5_AMuYYnWrpu0j9bONKBS6kxVZL-HwJuL-dDqNi0sgBCLN6bXEQhrBaTfrtkPXl0Hqz7OzS9j7usXP5Qe1xGET8I_QdICJGvfwH14mXYIrxNA.O-vvVBGXGgMk4Oz_kq0FOQ");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.accessToken","eyJraWQiOiIwdlNjWTFmajFXVTQrQUsxYzN4dFdubWJ3T3hpZkpxRkthZ0pIcWwyYXJ3PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY2xpZW50X2lkIjoiMTZ2bjJuaTZkNDI5dGZkM21pODZyZWZrMnAiLCJvcmlnaW5fanRpIjoiYTkyYWFhNzYtOTY0NC00MDQxLWE5YTAtMTMwMDI0ZGIyMDRjIiwiZXZlbnRfaWQiOiI5NzFkZjRhNi1hNTA4LTQ0OGMtODFjZS03YWIxODgyYmFlMzkiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjcxNDU1NTc4LCJleHAiOjE2NzE0NTkxNzgsImlhdCI6MTY3MTQ1NTU3OCwianRpIjoiNWU5M2Q5NDUtY2U0Yi00N2MxLTg1ZmItOWI4NTMzZjY1ZjZhIiwidXNlcm5hbWUiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QifQ.TPH8Qzo8xrp2TS82DkIqAbNJHMA4uaDvFJ9lt0pC8GmtSXZNbT_qhOaYyC8WEHkwQZIVGOx6Ss7aAnjNF0gWetAjoPtcfDbi9bSxY1ZXGmNixfDGppkFEwOGov6B7KqR4WraPD-oty_3IO09iGgZddvpxtnxgkpy4MdvRgtBDRZTNeWYGF2U1HdaR-2ywY5PwHgHH5qgvoWRYZkVwybvZ6Qq6Fro2VLpeR4XxL8EaYLLvXTokIN8b8oQEhN6ra6dstdEu_s6quJMKQK8SveM2wVkhg_Mj21dwA8GW56nVXMqfCqjSnb5j4FHVX2CkmVQi5kPYhpc69AuQC00sQxLkA");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.refreshToken","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.Hx7p23V3Iqqk4nSNbIK-zzqct84fZfNe2jbZxnqyBs6AqeG_2a4hp1QkyZ8t6wKHEDskLmElkyzi4W4gUht4AKQMMEjdOoccb_IGA6TUbYPBKambcY5zOxWizdEv_wig1Gj5wy5EHBpV3neNetWJnDPPLV_tIYZEvgTeEvNIq57EdFbdwCo-mo_FZXjHByvs9JJ92uEgzaN5tQQTWmeDKX4vmZT0Qtcs39RNh0nxXDbbbpiDW64VCHoAftd1gG-jAYrHWnIN_BhVSyL0aETHuDhu5d_LLp0xBCbBEJztextK6ihZwDwB6sCeTwqryrOWekcO7YnbkI4-R8_MVNWRpQ.vVdm-qtf3WimDqbt.bQbimb6IXOhMHyQBkgwTNTgxcHOZDskU-UBaHx7KkoNKqMYxNOxgu1YqOB8NCOs6oEwQQm4t3GvWa3r58fhSwi-SKaGB_vn97TK7DnxbIiMhwXUnFUssbZqg1JUYTlMccYZcl5u_gSmHYdm2D2LpIBCHNXpCEyCY8gZC388RI7IqhtO5vNITpeJ2MuGU5ZmtlKglhGpM-vUA8Q6OZtUQ0_nNKbwHLtpPiavE967KnoXmjXiJSzu-1HVSP5fMvsmoRQ5XIz_OIpqgVeLW8IYUNOJYBEXyImybo2IJDEBf-MLJTFo0LGbR2wFsK4_B-Ew3X8lnTdNBWamiMiEDk12OUAYLskBgCRCjb2hvpwYX2c8Kkf9E5sWE3oNQoeyjG0t-wAX01iH1PzzW2d03is39O0sD8sxYBRHSCjDpf35Tzw-8n0UpYOECMMm1vm72xySChbx1-mb8PFcZo4VXhIs_dNaPVNXMSS_e6OaC3nTbD5ZkFL_Nnun4q2IhPSzLANjOHvVQlmxomublZkmGW_fp30iE9LGx3kqkCbf14HYr_6StaC2n4tjOYnuj8rUKLJciy_yMl0dX331jYJAZarhzWpV4FbcS1ra3mQQrhEiUk0hPv9JolOB6tHDpysCHIy7p-8h5WgRoeESESCxPED2HdYztDbid540i-h-FTBNXFVfsaWaXAi0Ob2fpbsokjgmQI9mj4zGvxamLqujedoL-_mSmTXbwLadETvVsa5Jsv3q8nAwbz06WCY6Wbr8NeYdVH2iUR6CBWNrz5Eoywxzv8lxxeT-rb2oyIaBK_xHLMkQkVMxMzqLj8yuBgBeajylpbZLoZl8JBx6vlvzFrBeHgRsxmL6ncFTehmIRBEsl5qQxEvx88ZWBrzctxG6eBdtWUEY7OPB-1YyEoPB31mrT26DFFMyL2WBKZaT9Aio2-1N3UNq7Mzq6OKyegq3XX-ylzxznYgxx8Js-691M6t486Hk-Q4Nn5iVAaWuoYA53BuPB_FdqZYmjrrqUNqz6uD83MOYOkXL8zM2CZX9jCyxwGSwennUQvu_j-h6mm1O1iBDpBDDbZa9tbiNPXWftVViIs9TWi-AKtXQXlqgS1ROc6Im1G33Bt0EEaJ_raHqMx7bU8sw0c764r_zuiVhTkT-lvqpcpjckUe1EJVgJA75R6stclHCm0aJAW-BD2RHbKFtj5YaSUNn18lpL7xEMKkvGDwvmT8OOqDB9d7fB8lgImeTuXBi1hbgIWid57VXBaXF-wVNfkdNFbji-6tWORe7du00M7CsncDN-rJSRGueZAOFaBwkFBj-8tyAJMDw.NwuAlhQ-MxUlYnRFT7TgYA");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.clockDrift","0");
	    local.setItem("amplify-signin-with-hostedUI","false");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.LastAuthUser","38eaef6d-6a98-454c-b3df-861c17cd1fcd");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.idToken","eyJraWQiOiIrMDBqWVZCZVhOQVwvTkpVa1FEa0dkUHdzM1NJSjNkVVRYTUI4VGNGa3VGZz0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY29nbml0bzp1c2VybmFtZSI6IjM4ZWFlZjZkLTZhOTgtNDU0Yy1iM2RmLTg2MWMxN2NkMWZjZCIsIm9yaWdpbl9qdGkiOiJhOTJhYWE3Ni05NjQ0LTQwNDEtYTlhMC0xMzAwMjRkYjIwNGMiLCJhdWQiOiIxNnZuMm5pNmQ0Mjl0ZmQzbWk4NnJlZmsycCIsImV2ZW50X2lkIjoiOTcxZGY0YTYtYTUwOC00NDhjLTgxY2UtN2FiMTg4MmJhZTM5IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NzE0NTU1NzgsIm5hbWUiOiJzaGl2cmFqMiIsInBob25lX251bWJlciI6Iis5MTk4MzQzMzA5ODEiLCJleHAiOjE2NzE0NTkxNzgsImlhdCI6MTY3MTQ1NTU3OCwianRpIjoiYTI5MTI0MDgtMWY4Zi00NGFkLWIwZjYtY2FiZWRkNDUxYWZiIiwiZW1haWwiOiJzaGl2cmFqdGVjaDM3QGdtYWlsLmNvbSJ9.WSUieNzziTfBcnaYv8jl8nGlpkYgMJOzlf_bSqFF9MASWGX-iv6O9yBgDyEfRmYN9noi-KJGiCZb0AW-XtmC_DfGaEceeZQ-0S_Kn2ziNFFhm10himMqxF_O_Xpr1KOsqI3sjYFmVCXF37LG7h0GMeVUvyaRI0NR6nHpl1ZNoCIIyb0bSl80a8T22DxWUFYwFFJc0_CvEWeWe-SLLr0KDMaBwQ1AGNbKubJLBbP_v_c7bQlonMmMGDElRjjkwFhYxecDlbFormPsfucprBqt15ptGXOXoL2fxRKR1hXchPAtvkodM1E0WBERAhuap9ubRHQ6uNrCEVFNkUMRXOOkow");
	    local.setItem("accessToken","eyJraWQiOiIwdlNjWTFmajFXVTQrQUsxYzN4dFdubWJ3T3hpZkpxRkthZ0pIcWwyYXJ3PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QiLCJjb2duaXRvOmdyb3VwcyI6WyJhZG1pbiIsInBhdGllbnQiXSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMS5hbWF6b25hd3MuY29tXC91cy1lYXN0LTFfUXVlcThETzBFIiwiY2xpZW50X2lkIjoiMTZ2bjJuaTZkNDI5dGZkM21pODZyZWZrMnAiLCJvcmlnaW5fanRpIjoiYTkyYWFhNzYtOTY0NC00MDQxLWE5YTAtMTMwMDI0ZGIyMDRjIiwiZXZlbnRfaWQiOiI5NzFkZjRhNi1hNTA4LTQ0OGMtODFjZS03YWIxODgyYmFlMzkiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjcxNDU1NTc4LCJleHAiOjE2NzE0NTkxNzgsImlhdCI6MTY3MTQ1NTU3OCwianRpIjoiNWU5M2Q5NDUtY2U0Yi00N2MxLTg1ZmItOWI4NTMzZjY1ZjZhIiwidXNlcm5hbWUiOiIzOGVhZWY2ZC02YTk4LTQ1NGMtYjNkZi04NjFjMTdjZDFmY2QifQ.TPH8Qzo8xrp2TS82DkIqAbNJHMA4uaDvFJ9lt0pC8GmtSXZNbT_qhOaYyC8WEHkwQZIVGOx6Ss7aAnjNF0gWetAjoPtcfDbi9bSxY1ZXGmNixfDGppkFEwOGov6B7KqR4WraPD-oty_3IO09iGgZddvpxtnxgkpy4MdvRgtBDRZTNeWYGF2U1HdaR-2ywY5PwHgHH5qgvoWRYZkVwybvZ6Qq6Fro2VLpeR4XxL8EaYLLvXTokIN8b8oQEhN6ra6dstdEu_s6quJMKQK8SveM2wVkhg_Mj21dwA8GW56nVXMqfCqjSnb5j4FHVX2CkmVQi5kPYhpc69AuQC00sQxLkA");
	    local.setItem("userRole","admin");
	    local.setItem("userPhoneNumber","+********0981");
	    local.setItem("persist:root","{\"user\":\"{\\\"data\\\":{\\\"sub\\\":\\\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\\\",\\\"cognito:groups\\\":[\\\"admin\\\",\\\"patient\\\"],\\\"iss\\\":\\\"https://cognito-idp.us-east-1.amazonaws.com/us-east-1_Queq8DO0E\\\",\\\"cognito:username\\\":\\\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\\\",\\\"origin_jti\\\":\\\"a92aaa76-9644-4041-a9a0-130024db204c\\\",\\\"aud\\\":\\\"16vn2ni6d429tfd3mi86refk2p\\\",\\\"event_id\\\":\\\"971df4a6-a508-448c-81ce-7ab1882bae39\\\",\\\"token_use\\\":\\\"id\\\",\\\"auth_time\\\":1671455578,\\\"name\\\":\\\"shivraj2\\\",\\\"phone_number\\\":\\\"+919834330981\\\",\\\"exp\\\":1671459178,\\\"iat\\\":1671455578,\\\"jti\\\":\\\"a2912408-1f8f-44ad-b0f6-cabedd451afb\\\",\\\"email\\\":\\\"shivrajtech37@gmail.com\\\"},\\\"logged\\\":true,\\\"logging\\\":false,\\\"loginError\\\":null,\\\"validating\\\":false,\\\"getOtp\\\":false,\\\"retrievingAll\\\":false,\\\"retrievingAllError\\\":{\\\"message\\\":\\\"Response not JSON\\\",\\\"status\\\":401},\\\"updating\\\":false,\\\"updateError\\\":null,\\\"updated\\\":false,\\\"updatedPassword\\\":false,\\\"updatingPassword\\\":false,\\\"updatePasswordError\\\":null}\",\"_persist\":\"{\\\"version\\\":-1,\\\"rehydrated\\\":true}\"}");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.clockDrift","0");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.deviceKey","us-east-1_7c73b54d-fc32-4e8b-90c6-2edfd4623a0d");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.accessToken","eyJraWQiOiJEc28rS0YyK1Y5M0NSK0FtYTRzXC94Z0FuXC9VdTdBcjdhZ044SXh1SWF3cGc9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJjNGQ2ZjE4ZS1lNGU5LTQ1MGItOTllZC03MzNiOTJiYjAwNDUiLCJjb2duaXRvOmdyb3VwcyI6WyJBZG1pbiJdLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV9qMER5M3FYOE4iLCJjbGllbnRfaWQiOiIzMW5xNGNzcG5nanUycnRzdmVrZm84b2o3ZyIsIm9yaWdpbl9qdGkiOiJmZDJjNTYzOS03Yzc1LTRjNjItOWJlYS1mMWM4OGU0MzcyMDQiLCJldmVudF9pZCI6IjA0ODg1YzgwLWQ2OTUtNGRkYy1hN2QyLTcxMTI3ODQ0ZmVkMCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2NTI0NDQzNjYsImV4cCI6MTY1NDIzNDgyNSwiaWF0IjoxNjU0MjMxMjI1LCJqdGkiOiIzNzlkNGM5MS00NjE2LTRmNzQtOWU0ZC00ODIxZTg1Y2Y1MGQiLCJ1c2VybmFtZSI6InNhdXJhdi5hbmFuZEBtZWRpZmxpeC5jb20ifQ.OIyxA5gzWlUUaIXttHx7NyGj3GR17YcCRR_pJ4VXvovga-jGRnPsGKz6Fvv4yG0SrvCWNe12PltaxTRuo1192AAr_jm__GFjIczjhr3B4l__BMJ1eMahMqsVArAAvjjik9VvGZsX61frfBsTu11MmjceoGYscoJzBKqufE91zWEv0xMRqNNQGlg-q4DiUV3Cu52zgQ-7mBaCOwVa_J63MlcWfG7WSUgr47ix4LAmbi8H94J-9RnGOyw_22rgRX5TB54ix0INmpnOyh8bKMLJEskTJ6MtJObS8TYzsJrazBlrurqCdlWOqFDx2n24K8Obtv74Sg5Pwssm4icNk6SQ5w");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.randomPasswordKey","mlvQreD0BeNzhYmuIThPelqazmNg0Lx9ibk3OO+72Hremdj3FfPJdg==");
	    local.setItem("CognitoIdentityServiceProvider.16vn2ni6d429tfd3mi86refk2p.38eaef6d-6a98-454c-b3df-861c17cd1fcd.userData","{\"PreferredMfaSetting\":\"SMS_MFA\",\"UserAttributes\":[{\"Name\":\"sub\",\"Value\":\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\"},{\"Name\":\"name\",\"Value\":\"shivraj2\"},{\"Name\":\"phone_number\",\"Value\":\"+919834330981\"},{\"Name\":\"email\",\"Value\":\"shivrajtech37@gmail.com\"}],\"UserMFASettingList\":[\"SMS_MFA\"],\"Username\":\"38eaef6d-6a98-454c-b3df-861c17cd1fcd\"}");
	    local.setItem("CognitoIdentityServiceProvider.31nq4cspngju2rtsvekfo8oj7g.saurav.anand@mediflix.com.idToken","eyJraWQiOiIzNkZrcURhRWt1eU9WcVo3V2JMaE15UVZ2UFRNY1Z5QVJ3N2IzYUJIdXU4PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJjNGQ2ZjE4ZS1lNGU5LTQ1MGItOTllZC03MzNiOTJiYjAwNDUiLCJjb2duaXRvOmdyb3VwcyI6WyJBZG1pbiJdLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX2owRHkzcVg4TiIsImNvZ25pdG86dXNlcm5hbWUiOiJzYXVyYXYuYW5hbmRAbWVkaWZsaXguY29tIiwiZ2l2ZW5fbmFtZSI6IlNhdXJhdiIsIm9yaWdpbl9qdGkiOiJmZDJjNTYzOS03Yzc1LTRjNjItOWJlYS1mMWM4OGU0MzcyMDQiLCJhdWQiOiIzMW5xNGNzcG5nanUycnRzdmVrZm84b2o3ZyIsImV2ZW50X2lkIjoiMDQ4ODVjODAtZDY5NS00ZGRjLWE3ZDItNzExMjc4NDRmZWQwIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NTI0NDQzNjYsImV4cCI6MTY1NDIzNDgyNSwiaWF0IjoxNjU0MjMxMjI1LCJmYW1pbHlfbmFtZSI6IkFuYW5kIiwianRpIjoiNDk2YTZkYWEtYjU1NS00MTBmLWIwYzYtNTgwZjUxYmVjNzQwIiwiZW1haWwiOiJzYXVyYXYuYW5hbmRAbWVkaWZsaXguY29tIn0.h3BOXh2CIjvlBX0y7M-r4YTVOJBagj390V0EprKTER9xfVTB5coHFZ9Y84-2tqbn_3VYO5SJwLOe9sSx_CfdhxcnNNnmAnXvycAPq5NaylrebPxtS-BMprhqWwxHvThmjAPGbSRqvWf9OGKOMCnFtvuJVv6LhN_1KB2k_UR3qgjZ223BQvF0iKvetmS8gfJHwPebDrT3l1Wctlau3dt_PmTEF4yv_ccdC-g1pAtVUM64857RjNT1cG-W_dezzd0jabjZHzzYlQ5sQ6DbzgU91xWkQynlLfkrhWlxxvorzk1F8vaT3NvO2eeJg-6kDJjtSsRjF-thV4qEZjtANwVvEA");
	    
	    driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com");
	}
	
//   @Test (enabled = false)
     @Test (priority=2)
	  public void Create_New_Expert() throws InterruptedException
	  {
		  	driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/experts");
		  	driver.manage().window().maximize();
	    	
	    	Thread.sleep(3000);
	    	// load
	    	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
			load.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-colindex='0']"))).click();
	    	
		
			System.out.println("Expert -> Verifying Verifying Create New Expert With All Information**************");
			Reporter.log("Expert ->Verifying Create New Expert With All Information");
			
			WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();

			WebDriverWait create_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
			create_expert.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Create Expert']"))).click();
		
			Thread.sleep(1000);
			 
		    driver.findElement(By.id("expert-name")).sendKeys(expert_name2);
		        
//		 // headshot image select
//		    WebElement headshot = driver.findElement(By.xpath("//p[text()='Expert Headshot']"));
//		    headshot.click();
//		    
//		    WebDriverWait wait_hs = new WebDriverWait(driver, Duration.ofSeconds(30));
//		    wait_hs.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[13]/div/div/p")));
//		    
//		    
//		    WebElement select_img = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[13]/div/div/p"));
//		    select_img.click();
//		
//		    WebElement select_button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
//		    select_button.click();
//		    
//		    //wideshot image select
//		    
//		    WebElement wideshot = driver.findElement(By.xpath("//p[text()='Expert Wideshot']"));
//		    wideshot.click();
//		    
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img")));
//		  
//		    WebElement select_img2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img"));
//		    select_img2.click();
//		
//		    WebElement select_button2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
//		    select_button2.click();
		
			driver.findElement(By.id("slug")).sendKeys(expert_slug2);
		    
		     
		    //expert pick collection 
		    // click  
		    WebDriverWait click_pick = new WebDriverWait(driver, Duration.ofSeconds(30));
		    click_pick.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='expert-pick-list']"))).click();
				    
		    // select 
			WebDriverWait select_pick = new WebDriverWait(driver, Duration.ofSeconds(30));
			select_pick.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/ul/li[1]"))).click();
		
		    //bio
			driver.findElement(By.id("expert-bio")).sendKeys(expert_bio2);
			
			// tag
		    WebElement tag_button = driver.findElement(By.xpath("//p[text()='Tags']"));
	        tag_button.click();
		    
	        Thread.sleep(1000);
	       
		    WebElement tag_topic = driver.findElement(By.xpath("//label[text()='Stage']"));
		    tag_topic.click();
		    
		    Thread.sleep(1000);
		    
		    WebElement selectbutton = driver.findElement(By.xpath("//button[text()='Select']"));
		    selectbutton.click();
			
		    Thread.sleep(1000);
			
			 // tags count
		     expert_tagcount2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/div[7]/div/button")).getText();
			 System.out.println("the tag count is __________________"+expert_tagcount2); 
			
			 Thread.sleep(1000);
			    
			 WebElement zip_click = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/div[8]/div/div"));
			 zip_click.click();
			 
			 WebElement zip_select = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"));
			 zip_select.click();
			 
			 Thread.sleep(5000);
			 
			 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			
			 
			 Thread.sleep(10000);
			 
			

	
	 }
//   @Test (enabled = false)
     @Test (priority=3)
      public void add_expert_in_collection() throws InterruptedException
      {
    	 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
 		 driver.manage().window().maximize();
 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		    
 		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
 		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
 		    
 		 System.out.println("Search the 'meet our expert' and add the expert in same");
		 Reporter.log("Search the 'meet our expert' and add the expert in same");
		 
		 WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox.sendKeys(search_expert);
		 
		Thread.sleep(4000);
		        
		 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
 		 
		 //click expert  
		 
		 WebElement click_expert=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[5]/div/div/input"));
		 click_expert.sendKeys(expert_name2);
 		 
		 WebDriverWait select_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
		 select_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
 		    
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
			    	
		 
		 Thread.sleep(5000);
		 
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
		
		 Thread.sleep(5000);
 		 
      }
      
      
      
	  
//		@Test (enabled = false)
		@Test (priority=4)
		public void website_login() throws InterruptedException
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
		
		
		
	  
//		@Test (enabled = false)
		@Test (priority=5)
		public void verify_the_created_expert_in_website() throws InterruptedException
		{
					driver.get("https://client-portal.us-east-1.dev.mediflix.com/advice");
					driver.manage().window().maximize();
//					 Actions act = new Actions(driver);
					//click search 
			
					System.out.println("Verify the created expert and in website********************");
		
					WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
				    load1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/button")));
						
				    //scroll down
				    JavascriptExecutor js = (JavascriptExecutor)driver; 
				    js.executeScript("window.scrollBy(0,400)");
				    
				    WebElement click_arrow =driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/button[2]"));
				    click_arrow.click();
				    
				    Thread.sleep(4000);
				    
				    //click expert    
				    
				    WebDriverWait select_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
					select_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[10]/div/div/div[1]"))).click();
			 		    
					//load   
					WebDriverWait load_expert_page = new WebDriverWait(driver, Duration.ofSeconds(30));
					load_expert_page.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"))).click();
			 		    
					//verify
					
					//name
					String expert =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
				    System.out.println("expert name is __________________"+expert);
				    
				    if(expert.equals(expert_name2))
					{
						System.out.println("Expert name is same");
						AssertJUnit.assertEquals(expert, expert_name2);
					}
					else
					{
						System.out.println("Expert name is not same");
						AssertJUnit.assertEquals(expert, expert_name2);
						Reporter.log( "[ERROR] -> Browse -> Advice -> Expert page -> Expert Name Is Not Same.");
					}
					
					//bio
					
				    String bio =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/p[2]")).getText();
				    System.out.println("expert bio is __________________"+expert_bio2);
				    
				    if(bio.equals(expert_bio2))
					{
						System.out.println("Expert bio is same");
						AssertJUnit.assertEquals(bio, expert_bio2);
					}
					else
					{
						System.out.println("Expert expert_bio2 is not same");
						AssertJUnit.assertEquals(bio, expert_bio2);
						Reporter.log( "[ERROR] -> Browse -> Topic -> Expert page -> Expert Bio Is Not Same.");
					}
					
		} 
	
	
	

}
