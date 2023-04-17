Feature: SignUp functionality

@Smoke
Scenario: Verify the signup functionality with valid credentials
Given User launch URL
When user accept all cookies
And Accept age verification
And go to signInRegister
And Click on Create account
And user enters valid credentials