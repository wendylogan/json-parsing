# json-parsing
This Java application is built with Ant and uses the Java library gson-2.9.1.jar to test the method “setPrettyPrinting(), practice parsing Strings into JSON, and parsing JSON into Strings.

The project takes Strings from a hard-coded Array to create Student objects. Each Student has a last name, first name, GPA, phone number, and a list of skills.

**Output:**  
```
[  
	{  
		"firstName": "Don",  
		"lastName": "Juan",  
		"gpa": 3.3,
		"phoneNumber": {  
			"areaCode": 888,  
			"prefix": 555,  
			"lineNum": 1212  
		},  
		"skills": [  
		"snoozing",  
		"dreaming"  
		]  
	},  
	{  
		"firstName": "Tom",  
		"lastName": "Jones",  
		"gpa": 3.5,  
		"phoneNumber": {  
			"areaCode": 866,  
			"prefix": 555,  
			"lineNum": 1212  
		},  
		"skills": [  
			"kayaking",  
			"surfing",  
			"hiking"  
		]
	},  
	{  
		"firstName": "Emma",  
		"lastName": "Woodhouse",  
		"gpa": 3.9,  
		"phoneNumber": {  
			"areaCode": 860,  
			"prefix": 555,  
			"lineNum": 1212  
		},  
		"skills": [  
			"Java",  
			"Python",  
			"Javascript"  
		]  
	}  
]
  
[firstName: Don, lastName: Juan, gpa: 3.3, phoneNumber: (888) 555-1212, skills: [[dreaming, snoozing]  
[firstName: Tom, lastName: Jones, gpa: 3.5, phoneNumber: (866) 555-1212, skills: [[hiking, kayaking, surfing]  
[firstName: Emma, lastName: Woodhouse, gpa: 3.9, phoneNumber: (860) 555-1212, skills: [[Java, Javascript, Python]
```
