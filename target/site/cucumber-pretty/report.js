$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTest/smokeTestPack-UAT/Test6.feature");
formatter.feature({
  "line": 2,
  "name": "SmokeTest",
  "description": "",
  "id": "smoketest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test6UAT"
    },
    {
      "line": 1,
      "name": "@Smoketest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating an new ServiceRequest",
  "description": "",
  "id": "smoketest;creating-an-new-servicerequest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user log in to Maximo System",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on \u0027GOTO\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \u0027Service Desk\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on \u0027Service Requests(SP)\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user navigated to \u0027Service Requests(SP)\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on plus button to create a new Service Request form",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user fill the new Service Request form",
  "rows": [
    {
      "cells": [
        "Name",
        "Customer",
        "Location",
        "summary",
        "classification",
        "details",
        "reportedByPhone",
        "reportedByEmail",
        "customerReference",
        "customerReference2"
      ],
      "line": 12
    },
    {
      "cells": [
        "SmokeTest-6",
        "C1000011",
        "L1001455",
        "Test SR creation",
        "REACTIVE \\ BUILDING FABRIC \\ GLAZING \\ GLASSEXT",
        "Test6",
        "07776023458",
        "test@email.com",
        "123",
        "7345"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on \u0027Save ServiceRequest\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user copy the SR Number",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on \u0027Route Workflow\u0027 button and accept the alert",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_log_in_to_Maximo_System()"
});
formatter.result({
  "duration": 17091565800,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_GOTO_button()"
});
formatter.result({
  "duration": 2397025900,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Service_Desk_link()"
});
formatter.result({
  "duration": 2191073500,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Service_Requests_SP_link()"
});
formatter.result({
  "duration": 2083185800,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_navigated_to_Service_Requests_SP_page()"
});
formatter.result({
  "duration": 38929000,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_plus_button_to_create_a_new_Service_Request_form()"
});
formatter.result({
  "duration": 3521311900,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userFillTheNewServiceRequestFormForQuote(DataTable)"
});
formatter.result({
  "duration": 27944741599,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Save_ServiceRequest_button()"
});
formatter.result({
  "duration": 1169888600,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userCopyTheSRNumber()"
});
formatter.result({
  "duration": 2189243300,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userClicksOnRouteWorkflowButtonAndAcceptTheAlert()"
});
formatter.result({
  "duration": 2777886600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify the WorkOrder",
  "description": "",
  "id": "smoketest;verify-the-workorder",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user clicks on \u0027Work\u0027 tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user verify the \u0027WorkOrder\u0027Number",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user search for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user add the labour details in \u0027Assignment\u0027 section",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks on \u0027Workflow\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userClicksOnWorkTab()"
});
formatter.result({
  "duration": 2090493300,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userVerifyTheWorkOrderNumber()"
});
formatter.result({
  "duration": 7055619200,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "duration": 11059003900,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userAddTheLabourDetailsInAssignmentSection()"
});
formatter.result({
  "duration": 5721029000,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userClicksOnWorkflowButton()"
});
formatter.result({
  "duration": 6444205100,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Move WorkOrder to Completed Status",
  "description": "",
  "id": "smoketest;move-workorder-to-completed-status",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user verify the status of the WorkOrder changes to \u0027Dispatch\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user search for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user set the Actual Start Date for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user set the Actual Finish Date for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user applies the \u0027mobileoverride\u0027 option to WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user \u0027save\u0027 the Work Order",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user search for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user verified that the workorder status move to \u0027Travel\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user search for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user verified that the workorder status move to \u0027on site\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user verified that the workorder status move to \u0027Start\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user verified that the workorder status move to \u0027WOcomplete\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "user verified that the workorder status move to \u0027Completed\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkOrderCreationSteps.userVerifyTheStatusOfTheWorkOrderChangesToDispatch()"
});
formatter.result({
  "duration": 11996193700,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "duration": 10012518600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.userSetTheActualStartDateForWorkOrder()"
});
formatter.result({
  "duration": 3280325700,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.userSetTheActualFinishDateForWorkOrder()"
});
formatter.result({
  "duration": 1605517300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.user_applies_the_mobileoverride_option_to_WorkOrder()"
});
formatter.result({
  "duration": 856647100,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.userSaveTheWorkOrder()"
});
formatter.result({
  "duration": 97370099,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "duration": 32438023199,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027tamatch\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027INT3244\u0027, ip: \u002710.206.37.221\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\dmarella\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54402}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: caf5aed33343a53b39ed4e1c6cb640a2\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027tamatch\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.automationtest.pages.HomePage.searchforWorkOrder(HomePage.java:111)\r\n\tat com.automation.stepDefinations.WorkOrderCreationSteps.userSearchForWorkOrder(WorkOrderCreationSteps.java:70)\r\n\tat ✽.And user search for WorkOrder(SmokeTest/smokeTestPack-UAT/Test6.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userVerifiedThatTheWorkorderStatusMoveToTravel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.user_verified_that_the_workorder_status_move_to_on_site()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userVerifiedThatTheWorkorderStatusMoveToStart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.user_verified_that_the_workorder_status_move_to_WOcomplete()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.user_verified_that_the_workorder_status_move_to_Completed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 45,
  "name": "Move the WorkOrder to FINCOMP status",
  "description": "",
  "id": "smoketest;move-the-workorder-to-fincomp-status",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "user have option to select Documentation checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user verified that the workorder status move to \u0027FINAPP\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user workflow the Workorder",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user verified that the workorder status move to \u0027FINCOMP\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "duration": 2268800299,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.user_have_option_to_select_Documentation_checkbox()"
});
formatter.result({
  "duration": 33053716300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[text() \u003d\u0027Close\u0027 and @id\u003d\u0027m15f1c9f0-pb\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027INT3244\u0027, ip: \u002710.206.37.221\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\dmarella\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54402}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: caf5aed33343a53b39ed4e1c6cb640a2\n*** Element info: {Using\u003dxpath, value\u003d//button[text() \u003d\u0027Close\u0027 and @id\u003d\u0027m15f1c9f0-pb\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat com.automationtest.pages.ServiceRequestPage.AccepttheAlert(ServiceRequestPage.java:280)\r\n\tat com.automation.stepDefinations.CustomerBillingSteps.user_have_option_to_select_Documentation_checkbox(CustomerBillingSteps.java:89)\r\n\tat ✽.Then user have option to select Documentation checkbox(SmokeTest/smokeTestPack-UAT/Test6.feature:47)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.user_verified_that_the_workorder_status_move_to_FINAPP()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.user_verified_that_the_workorder_status_move_to_FINCOMP()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 53,
  "name": "Adding Labour and travel time in Actuals",
  "description": "",
  "id": "smoketest;adding-labour-and-travel-time-in-actuals",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 54,
  "name": "user search for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user clicks on \u0027Actuals\u0027 tab",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 56,
      "value": "#Then user verifies that \u0027Actuals\u0027 session"
    }
  ],
  "line": 57,
  "name": "user clicks on \u0027NewRow\u0027 button in labor section",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user add the labor and shift details for Travel type",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user clicks on Save button",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "user clicks on \u0027NewRow\u0027 button in labor section",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user add the labor and shift details for Onsite type",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user clicks on Save button",
  "keyword": "When "
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "duration": 34188571699,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027tamatch\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027INT3244\u0027, ip: \u002710.206.37.221\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\dmarella\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54402}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: caf5aed33343a53b39ed4e1c6cb640a2\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027tamatch\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.automationtest.pages.HomePage.searchforWorkOrder(HomePage.java:111)\r\n\tat com.automation.stepDefinations.WorkOrderCreationSteps.userSearchForWorkOrder(WorkOrderCreationSteps.java:70)\r\n\tat ✽.And user search for WorkOrder(SmokeTest/smokeTestPack-UAT/Test6.feature:54)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ActualsSteps.userClicksOnActualsTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ActualsSteps.userClicksOnNewRowButtonInLaborSection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ActualsSteps.userAddTheLaborAndShiftDetailsForTravelType()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ActualsSteps.userClicksOnSaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ActualsSteps.userClicksOnNewRowButtonInLaborSection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ActualsSteps.userAddTheLaborAndShiftDetailsForOnsiteType()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ActualsSteps.userClicksOnSaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 63,
      "value": "#And user clicks on \u0027NewRow\u0027 button in labor section"
    },
    {
      "line": 64,
      "value": "#And user the labor and workstart and finish time for Work type"
    },
    {
      "line": 65,
      "value": "#When user clicks on Save button"
    },
    {
      "line": 66,
      "value": "#And user clicks on \u0027NewRow\u0027 button in labor section"
    },
    {
      "line": 67,
      "value": "#And user add the labor and shift details for WOCOMP type"
    },
    {
      "line": 68,
      "value": "#When user clicks on Save button"
    }
  ],
  "line": 73,
  "name": "Create Customer Billing",
  "description": "",
  "id": "smoketest;create-customer-billing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 74,
  "name": "user search for Customer Billing page",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "user clicks on + button to create a new Customer Billing",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "user enters all details in Customer Billing page and workflow",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user select workorder and uncheck \u0027copy bill lines\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "user go to \u0027Customer Billing\u0027 page and serach for Bill Batch",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "user approve the BillBatch",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerBillingSteps.userSearchForCustomerBillingPage()"
});
formatter.result({
  "duration": 32273955800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027tamatch\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027INT3244\u0027, ip: \u002710.206.37.221\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\dmarella\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54402}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: caf5aed33343a53b39ed4e1c6cb640a2\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027tamatch\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.automationtest.pages.HomePage.searchforCustomerBilling(HomePage.java:128)\r\n\tat com.automation.stepDefinations.CustomerBillingSteps.userSearchForCustomerBillingPage(CustomerBillingSteps.java:107)\r\n\tat ✽.When user search for Customer Billing page(SmokeTest/smokeTestPack-UAT/Test6.feature:74)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CustomerBillingSteps.userClicksOnButtonToCreateANewCustomerBilling()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userEntersAllDetailsInCustomerBillingPageAndWorkflow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userSelectWorkorderAndUncheckCopyBillLines()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userGoToCustomerBillingPageAndSerachForBillBatch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userApproveTheBillBatch()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 81,
  "name": "Bill Review and Bill Batch Posted",
  "description": "",
  "id": "smoketest;bill-review-and-bill-batch-posted",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 82,
  "name": "user go to \u0027Bill Review\u0027 page and serach for Bill Batch",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "user verifies changes the BillBatch status to \u0027Approved By Customer\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "user opens the Batch and Workflow",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "user verifies that the Bill batch status changes to Posted",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerBillingSteps.userGoToBillReviewPageAndSerachForBillBatch()"
});
formatter.result({
  "duration": 33475856000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027tamatch\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027INT3244\u0027, ip: \u002710.206.37.221\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\dmarella\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54402}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: caf5aed33343a53b39ed4e1c6cb640a2\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027tamatch\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.automationtest.pages.HomePage.searchforBillReview(HomePage.java:135)\r\n\tat com.automation.stepDefinations.CustomerBillingSteps.userGoToBillReviewPageAndSerachForBillBatch(CustomerBillingSteps.java:142)\r\n\tat ✽.When user go to \u0027Bill Review\u0027 page and serach for Bill Batch(SmokeTest/smokeTestPack-UAT/Test6.feature:82)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CustomerBillingSteps.userVerifiesChangesTheBillBatchStatusToApprovedByCustomer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userOpensTheBatchAndWorkflow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerBillingSteps.userVerifiesThatTheBillBatchStatusChangesToPosted()"
});
formatter.result({
  "status": "skipped"
});
});