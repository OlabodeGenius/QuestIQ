**Trivia API**
The Open Trivia Database provides a completely free JSON API for use in programming projects. Use of this API does not require a API Key, just generate the URL below use it in your own application to retrieve trivia questions.

All data provided by the API is available under the Creative Commons Attribution-ShareAlike 4.0 International License


**Getting Started**
To get started using the Open Trivia DB API, use this URL:
https://opentdb.com/api.php?amount=10
For more settings or help using the API, read along below. Alternatively, you can use the helper form to craft your specific query.

**Session Tokens**
Session Tokens are unique keys that will help keep track of the questions the API has already retrieved. By appending a Session Token to a API Call, the API will never give you the same question twice. Over the lifespan of a Session Token, there will eventually reach a point where you have exhausted all the possible questions in the database. At this point, the API will respond with the appropriate "Response Code". 
From here, you can either "Reset" the Token, which will wipe all past memory, or you can ask for a new one.


**Helper API Tools**
There are some functions in the API which can be useful to developers.

Category Lookup: Returns the entire list of categories and ids in the database.
https://opentdb.com/api_category.php

Category Question Count Lookup: Returns the number of questions in the database, in a specific category.
https://opentdb.com/api_count.php?category=CATEGORY_ID_HERE

Global Question Count Lookup: Returns the number of ALL questions in the database. Total, Pending, Verified, and Rejected.
https://opentdb.com/api_count_global.php

**Limitations**
Only 1 Category can be requested per API Call. To get questions from any category, don't specify a category.
A Maximum of 50 Questions can be retrieved per call.
