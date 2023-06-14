Feature: Adding New Individual in salesforce application

Scenario Outline: CreateIndividual
Given Enter the username as <UserName>
And Enter the password as <Password>
When Click on Login button
Then Verify logon successful
When Click on toggle menu button
And click View All
And click Individuals from App Launcher
And Click on Dropdown icon in the Individuals tab
And Click on New Individual
Given Enter the Lastname as <Lastname>
When Click on Save in the new Individual add screen
Then Verify Individual created as <Lastname>

Examples:
|UserName|Password|Lastname|
|hari.radhakrishnan@qeagle.com|Leaf@1234|Kumar|
|hari.radhakrishnan@qeagle.com|Leaf@1234|Kumaras|

