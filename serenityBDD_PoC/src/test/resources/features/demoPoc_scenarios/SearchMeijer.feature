Feature: For poc in meijer.com

@testRun1
 Scenario: To verify Meijer
 Given user launch MeijerDotCom
 When the user searches for a product
 Then the user should be in Product Listing page