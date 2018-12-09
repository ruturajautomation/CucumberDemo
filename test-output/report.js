$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Pranay/eclipse-workspace/DemoNew/src/main/java/Seleniumdemo/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Try to Learn Automation",
  "description": "",
  "id": "try-to-learn-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login and find the Automation",
  "description": "",
  "id": "try-to-learn-automation;login-and-find-the-automation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of login page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on facebook",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "try-to-learn-automation;login-and-find-the-automation;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "try-to-learn-automation;login-and-find-the-automation;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 19,
      "id": "try-to-learn-automation;login-and-find-the-automation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Login and find the Automation",
  "description": "",
  "id": "try-to-learn-automation;login-and-find-the-automation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of login page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on facebook",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "DealStepDefinitionMap.User_is_already_on_login_page()"
});
formatter.result({
  "duration": 47464837006,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinitionMap.title_of_login_page_facebook()"
});
formatter.result({
  "duration": 45705221,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "DealStepDefinitionMap.user_enters_and(String,String)"
});
formatter.result({
  "duration": 5557791824,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinitionMap.user_clicks_on_facebook()"
});
formatter.result({
  "duration": 2430927228,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinitionMap.Close_the_browser()"
});
formatter.result({
  "duration": 2142170917,
  "status": "passed"
});
});