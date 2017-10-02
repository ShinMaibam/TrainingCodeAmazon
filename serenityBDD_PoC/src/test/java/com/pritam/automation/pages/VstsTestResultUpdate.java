package com.pritam.automation.pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
//import org.json.JSONArray;
//import org.json.JSONObject;
import org.json.JSONObject;

import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;

public class VstsTestResultUpdate {

	static DefaultHttpClient httpclient = new DefaultHttpClient();

	public static int createTestRun(int testPointId, int testPlanId) throws IOException, IOException {
		int runid;
		HttpPost postRequest = new HttpPost("");
		String req = createRunRequest(testPointId, testPlanId);
		StringEntity input = new StringEntity(req);
		input.setContentType("application/json");

		postRequest.addHeader("Authorization", "Basic {Personal Token from VSTS}");
		// Basic OnZrzdsdfasfasfasfsafafafwecscsHE=
		postRequest.addHeader("Content-Type", "application/json");
		postRequest.setEntity(input);

		HttpResponse response = httpclient.execute(postRequest);

		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

		String output;
		output = br.readLine();

		JSONObject myObject = new JSONObject(output);

		runid = myObject.getInt("id");
		return runid;
	}

	public static String createRunRequest(int pointid, int testPlanId) {
		String runreq = null;
		JSONObject object = new JSONObject();
		object.put("name", VstsTestResultUpdate_abcproject.scenarioName); //page class
		JSONObject plan = new JSONObject();
		plan.put("id", testPlanId);
		object.put("plan", plan);
		object.put("state", "NotStarted");

		JSONArray array = new JSONArray();
		array.put(0, pointid);

		object.put("pointIds", array);
		runreq = object.toString();

		return runreq;
	}

	public static void updateTestResult(int runid, String status) throws IOException {
		HttpPatch httpPatch = new HttpPatch(
				"https://serverpath/_apis/test/runs/" + runid + "/results?api-version=2.0-preview");

		String req = updateResultReq(status);
		StringEntity input = new StringEntity(req);
		input.setContentType("application/json");

		httpPatch.addHeader("Authorization", "Basic {personal token from vsts}");
		httpPatch.addHeader("Content-Type", "application/json");
		httpPatch.setEntity(input);

		HttpResponse response = httpclient.execute(httpPatch);
		HttpEntity enty = response.getEntity();

		if (enty != null)
			enty.consumeContent();
	}

	public static String updateResultReq(String Status) {

		String req = null;
		JSONObject object = new JSONObject();
		JSONObject testresult = new JSONObject();
		testresult.put("id", 100000);
		object.put("testResult", testresult);
		object.put("state", "Completed");
		object.put("outcome", Status);
		JSONArray array = new JSONArray();
		array.put(0, object);
		req = array.toString();
		return req;
	}

	public static void updateTestRun(int runid) throws IOException {
		HttpPatch httpPatch = new HttpPatch("" + runid + "?api-version=2.0-preview");
		String req = updateRunReq();
		StringEntity input = new StringEntity(req);
		input.setContentType("application/json");

		httpPatch.addHeader("Authorization", "Basic {personal token id from vsts}");
		httpPatch.addHeader("Content-Type", "application/json");
		httpPatch.setEntity(input);

		HttpResponse response = httpclient.execute(httpPatch);
		HttpEntity enty = response.getEntity();

		if (enty != null)
			enty.consumeContent();

	}

	public static String updateRunReq() {
		String req = null;
		JSONObject object = new JSONObject();
		object.put("state", "Completed");
		req = object.toString();
		return req;
	}

}
